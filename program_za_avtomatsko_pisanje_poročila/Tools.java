import java.io.*;
import java.util.*;
public class Tools {
    public PrintWriter pw;

    public void make(){
        Folders myFolders = new Folders();
        myFolders.getPathsMaster();
        
        try {
            File f = new File("C:\\java\\Porocilo_RSO\\porocilo.md");
            FileWriter fw = new FileWriter(f);
            pw = new PrintWriter(fw);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    


}
