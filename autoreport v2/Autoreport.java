import java.io.*;
import java.util.*;
public class Autoreport{
    static String comments;
    static File myFile;
    static String[] files;
    static PrintWriter pw;
    static Scanner readLine;
    static int lineCounter = 0;
    static String argsOnRun;
    static boolean commentEnabler;

    public static void main(String[] args) throws IOException {
        String masterDirPath = "C:\\java\\vaje_04";
        File porociloFile = new File("C:\\java\\Porocilo_RSO\\porocilo.md");
        File masterdir = new File(masterDirPath);
        PrintWriter porociloWriter = new PrintWriter(new FileWriter(porociloFile));

        String[] folders = masterdir.list();
        for(int i = 0; i<masterdir.list().length; i++){
            String folderPath = masterDirPath + "\\" + folders[i];
            File folder = new File(folderPath);

            // Print folder title
            String title = formatTitle(folders[i]);
            porociloWriter.println(title);
            
            String[] files = folder.list();
            for(int j=0; j<files.length; j++){
                String fileName = files[j];
                String fileTitle = formatFileTitle(fileName);
                
                // Print code
                if (isCodeFile(fileName)){
                    // Print file title
                    porociloWriter.println(fileTitle);
                    
                    // Print code from file
                    String filePath = folderPath + "\\" + fileName;
                    String fileContent = readFile(filePath);
                    String code = formatCode(fileContent);
                    porociloWriter.println(code);

                    // Compile code file, run it and print output
                    String output = getOutput(folderPath, fileName, fileContent);
                    porociloWriter.println(output);
                }
            
                System.out.println("Finished " + fileName);
            }

            // Print comments
            System.out.println("Finished " + folderPath);
        }
        porociloWriter.close();
    }

    public static String formatTitle(String title) {
        title = title.substring(2);
        String firstLetter = title.substring(0, 1).toUpperCase();
        title = firstLetter + title.substring(1);
        title = "# " + title;
        return title;
    }

    public static String formatFileTitle(String title) {
        String firstLetter = title.substring(0, 1).toUpperCase();
        title = firstLetter + title.substring(1);
        title = "## " + title;
        return title;
    }

    public static Boolean isCodeFile(String fileName) {
        if (fileName.endsWith(".java")) return true;
        else return false;
    }

    public static String readFile(String filePath) throws IOException {
        Scanner fileScanner = new Scanner(new File(filePath));
        String fileContent = "";

        while(fileScanner.hasNextLine()){
            fileContent += fileScanner.nextLine() + "\n";
        }
        fileScanner.close();
        return fileContent;
    }

    public static String formatCode(String fileContent) {
        fileContent = "```java\n" + fileContent;
        fileContent += "```";
        return fileContent;
    }
    
    public static String getOutput(String folderPath, String fileName, String fileContent) throws IOException {
        String openTerminal = "cmd /c ";
        String navigateFile = "cd " + folderPath + " && ";
        String compileFile = "javac " + fileName + " && ";
        String runFile = "java " + fileName.substring(0, fileName.length()-5) + " ";
        String arguments = getCommentArguments(fileContent);
        String command = openTerminal + navigateFile + compileFile + runFile + arguments;
 
        Process process = Runtime.getRuntime().exec(command);
    
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
        writer.close();
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String output = "## Output \n```java\n";
        String line;
        while ((line = reader.readLine()) != null) {
            output += line + " \n";
        }
        reader.close();
        output += "\n```\n\n";

        return output;
    }

    public static String getCommentArguments(String fileContent) throws IOException {
        int indexOfStartInput = fileContent.indexOf("// args: ") + 9;
        int endOfLine = fileContent.indexOf("\n");

        String arguments = "";
        if (indexOfStartInput > 0 && endOfLine > 0){
            arguments = fileContent.substring(indexOfStartInput, endOfLine);
        }

        return arguments;
    }
}