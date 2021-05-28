// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga9 {
    public static void main(String[] args) {
        Naloga9 myObj = new Naloga9();
        System.out.println(myObj.racN(11, 3));
    }

    int racN(int a, int vsota){
        if(a == 0){
            return vsota;
        }
        else{
            return racN(a-1, vsota * a);
        }
    }
}
