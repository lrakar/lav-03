import java.util.Arrays;

public class Naloga3 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        
        Arrays.setAll(ar, index-> (int)(Math.random()*10));
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar, ((int)(ar.length-1)/3), (((int)(ar.length-1)/3)*(ar.length-1)/3));
        System.out.println(Arrays.toString(ar));
    }
}