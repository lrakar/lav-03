public class Naloga12 {
    public static void main(String[] args){
        int inpar = Integer.valueOf(args[0]);
        for(int i = 0; i<=inpar; i++){
            for(int k = inpar; k>=0; k--){
                if(k>inpar-i){
                    System.out.printf("  "); 
                }
                else{
                    System.out.printf("%d ", k); 
                }
                
            }
            System.out.println("");
        }
    }
}
