import java.util.*;
public class Naloga2_4_2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int dan = myObj.nextInt();
        String[] dnevi = {"ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota", "nedelja"};
        System.out.println(dnevi[dan%7-1]);
        
    }
}
