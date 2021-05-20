import java.io.*;
import java.util.*;
public class PorociloGenerator{
    static int i; // stevec i
    static int k; // stevec k
    public static void main(String[] args) throws IOException{ // MAIN
        //instancirajmo moje klase
        Files myFiles = new Files();
        Folders myFolders = new Folders();
        Output myOutput = new Output();
        Code myCode = new Code();
        Comments myComments = new Comments();




        myFolders.getPathsMaster(); //pridobimo pot do porocila
        
        for(i = 0; i<Folders.sumAllFolders; i++){
            myFolders.writeName();
                for(int k = 0; k<Files.sumAllFiles; k++){
                    myFiles.writeJavaFileName();
                    pw.println("### koda: ");
                    pw.println("```java");
                    myCode.writeCodeContent();
                    pw.println("```");
                    pw.println("### output: ");
                    pw.println("```");
                    myOutput.writeOutputContent();
                    pw.println("```");
                    pw.println("### komentarji in odgovori na vprašanja");
                    myComments.writeComments();
                }
            }
            pw.close();
    }
}