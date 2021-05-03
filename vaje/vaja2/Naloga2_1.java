import java.util.*;

public class Naloga2_1{

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("vnesi 1. stevilo");
    int a = myObj.nextInt();

    System.out.println("vnesi 2. stevilo");
    int b = myObj.nextInt();

    if(a < b){
        System.out.println("1. stevilo je manjse od drugega.");
    }

    else{
        System.out.println("2. stevilo je manjse od prvega.");
    }



    
  }  
}


