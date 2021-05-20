import java.util.*;
import java.io.*;
public class Code {
    public int lineCounter;
    public static String argsOnRun;
    public static String dataOnLine;
    public Files myFiles = new Files();
    public Comments myComments = new Comments();
    public PorociloGenerator main = new PorociloGenerator();
    public Tools tool = new Tools();

    public void writeCodeContent(){
        if(Files.zapisiNalogo == true){ 
            //pisemo v porocilo kodo:

            //skopiramo kodo iz posamezne naloge
            Scanner readCodeLine = new Scanner(myFiles.filePath);
            lineCounter = 0;
            while(readCodeLine.hasNextLine()){
                myComments.commentChecker();
                myComments.writeDownComments();
                dataOnLine = readCodeLine.nextLine();
                tool.make();
                tool.pw.println(dataOnLine);
                lineCounter++;
            }
            
        }
    }
}
