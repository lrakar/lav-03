import java.io.*;
import java.util.*;
public class Tools {

    public void make(){
        Folders myFolders = new Folders();
        myFolders.getPathsMaster();

        File f = new File("C:\\java\\vaje_04");
        FileWriter fw = new FileWriter(f);

        PrintWriter pw = new PrintWriter(fw);
    }
    


}
