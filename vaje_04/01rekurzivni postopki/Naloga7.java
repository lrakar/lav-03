// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga7 {
    public static void main(String[] args) {
        Obrni obrni = new Obrni();
        String znaki = "12345";
        System.out.println(znaki);
        System.out.println(obrni.reverseString(znaki, znaki.length()));
        znaki = "Ceni plačo maneken, a moč alpinec.";
        System.out.println(znaki);
        System.out.println(obrni.reverseString(znaki, znaki.length()));
        
    }
}

class Obrni{
    String reverse;
    
    String replaceChar(String str, char ch, int index){
        StringBuilder myString = new StringBuilder(str);
        myString.setCharAt(index, ch);
        return myString.toString();
    }
    
    String reverseString(String znaki, int i){
        if(i-1 <= (int)(znaki.length()/2)){
            return znaki;
        }
        int z = znaki.length()-i;
        int k = i - 1;
        Character zS = znaki.charAt(z);
        Character kS = znaki.charAt(k);
        znaki = replaceChar(znaki, zS, k);
        znaki = replaceChar(znaki, kS, z);
        znaki = reverseString(znaki, --i);
        return znaki;
    }
}
