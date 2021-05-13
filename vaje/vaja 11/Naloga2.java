import java.util.Arrays;

public class Naloga2 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        
        Arrays.setAll(ar, index-> (int)(Math.random()*10));
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
