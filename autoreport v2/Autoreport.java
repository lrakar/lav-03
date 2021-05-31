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
                    String code = getCode(filePath);
                    porociloWriter.println(code);

                    // Compile code file, run it and print output
                    String output = getOutput(folderPath, fileName, filePath);
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

    public static String getCode(String filePath) throws IOException{
        Scanner fileScanner = new Scanner(new File(filePath));
        String fileContent = "```java\n";

        while(fileScanner.hasNextLine()){
            fileContent += fileScanner.nextLine() + "\n";
        }
        fileScanner.close();

        fileContent += "```";
        return fileContent;
    }
    
    public static String getOutput(String folderPath, String fileName, String filePath) throws IOException {
        String openTerminal = "cmd /c ";
        String navigateFile = "cd " + folderPath + " && ";
        String compileFile = "javac " + fileName + " && ";
        String runFile = "java " + fileName.substring(0, fileName.length()-5);
        String arguments = getArgumentsFromCodeComments(filePath);
        String command = openTerminal + navigateFile + compileFile + runFile + arguments;
 
        Process process = Runtime.getRuntime().exec(command);
    
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(process.getOutputStream()));
        writer.write("09-20-14");
        writer.close();
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String output = "";
        String line;
        while ((line = reader.readLine()) != null) {
            output += line + "\n";
        }
        reader.close();

        return output;
    }

    public static String getArgumentsFromCodeComments(String filePath) throws IOException {
        Scanner fileScanner = new Scanner(new File(filePath));
        String argumentsLine = fileScanner.nextLine();
        fileScanner.close();
        int indexOfStartInput = argumentsLine.indexOf("// args: ");

        String arguments = "";
        if (indexOfStartInput > 0){
            arguments = argumentsLine.substring(indexOfStartInput);
        }

        return arguments;
    }
}