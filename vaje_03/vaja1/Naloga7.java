import java.util.*;

public class Naloga7 {

    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();
        
        System.out.println(vnos);
        System.out.println(Integer.toBinaryString(vnos));
        String pretvorba = Integer.toBinaryString(vnos);

        String result = pretvorba.substring(pretvorba.length()-4);
        System.out.println(result.replaceAll("0", "").length());
    }
}
