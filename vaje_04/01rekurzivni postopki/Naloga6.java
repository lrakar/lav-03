// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga6 {
    public static void main(String[] args) {
        Find ponovi = new Find();
        String stavek = "korenje je videlo da je korenje spet korenje in korenje";
        System.out.println(ponovi.findSpecificSubstring(stavek, "korenje", 0));
    }
}
class Find{
    int findSpecificSubstring(String stavek, String beseda, int i) {
        if(stavek.equals("")){
            return i;
        }
        else if (stavek.contains(beseda)){
            i++;
            return findSpecificSubstring(stavek.substring(stavek.indexOf(beseda) + beseda.length()), beseda, i);
        }
        return i;
    }
}

