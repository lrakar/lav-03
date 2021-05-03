public class Naloga3 {
    public static void main(String[] args){
        int n = Integer.valueOf(args[0]);

        int max = 30;
        int min = 5;
        int range = max - min + 1;

        int random;
        int history = 0;
        for(int i = 0; i<50; i++){
            random = (int)(Math.random()*range) +min;
            if(random%n == 0){
                history += history + 1;
            }
        System.out.println(history);
        }
    }
}
