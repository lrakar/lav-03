// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/

public class Naloga1{
    public static void main(String[] args) {
        System.out.println("Dajte mi zrna za vsako polje na šahovnici.");
        Naloga1 myObj = new Naloga1();
        myObj.hamr(1, 64);
        System.out.println("error 404: ni toliko pšeničnih zrnc na zemlji");
    }

    void hamr(long zrna, int stevec){
        if(stevec == 0){
            return;
        }
        System.out.println(zrna);
        hamr(zrna*2, --stevec);
    }
}