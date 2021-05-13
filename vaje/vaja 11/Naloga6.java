import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Naloga6 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        int start = 0;
        int end = 0;
        Arrays.setAll(ar, index-> (int)(Math.random()*30));

        for(int i = 0; i<ar.length; i++){
            if((ar[i] == 6) || (ar[i] == 15)){
                start = i;
                break;    
            }
        }

        int i = start;
        while(i < ar.length){
            i++;
            if((ar[i] == 6) || (ar[i] == 15)){
                end = i;
                break;
            }
        }
        i = 0;
        int[] revOrd = new int[ar.length-1];
        revOrd = Arrays.copyOf(ar, ar.length);
        Arrays.sort(revOrd, Collections.reverseOrder());

    }
}