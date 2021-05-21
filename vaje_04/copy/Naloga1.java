// args: 10 15
// author: Lovro Rakar
// menthor: Marko Kastelic
/*<StartComments>
Testni komentar 1
Testni Komentar 2
To je testni odgovor na vprašanje, ki vsebuje tudi neko obrazložitev```int k = 0``` in tako...
</endComments>*/
import java.util.*;
public class Naloga1{
    static int a = 0;
    static int b = 0;
    static int max = 0;
    static int min = 0;
    static int i = 0;
    public static void main(String[] args) {
        a = Integer.valueOf(args[0]);
        b = Integer.valueOf(args[1]);
        
        if(a > b){
            max = a;
            min = b;
        }

        else{
            max = b;
            min = a;
        }

        izpis();
        
    }

    static void izpis(){
        min++;
        if(min == max){
            return;
        }
        System.out.println(min);
        izpis();
    }
}

