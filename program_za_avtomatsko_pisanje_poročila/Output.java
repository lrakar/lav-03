import java.io.*;
import java.util.*;
public class Output {
    static String line;
    static String outputContent;

    public void set(){
        PorociloGenerator main = new PorociloGenerator();
        Files myFiles = new Files();
        Folders myFolders = new Folders();
        Code myCode = new Code();
    }
    public void writeOutputContent(){
        set();
        String command = "cmd /c cd" + myFolders.folderName + "/c javac" + myFiles.fileName + "/c java" + myFiles.fileName + " " +
        Code.argsOnRun; 

        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = reader.readLine()) != null) {
            outputContent = line + "\n";    
        }
        reader.close();

        main.pw.println(outputContent);
    }
}
