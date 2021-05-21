import java.io.*;
import java.util.*;
public class Autoreport{
    static String comments;
    static File masterdir;
    static File porocilo;
    static File folder;
    static File myFile;
    static String[] files;
    static PrintWriter pw;
    static Scanner readLine;
    static int lineCounter = 0;
    static String argsOnRun;
    static boolean commentEnabler;
    static String[] folders;

    static void commentChecker(){
        if(lineCounter == 0){
            argsOnRun = readLine.nextLine();
            argsOnRun = argsOnRun.replaceAll("// args:", "");
        }
        if(readLine.nextLine() == "/*<StartComments>"){
            commentEnabler = true;
        }
        if(readLine.nextLine() == "</endComments>*/"){
            commentEnabler = false;
        }

        if(commentEnabler == true){
            comments = ">" + readLine.nextLine() + "\n";
        }
        
    }

    static void output(int i, int k){
        String command = "cmd /c cd C:\\java\\vaje_04\\copy && javac Naloga1.java && java Naloga1 15 20";
        // String command = "cmd /c cd C:\\java\\vaje_04\\copy";
        // String command = "cmd /c cd C:\\java\\vaje_04\\copy && javac Naloga1.java && java Naloga1 15 20";
        // command[0] = "cmd & ";
        // command[1] = "";
        // command[2] = "cd " + sd;
        // {"cmd", "/c", "cd " + "C:\\java\\vaje_04\\" + folders[i], 
        // "/c", "javac" + files[k], 
        // "/c", "java" + files[k] + argsOnRun};
        try{
            Process myProcess = Runtime.getRuntime().exec(command);
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(myProcess.getOutputStream()));
            writer.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(myProcess.getInputStream()));
            String outputLine;
            while ((outputLine = reader.readLine()) != null) {
                pw.println(outputLine);
            }
            reader.close();
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try{
            porocilo = new File("C:\\java\\Porocilo_RSO\\porocilo.md");
            masterdir = new File("C:\\java\\vaje_04");
            FileWriter fw = new FileWriter(porocilo);
            pw = new PrintWriter(fw);
        }
        catch(IOException e) {
            System.out.println(e);
        }

        output(1,2);

        // folders = new String[masterdir.list().length];
        // folders = masterdir.list();
        // for(int i = 0; i<masterdir.list().length; i++){
        //     comments = null;
        //     folder = new File("C:\\java\\vaje_04\\" + folders[i]);
        //     pw.println("# " + folders[i].substring(2));
        //     files = new String[folder.list().length];
        //     files = folder.list(); 
        //     for(int k = 0; k<folder.list().length; k++){
        //         if(files[k].endsWith(".java") == true){
        //             pw.println("## " + files[k].substring(0, files[k].length() - 5));
        //             pw.println("### koda:");
        //             pw.println("```java");
        //             myFile = new File("C:\\java\\vaje_04\\" + folders[i] + "\\" + files[k]);
        //             try{
        //                 readLine = new Scanner(myFile);
        //                 while(readLine.hasNextLine()){
        //                     commentChecker(); //cekiramo komentarje
        //                     pw.println(readLine.nextLine());
        //                     lineCounter++;
        //                 }
        //             }
        //             catch (FileNotFoundException e){
        //                 System.out.println(e);
        //             }
        //             pw.println("```");
        //             pw.println("output: ");
        //             pw.println("```");
        //             output(i, k); //napisemo output
        //             pw.println("```");
        //             pw.println("Komentarji in odgovori na vprašanja:");
        //             pw.println(comments);
        //         }
                
        //     }
        // }
        pw.close();

    }
}