public class Naloga2 {
    public static void main(String[] args){
        char[] arr = new char[20];
        for(int i = 0; i<20; i++){
            char letter = (char)((Math.random()* 25+65));
            arr[i] = letter;
        }

        System.out.printf("Vsebina tabele: ");
        for(int i = 0; i<20; i++){
            System.out.printf("%c ", arr[i]);
        }
        System.out.println("");
        System.out.printf("Prvi dve crki: %c %c", arr[0], arr[1]);
        System.out.println("");
        System.out.printf("Zadnji dve crki: %c %c", arr[18], arr[19]);
    }
}
