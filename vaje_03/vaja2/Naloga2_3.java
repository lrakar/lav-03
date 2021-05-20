public class Naloga2_3 {
    public static void main(String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);
        
        if((a > b) && (a > c) && (b > c)){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        if((b > a) && (b > c) && (a > c)){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }

        if((c > b) && (c > a) && (b > a)){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

        if((a > c) && (a > b) && (c > b)){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }

        if((b > c) && (b > a) && (c > a)){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }

        if((c > a) && (a > b) && (a > b)){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }

    }
}
