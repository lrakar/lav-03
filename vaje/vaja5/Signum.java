public class Signum {
    static int x;
    public static void main(String[] args){
        // tabela
        int y = 0;
        System.out.printf(""+y);

        System.out.printf("%10c |%3c\n",'x','y');
        System.out.printf("%18s\n","-----------");
        for (x =-5; x<=5; x++) {  
            if(x >= 0){
            }
            System.out.printf("  \t%d     ", x);
            Sgn(x);
            System.out.println("");
        }
    }
    static void Sgn(int x){
        if(x > 0){
            System.out.printf("%d ", 1);
        }
        if(x < 0){
            System.out.printf("%d", 0);
        }
        if(x == 0){
            System.out.printf("%d", 0);
        }
    }
    
}