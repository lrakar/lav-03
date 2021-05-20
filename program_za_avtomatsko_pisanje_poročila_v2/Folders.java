import java.io.*;
public class Folders {
    public static String[] listFolders; //imena vseh map
    public static String folderName; //samo ime trenutne mape
    public static String folderPath; //samo pot do trenutne mape
    public static File porocilo;
    public static File masterdir;

    public static void init(){
        porocilo = new File("C:\\java\\Porocilo_RSO\\porocilo.md"); // class File s potjo do poročila
        masterdir = new File("C:\\java\\vaje_04"); // class File s potjo do master direktorija
        listFolders = masterdir.list(); //vsa imena map se shranijo v arraye
        folderName = listFolders[AutoReport.i];//povemo ime trenutne mape(pri i-ju)
        folderPath = masterdir.toString() + "\\" +folderName;// povemo pot trenutne mape
    }

    public static String getFolderName(int i){
        return "\n# " + listFolders[i].substring(2) + "\n";//substring brez cifer za urejanje (01,02,03)
    }
}
