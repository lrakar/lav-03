import java.io.*;
import java.util.*;
public class Comments {
    public static String comments;
    public static boolean commentEnabler;
    public static int commentLineCounter;
    public static int commentcounter;

    public void set(){
        public Code myCode = new Code();
        public PorociloGenerator main = new PorociloGenerator();
    }
    public void commentChecker(){
        set();
        if(izvor.lineCounter == 0){
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
        set();
        if(commentEnabler == true){
            comments = comments + ">" + Code.dataOnLine + "\n";
            commentcounter++;
        }
    }

    public void writeComments(){
        set();
        main.pw.println(comments);
    }
}
