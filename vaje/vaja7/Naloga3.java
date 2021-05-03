import java.util.*;
public class Naloga3 {
    public static void main(String[] args) {
        char charx = 'X';
        System.out.println("iskana crka je: " + charx);
        System.out.println("seznam crk:");
        System.out.println("----------------------------");
        char[] arr = new char[13];
        for(int i=0; i<13; i++){
            char charGen = (char)(Math.random()*26 + 65);
            arr[i] = charGen;
            System.out.printf("%C ", charGen);
        }
        Arrays.sort(arr);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("linearno iskanje: ");
        for(int i=0; i<12; i++){
            System.out.println("cikel " + (i+1));
            if(charx == arr[i]){
                System.out.println("----------------------------");
                System.out.println("found: " + arr[i]);
                break;
            }
            
        
        }
        System.out.println("----------------------------");
        System.out.println("binarno iskanje: ");
        int a = 0;
        int b = (arr.length)-1;
        int x = 0;
        int i = 0;
        while(true){
            i++;
            System.out.println("cikel " + i);
            x = (int)Math.ceil((b-a)/2)+a;
            if(arr[x] == charx){
                System.out.println("found: " + arr[x]);
                break;
            }
            else if(i > arr.length / 2 + 1){
                System.out.println("X not found");
                break;
            }
            else{
                if((int)arr[x] < (int)charx){
                    a = x;
                if((int)arr[x] > (int)charx){
                    b = x;
                }
            }
        }
       }
    }
}

