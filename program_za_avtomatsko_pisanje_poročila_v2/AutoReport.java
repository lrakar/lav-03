import java.io.*;
import java.util.*;
public class AutoReport{
    public static int i;
    public static int k;
    public static Folders myFolders;
    public static Write wr;

    public static void main(String[] args) {
        Folders.init();

        myFolders = new Folders();
        wr = new Write();

        wr.printWriter();
        for(int i = 0; i<Folders.listFolders.length; i++){
            var folder = Folders.getFolder(i);
            wr.pw.println(Folders.getFolderName(i));

            for(int k = 0; k<folder.listFiles().length; k++){
                wr.pw.println(folder.listFiles()[k] + "\n");
            }
        }
        wr.pw.close();
        
    }
}