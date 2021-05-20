public class Naloga5 {
    public static void main(String[] args){
        izpisi(134423454, 12332534, 3);
    }

    static void izpisi(int num1, int num2, int sirina){
        String push = Integer.toString(sirina);
        for(int i = 0; i<10; i++){
            System.out.printf("%" + push + "d %" + push + "d", num1, num2);
            System.out.println("");
        }
    }
}
