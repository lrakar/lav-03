import java.io.*;
import java.util.*;
public class Autoreport{
    static String masterDirPath = "C:\\java\\vaje_04";
    static File porociloFile = new File("C:\\java\\Porocilo_RSO\\porocilo.md");

    public static void main(String[] args) throws IOException {
        File masterdir = new File(masterDirPath);
        PrintWriter porociloWriter = new PrintWriter(new FileWriter(porociloFile));

        // Print initial information
        String info = "#### Author: Lovro Rakar \n #### Menthor: Marko Kastelic \n #### Version: 3.0.0.0";
        porociloWriter.println(info);

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
                
                if (isCodeFile(fileName)){
                    printFileToPorocilo(porociloWriter, folderPath, fileName);
                }
            
                System.out.println("Finished " + fileName);
            }

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

    public static Boolean isCodeFile(String fileName) {
        if (fileName.endsWith(".java")) return true;
        else return false;
    }

    public static void printFileToPorocilo(PrintWriter porociloWriter, String folderPath, String fileName) throws IOException {
        // Print file title
        String fileTitle = formatFileTitle(fileName);
        porociloWriter.println(fileTitle);
        
        // Print code from file
        String filePath = folderPath + "\\" + fileName;
        String fileContent = readFile(filePath);
        String code = formatCode(fileContent);
        porociloWriter.println(code);

        // Compile code file, run it and print output
        String output = getOutput(folderPath, fileName, fileContent);
        porociloWriter.println(output);

        // Print comments
        String mainComment = getMainComment(fileContent);
        porociloWriter.println(mainComment);
        porociloWriter.println("---");
    }

    public static String formatFileTitle(String title) {
        String firstLetter = title.substring(0, 1).toUpperCase();
        title = firstLetter + title.substring(1);
        title = "## " + title;
        return title;
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
        int codeStart = fileContent.indexOf("*/") + 3;
        fileContent = fileContent.substring(codeStart);
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

    public static String getCommentArguments(String fileContent) {
        int indexOfStartInput = fileContent.indexOf("// args: ") + 9;
        int endOfLine = fileContent.indexOf("\n");

        String arguments = "";
        if (indexOfStartInput > 0 && endOfLine > 0){
            arguments = fileContent.substring(indexOfStartInput, endOfLine);
        }

        return arguments;
    }

    public static String getMainComment(String fileContent) {
        String startString = "/*<StartComments>";
        String endString = "</endComments>*/";
        int indexOfStartInput = fileContent.indexOf(startString) + startString.length();
        int endOfLine = fileContent.indexOf(endString);

        String comment = "";
        if (indexOfStartInput > 0 && endOfLine > 0){
            comment = fileContent.substring(indexOfStartInput, endOfLine);
            if (comment.length() < 2){
                comment = "";
            }
            else{
                comment = "## Comment \n" + comment.replaceAll("\n", "\n>");
            }
        }

        return comment;
    }
}