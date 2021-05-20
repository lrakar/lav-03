public class Naloga5 {
    public static void main(String[] args){
        int max = 80;
        int min = 0;
        int range = max - min + 1;

        int maxc = 122;
        int minc = 97;
        int rangec = maxc - minc + 1;

        for(int i = 0; i < 15; i++){
            int crka_gen = (int)(Math.random()*range) + min;
            for(int k = 0; k < 80; k++){
                if(k == crka_gen){
                    System.out.printf("%c", ((char)(Math.random()*rangec) + minc));
                }
                else{
                    System.out.printf("%s", " ");
                }
            }
            System.out.println("");
        }
    }
}
