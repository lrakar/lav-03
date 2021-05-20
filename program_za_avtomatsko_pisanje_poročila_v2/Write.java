import java.io.*;
public class Write{
    public PrintWriter pw;

    public void printWriter(){
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
