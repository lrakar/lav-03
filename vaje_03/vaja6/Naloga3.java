public class Naloga3 {
    public static void main(String[] args){
        int[] myYear = {2, 0, 0, 1};
        System.out.printf("Letnica rojstva: ");
        for(int i = 0; i<4; i++){
            System.out.printf("%d", myYear[i]);
        }
        System.out.println("");
        System.out.printf("Razčlenjena letnica rojstva: ");
        for(int i = 0; i<4; i++){
            System.out.printf("%d", myYear[i]);
            if(i==3){
                break;
            }
            System.out.printf(" - ");

        }
    }
}
