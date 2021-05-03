import java.util.*;
public class Naloga4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vnos = sc.nextInt();
        System.out.printf("%s %s %s", Integer.toString(vnos), Integer.toBinaryString(vnos), Integer.toHexString(vnos));
    }
}
