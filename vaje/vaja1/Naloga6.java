import java.util.*;

public class Naloga6 {
    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();

        System.out.println("izpis binarno");
        System.out.println(Integer.toBinaryString(vnos));
        String output = (Integer.toBinaryString(vnos));

        System.out.println("izbris 4 least significant bitov");
        System.out.println(output.substring(0, output.length()-4));
    }
}
