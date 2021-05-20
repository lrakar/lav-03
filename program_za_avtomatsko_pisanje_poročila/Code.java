import java.util.*;
import java.io.*;
public class Code {
    public static String argsOnRun;
    public static String dataOnLine;

    public void set(){
        public Files myFiles = new Files();
        public Comments myComments = new Comments();
        public PorociloGenerator main = new PorociloGenerator();
    }

    public void writeCodeContent(){
        set();
        if(Files.zapisiNalogo == true){ 
            //pisemo v porocilo kodo:

            //skopiramo kodo iz posamezne naloge
            Scanner readCodeLine = new Scanner(myFiles.filePath);
            int codeLineCounter = 0;
            while(readCodeLine.hasNextLine()){
                myComments.commentChecker();
                myComments.writeDownComments();
                dataOnLine = readCodeLine.nextLine();
                main.pw.println(dataOnLine);
                codeLineCounter++;
            }
            
        }
    }
}
