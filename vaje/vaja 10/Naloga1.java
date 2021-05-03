import java.util.*;
public class Naloga1{
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("array");
        for(int i = 0; i<10; i++){
            arr[i] = i;
            System.out.printf("%d ", (int)((Math.random())*10));

        }
        System.out.println("");
        Array.sort(arr);
        System.out.println("------------");
        for(int i = 0; i<10; i++){
            System.out.printf("%d ", arr[i]);
        }
           
    }
}