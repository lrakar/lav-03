// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.Arrays;

public class Naloga2 {
    static int i = 0;
    static int[] a;
    static int[] b;
    public static void main(String[] args) {
        a = new int[41];
        b = new int[41];
        ugotovitev();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a == b){
            System.out.println("Vsebina je palindromistična");
        }
        else{
            System.out.println("vsebina ni palindromistična");
        }

    }
    static void ugotovitev(){
        if(i == 40){
            return;
        }

        a[i] = (int)((Math.random()*10) +1);
        b[40-i] = a[i];
        i++;

        
        ugotovitev();
    }
    
}

