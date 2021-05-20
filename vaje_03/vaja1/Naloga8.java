import java.util.*;
/*Iz ukazne vrstice zajamemo 2 celi pozitivni števili. Program izpiše, koliko od spodnjih 4 bitov imata vneseni
števili v binarni obliki enakih.*/

public class Naloga8 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("1. stevilo:");
    int input1 = myObj.nextInt();

    System.out.println("2. stevilo:");
    int input2 = myObj.nextInt();

    System.out.println("1. v binarno:");
    System.out.println(Integer.toBinaryString(input1));
    String bin1 = Integer.toBinaryString(input1);

    System.out.println("2. v binarno:");
    System.out.println(Integer.toBinaryString(input2));
    String bin2 = Integer.toBinaryString(input2);
    
    System.out.println("xnor:");
    int xnor = (((input1 & input2) | (~input1 & ~input2)))&(0b00000000000000000000000000001111);
    System.out.println(Integer.toBinaryString(xnor));
    String xnors = Integer.toBinaryString(xnor);

    System.out.println("skupno število:");
    System.out.println(xnors.replaceAll("0", "").length());
    }
}
