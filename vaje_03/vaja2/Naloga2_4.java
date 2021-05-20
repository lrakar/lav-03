import java.util.*;
public class Naloga2_4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int dan = myObj.nextInt();
        String[] dnevi = {"ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota", "nedelja"};
        switch(dan){
            case 1, 8, 15, 22, 29:
                System.out.println("Ponedeljek");
                break;
            case 2, 9, 16, 23, 30:
                System.out.println("Torek");
                break;
            case 3, 10, 17, 24, 31:
                System.out.println("Sreda");
                break;
            case 4, 11, 18, 25, 32:
                System.out.println("Četrtek");
                break;
            case 5, 12, 19, 26:
                System.out.println("Petek");
                break;
            case 6, 13, 20, 27:
                System.out.println("Sobota");
                break;
            case 7, 14, 21, 28:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
    
    

}
