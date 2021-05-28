import java.util.Scanner;

public class Naloga3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("koliko členov zaporedja želite?");
        int n = sc.nextInt();
        int[] zaporedje = new int[n];
        zaporedje[0] = 1;
        zaporedje[1] = 0;
        zaporedje[2] = 0;
        zaporedje[3] = 1;

        Naloga3 myObj = new Naloga3();
        System.out.println("rezultat:");
        System.out.printf("%d, %d, %d, %d, ", 1, 0, 0, 1);
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
            System.out.printf("%d, ", i);
            return getN(zaporedje, n, i);
        }
        
    }


}
