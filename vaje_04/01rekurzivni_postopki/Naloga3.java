// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.Arrays;

public class Naloga3 {
    static int[] list;
    static int index;
    static int min;
    public static void main(String[] args) {
        list = new int[10];
        index = 0;
        rekurzivniDel();
        System.out.println(Arrays.toString(list));
        System.out.println("minimum je:" + min);
    }


    static void rekurzivniDel(){
        list[index] = (int)(Math.random()*10);
        index++;
        if(min > list[index]){
            min = list[index];
        }
        if(index == 9){
            return;
        }

        rekurzivniDel();
    }
}
