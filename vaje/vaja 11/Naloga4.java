import java.util.*;

public class Naloga4 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        int start = 0;
        int end = 0;
        Arrays.setAll(ar, index-> (int)(Math.random()*30));

        for(int i = 0; i<ar.length; i++){
            if((ar[i] == 9) || (ar[i] == 18)){
                start = i;
                break;    
            }
        }

        int i = start;
        while(i < ar.length){
            i++;
            if((ar[i] == 9) || (ar[i] == 18)){
                end = i;
                break;
            }
        }



        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar, start, end);
        System.out.println(Arrays.toString(ar));
    }
}