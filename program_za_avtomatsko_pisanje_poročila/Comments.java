import java.io.*;
import java.util.*;
public class Comments {
    public static String comments;
    public static boolean commentEnabler;
    public static int commentLineCounter;
    public static int commentcounter;
    public Code myCode = new Code();
    public PorociloGenerator main = new PorociloGenerator();
    public Tools tool = new Tools();

    public void commentChecker(){
        if(myCode.lineCounter == 0){
            Code.argsOnRun = Code.dataOnLine;
            Code.argsOnRun = Code.argsOnRun.replaceAll("// args: ", "");
        }
        if(Code.dataOnLine == "//<startComments>"){
            commentEnabler = true;
        }
        if(Code.dataOnLine == "//</endComments>"){
            commentEnabler = false;
        }
        
    }

    public void writeDownComments(){
        if(commentEnabler == true){
            comments = comments + ">" + Code.dataOnLine + "\n";
            commentcounter++;
        }
    }

    public void writeComments(){
        tool.make();
        tool.pw.println(comments);
    }
}
