import java.io.*;
import java.util.*;
public class Files {
    public static int sumAllFiles; //stevilo vseh dat v neki mapi
    public static String filePath; // pot do trenutne naloge
    public static String[] listFiles; // shranimo imena vseh datotek v array
    public static String fileName; // samo ime fajla
    public static boolean zapisiNalogo;
    public Folders myFolders = new Folders();
    public PorociloGenerator main = new PorociloGenerator();

    public void set(){
        listFiles = myFolders.folderPath.list();
        fileName = listFiles[PorociloGenerator.k];
        sumAllFiles = listFiles.length;
        filePath = myFolders.folderPath + "\\" + fileName;
    }

    public void writeJavaFileName(){
        set();
        if(fileName.endsWith(".java") == true){ // v porocilo pisemo samo datoteke s koncnico .java
            public String removeJava = fileName.substring(0, fileName.length() - 5); // v naslovu ne potrebujemo končnice.java
            main.pw.printf("## %s", removeJava); 
            main.pw.println(" ");
            zapisiNalogo = true;
        }

        else{
            zapisiNalogo = false;
        }
    }
}
