import java.util.*;

public class Naloga1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("vnesi ime");
        String ime = sc.nextLine();
        System.out.println("\n");

        System.out.println("vnesi priimek");
        String priimek = sc.nextLine();
        System.out.println("\n");

        char imc = ime.charAt(0);
        char prc = priimek.charAt(0);

        System.out.println(imc +" " + prc);
    }
}

