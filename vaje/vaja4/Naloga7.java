public class Naloga7 {
    public static void main(String[] args){
       int visina = 13; 
       int visina_kvad = (visina - 2)/2;
       int sirina = visina*3;
       int cs = (int)Math.ceil(sirina/2);
       int cv = (int)Math.ceil(visina/2);
       for(int i = 0; i<visina; i++){
           for(int k = 0; k<sirina; k++){
                if(((k > cs-visina_kvad) && (k < cs+visina_kvad)) && ((i > cv-visina_kvad) && (i < cv+visina_kvad))){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("c");
                }
           }
        System.out.println("");
       } 
    }
}
