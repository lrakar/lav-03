import java.util.Scanner;

public class Programck {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    int userName = myObj.nextInt();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
   // System.out.println("Output je" + char ch1 = myObj.charAt(0));
  }
}