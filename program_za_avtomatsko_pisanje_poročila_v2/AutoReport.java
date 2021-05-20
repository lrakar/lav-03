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
            wr.pw.println(Folders.getName(i));
        }
        wr.pw.close();
        
    }
}