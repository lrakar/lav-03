public class Naloga2_2 {
    public static void main(String[] args){
        int arr_length = (int)(Math.random()*10) +10;
        char[] arr = new char[arr_length];
        for(int i = 0; i<arr_length; i++){
            char letter = (char)((Math.random()* 25+65));
            arr[i] = letter;
        }

        System.out.printf("Vsebina tabele: ");
        for(int i = 0; i<arr_length; i++){
            System.out.printf("%c ", arr[i]);
        }
        System.out.println("");
        System.out.printf("Prvi dve crki: %c %c", arr[0], arr[1]);
        System.out.println("");
        System.out.printf("Zadnji dve crki: %c %c", arr[arr.length-2], arr[arr.length-1]);
    }
}
