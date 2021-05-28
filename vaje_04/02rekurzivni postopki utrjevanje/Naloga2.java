import java.util.Scanner;

public class Naloga2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vnesi željeni n v zaporedju");
        int n = sc.nextInt();
        int[] zaporedje = new int[n];
        zaporedje[0] = 1;
        zaporedje[1] = 0;
        zaporedje[2] = 0;
        zaporedje[3] = 1;

        Naloga2 myObj = new Naloga2();
        System.out.println("rezultat:");
        System.out.println(myObj.getN(zaporedje, n, 4));
        sc.close();
    }

    int getN(int[] zaporedje, int n, int i){
        zaporedje[i] = zaporedje[i-1] + zaporedje[i-2] + 2* zaporedje[i-3] + zaporedje[i-4];
        if(i == n-1){
            return zaporedje[i];
        }
        
        else{
            i++;
            return getN(zaporedje, n, i);
        }
        
    }


}
