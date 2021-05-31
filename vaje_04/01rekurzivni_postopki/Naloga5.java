// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
naloga je rešena brez statičnih spremenljivk...
</endComments>*/
public class Naloga5 {
    public static void main(String[] args) {
        IntGenPalindr intpalindr = new IntGenPalindr();
        StringGenPalindr stringpalindr = new StringGenPalindr();
        System.out.println("string palindrom: ");
        System.out.println(stringpalindr.gen("i", 10));

        System.out.println("int palindrom: ");
        System.out.println(intpalindr.gen("3", 4));
    }

}

class IntGenPalindr{
    int gen(String i, int dolzina){
        int result = 0;
        String temp = "";
        for(int k = dolzina; k>0; k--){
            temp = temp + i;
        }
        result = Integer.valueOf(temp);
        return result;
    }
}

class StringGenPalindr{
    String gen(String i, int dolzina){
        String result = "";
        for(int k = dolzina; k > 0; k--){
            result = result + i;
        }
        return result;
    }
}
