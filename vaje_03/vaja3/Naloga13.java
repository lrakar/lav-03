public class Naloga13{
    public static void main(String[] args){
        int inpar = Integer.valueOf(args[0]);
        for(int i = 0; i <= inpar; i++){
            for(int k = inpar - i; k>=0; k--){
                System.out.printf("%d", k);
            }
            System.out.println("");
        }
    }
}