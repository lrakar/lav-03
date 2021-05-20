public class Naloga8 {
    public static void main(String[] args){
        izracunaj(3, 7, 3);
    }

    
    static void izracunaj(int i){
        int sestej = 0;
        for(int x = 0; x<i; x++){
            sestej = x+i;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k){
        int sestej = i;
        for(int x = 0; x<k; x++){
            sestej += x;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k, int l){
        int sestej = i;
        for(int x = 0; sestej<k; x += l){
            sestej += l;
        }
        System.out.println(sestej);
    }
}
