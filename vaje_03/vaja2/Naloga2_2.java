public class Naloga2_2 {
    public static void main(String[] args){
        int a = Integer.valueOf(args[0]);  
        int b = Integer.valueOf(args[1]);  
        if(a > b){
            System.out.println(a);
            System.out.println(b);
        }
    
        else{
            System.out.println(b);
            System.out.println(a);
        }
    }


}