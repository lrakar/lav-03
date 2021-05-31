// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga8 {
    public static void main(String[] args) {
        Naloga8 myObj = new Naloga8();
        System.out.println(myObj.findNSD(4, 16));
    }

    int findNSD(int a, int b){
        if(b != 0){
            return findNSD(b, a % b);
        }
        else{
            return a;
        }
    }
}
