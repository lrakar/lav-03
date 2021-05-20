import java.util.*;
public class Naloga6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("vnesi dolzino:");
        int dolzina = sc.nextInt();
        System.out.println("vnesi sirino:");
        int sirina = sc.nextInt();
        System.out.println("tvoj kvadrat:");

        for(int i=0; i<sirina; i++){
            for(int k=0; k<dolzina; k++){
                if(((i == 0) && (k == 0)) || ((i == 0) && (k == dolzina-1)) || ((i == sirina-1) && (k == 0)) || ((i == sirina-1) &&(k == dolzina-1))){
                    System.out.printf("%s", "+");
                }
                if(((i == 0) || (i == sirina-1)) && ((k > 0) && (k < dolzina-1))){
                    System.out.printf("%s", "---");
                }
                if(((i > 0) && (i < sirina-1)) && ((k == 0) || (k == dolzina-1))){
                     System.out.printf("%s", "|");
                    
                }
                if(((i > 0) && (k > 0)) && ((i < sirina-1 && k <dolzina-1))){
                    System.out.printf("%s", "   ");
                    
                }
            }
            System.out.println("");
        }
    }
}