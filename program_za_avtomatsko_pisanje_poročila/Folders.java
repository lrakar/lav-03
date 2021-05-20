import java.io.*;
import java.util.*;
public class Folders {
    public static int sumAllFolders; //stevilo vseh map
    public static String[] listFolders; //imena vseh map
    public static String folderName; //samo ime trenutne mape
    public static String folderPath; //samo pot do trenutne mape

    public File porocilo;
    public File masterdir;

    public void getPathsMaster(){
        porocilo = new File("C:\\java\\Porocilo_RSO\\porocilo.md"); // class File s potjo do poročila
        masterdir = new File("C:\\java\\vaje_04"); // class File s potjo do master direktorija
    }
    public void set(){
        PorociloGenerator main = new PorociloGenerator();
        listFolders = masterdir.list(); //vsa imena map se shranijo v arraye
        sumAllFolders = masterdir.list().length; //povemo stevilo vseh map
        folderName = listFolders[PorociloGenerator.i];//povemo ime trenutne mape(pri i-ju)
        folderPath = file.getAbsolutePath(masterdir.toString() + "\\" +folderName);// povemo pot trenutne mape
    }
    public void writeName(){
        set();
        //pisemo v porocilo ime mape
        main.pw.println(" "); //enter
        main.pw.printf("# %s", folderName.substring(2));//substring brez cifer za urejanje (01,02,03)
        main.pw.println(" "); //enter
    }
}
