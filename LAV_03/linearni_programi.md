# Laboratorijske vaje - računalništvo 03
### mentor: prof. Marko Kastelic
### avtor: Lovro Rakar
#
#


# Linearni programi
## naloga 1
### koda:
```java
import java.util.*;

public class Naloga1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ime = sc.nextLine();
        String priimek = sc.nextLine();

        char imc = ime.charAt(0);
        char prc = priimek.charAt(0);

        System.out.println(imc +" " + prc);
    }
}
```
### output:
```
vnesi ime
Lovro
vnesi priimek
Rakar
L R
PS C:\java> 
```

---
## naloga 2

Dan je program:

```java
class Naloga2 { 
 public static void main(String[] argumenti){ 
 System.out.println(argumenti[1]); 
 int a = Integer.valueOf(argumenti[1]); 
 System.out.println(a); 
 } 
} 
```
Program iz okolja kličete kot : java Naloga2 1 2 3 

## output:
```
PS C:\java> javac Naloga2.java  
PS C:\java> java Naloga2 1 2 3  
2  
2  
PS C:\java>
```
- dejansko se izpiše argument 1, prvi je argument 0
- da izpišemo še ostala 2 argumenta:
```java
class Naloga2 {
    public static void main(String[] argumenti){
        System.out.println(argumenti[0]);
        System.out.println(argumenti[1]);
        System.out.println(argumenti[2]);
    }
}

```

- ce kličemo program z: java Naloga 1 2 3 4 5   
  ### output:  
```
  PS C:\java> java Naloga2 1 2 3 4 5  
  2  
  2  
  PS C:\java> 
```
-   če kličemo java Naloga2
    ### output:
```
    PS C:\java> java Naloga2   
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0  
        at Naloga2.main(Naloga2.java:3)  
PS C:\java> 
```
- če program kličemo z: java Naloga2 ena dva tri
    ### output:
```
    PS C:\java> java Naloga2 ena dva tri  
dva  
Exception in thread "main" java.lang.NumberFormatException: For input string: "dva"  
        at java.base/java.lang.NumberFormatException.forInputString  (NumberFormatException.java:67)  
        at java.base/java.lang.Integer.parseInt(Integer.java:660)  
        at java.base/java.lang.Integer.valueOf(Integer.java:991)  
        at Naloga2.main(Naloga2.java:4)  
PS C:\java> 
```
  - Program se lahko izvaja dokler se argument tretira kot string. Ko želimo besede pretvoriti v int nam vrže error.


---
## naloga 3

### koda:

```java
public class naloga3 {
    public static void main(String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
    }
}

```
### output:
```
PS C:\java> javac Naloga3.java  
PS C:\java> java Naloga3 3 4  
7  
12  
-1  
0   
PS C:\java>
```
---
## naloga 4
### koda:

```java
public class Naloga4 {
    public static void main(String[] args){
        boolean x= true, y= true;

        boolean xNORy = ! ( x | y ); 
        System.out.println(" "+"\tx\ty\t | x NOR y");
        System.out.println("-------------------------------------");
        System.out.println("\t"+x+"\t"+y+"\t"+" | "+ !(x | y)); 
        System.out.println("\t"+!x+"\t"+y+"\t"+" | "+ !(!x | y)); 
        System.out.println("\t"+x+"\t"+!y+"\t"+" | "+ !(x | !y));
        System.out.println("\t"+!x+"\t"+!y+"\t"+" | "+ !(!x | !y));

        System.out.println("");

        boolean xANDy =  ( x & y ); 
        System.out.println(" "+"\tx\ty\t | x AND y");
        System.out.println("-------------------------------------");
        System.out.println("\t"+x+"\t"+y+"\t"+" | "+ (x & y)); 
        System.out.println("\t"+!x+"\t"+y+"\t"+" | "+ (!x & y)); 
        System.out.println("\t"+x+"\t"+!y+"\t"+" | "+ (x & !y));
        System.out.println("\t"+!x+"\t"+!y+"\t"+" | "+ (!x & !y));
        System.out.println("");
        System.out.println("In tako naprej... ...");

    }
}
```
### output:  
```
PS C:\java> Java Naloga4 
        x       y        | x NOR y
-------------------------------------
        true    true     | false     
        false   true     | false     
        true    false    | false     
        false   false    | true      

        x       y        | x AND y   
-------------------------------------
        true    true     | true      
        false   true     | false     
        true    false    | false     
        false   false    | false     

In tako naprej... ...
PS C:\java> 
```

---
## naloga 5
### koda:

```java
import java.util.*;

public class Naloga5 {

    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();
        
        System.out.println(vnos);
        System.out.println(Integer.toBinaryString(vnos));
        String pretvorba = Integer.toBinaryString(vnos);

        String result = pretvorba.substring(pretvorba.length()-4);
        System.out.println(result.replaceAll("0", "").length());
    }
}
```
### output:
```
    PS C:\java> javac Naloga5.java
    PS C:\java> java Naloga5
    Vnesi 3 mestno število
    124
    124    
    1111100
    2      
    PS C:\java> 

```
---

## naloga 6

### koda:

```java
import java.util.*;

public class Naloga6 {
    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();

        System.out.println("izpis binarno");
        System.out.println(Integer.toBinaryString(vnos));
        String output = (Integer.toBinaryString(vnos));

        System.out.println("izbris 4 least significant bitov");
        System.out.println(output.substring(0, output.length()-4));
    }
}
```
### output:
```
PS C:\java> javac Naloga6.java
PS C:\java> java Naloga6
Vnesi 3 mestno število
123
izpis binarno
1111011
izbris 4 least significant bitov
111
PS C:\java> 
```
---
## naloga 7
### koda:

```java
import java.util.*;

public class Naloga7 {

    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();
        
        System.out.println(vnos);
        System.out.println(Integer.toBinaryString(vnos));
        String pretvorba = Integer.toBinaryString(vnos);

        String result = pretvorba.substring(pretvorba.length()-4);
        System.out.println(result.replaceAll("0", "").length());
    }
}
```
### output:
```
PS C:\java> javac Naloga7.java
PS C:\java> java Naloga7 
Vnesi 3 mestno število
223
223
11011111    
4
PS C:\java> 
```
---
## naloga 8

### koda:

```java
public class Naloga8 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("1. stevilo:");
    int input1 = myObj.nextInt();

    System.out.println("2. stevilo:");
    int input2 = myObj.nextInt();

    System.out.println("1. v binarno:");
    System.out.println(Integer.toBinaryString(input1));
    String bin1 = Integer.toBinaryString(input1);

    System.out.println("2. v binarno:");
    System.out.println(Integer.toBinaryString(input2));
    String bin2 = Integer.toBinaryString(input2);
    
    System.out.println("xnor:");
    int xnor = (((input1 & input2) | (~input1 & ~input2)))&(0b00000000000000000000000000001111);
    System.out.println(Integer.toBinaryString(xnor));
    String xnors = Integer.toBinaryString(xnor);

    System.out.println("skupno število:");
    System.out.println(xnors.replaceAll("0", "").length());
    }
}
```
### output:
```

PS C:\java> java Naloga8
1. stevilo:
122
2. stevilo:
321
1. v binarno:
1111010      
2. v binarno:
101000001    
xnor:        
100
skupno število:
1
PS C:\java>    
```
---
## naloga 9
vloga operatorjev >> in << je deljenje in množenje z 2, torej bit shift left in bit shift right.
### koda:
```java
public class Naloga9 {
    public static void main(String[] args){
        int a = 8;
        //int bo v javi delal pravilno do 4 bytov
        byte b = 8;
        //byte bo delal pravilno do 1 byta
        short c = 8;
        //bo delal pravilno do 2 byta v javi
        long d = 8;
        //long bo delal do 8 bytov
        float e = 8;
        //bo delal do 4 bytov
        double f = 8;
        //shranimo lahko 8 bytov.
        // boolean g = 8; samo true in false -> en bit
        char h = 8;
        //shranjujemo lahko le en znak, številko zapiše kot vrednost, ki je shranjena v ascii tabeli, velikost je 2 byta.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);

        int arez = a << 6;
        byte brez = b << 6; 
        //error
        short crez = c << 6;
        //error
        long drez = d << 6;
        float erez = e << 6;
        //error
        double frez = f << 6;
        //error
        char hrez = h << 6;
        //error

        System.out.println("binarno:");

        System.out.println(Integer.toBinaryString(arez));
        //System.out.println(Byte.toBinaryString(brez));
        //System.out.println(Short.toBinaryString(crez));
        //System.out.println(Long.toBinaryString(drez));
        //System.out.println(Float.toBinaryString(erez));
        //System.out.println(Double.toBinaryString(frez));
        //System.out.println(Character.toBinaryString(hrez));

    }
}
```
---
## naloga 10
## koda:
```java
import java.util.*;
public class Naloga10 {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    float input = myObj.nextFloat();
    System.out.println(input * 9);
    System.out.println(input+input+input+input+input+input+input+input+input);
    System.out.println(input / (input / 9));
  }  
}

```
### output:
```
PS C:\java> javac Naloga10.java
PS C:\java> java Naloga10
1
9.0
9.0
9.0
PS C:\java> 
```
---
# nelinearni programi
## naloga 1
### koda:

```java
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
```
### output:
```
PS C:\java\vaja2> java Naloga2_1
vnesi 1. stevilo
1
vnesi 2. stevilo
2
1. stevilo je manjse od drugega.
PS C:\java\vaja2> 
```
---
## naloga 2

### koda:
```java
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
```
### output:
```
PS C:\java\vaja2> java Naloga2_2 14 55
55
14
PS C:\java\vaja2> 
```
---
## naloga 3
### koda
```java
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
```
### output:
```
PS C:\java\vaja2> javac Naloga2_3.java
PS C:\java\vaja2> java Naloga2_3 1 2 3
3
2
1
PS C:\java\vaja2> 
```
## naloga 4
### koda 1:
```java
import java.util.*;
public class Naloga2_4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int dan = myObj.nextInt();
        //String[] dnevi = {"ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota", "nedelja"};
        switch(dan){
            case 1, 8, 15, 22, 29:
                System.out.println("Ponedeljek");
                break;
            case 2, 9, 16, 23, 30:
                System.out.println("Torek");
                break;
            case 3, 10, 17, 24, 31:
                System.out.println("Sreda");
                break;
            case 4, 11, 18, 25, 32:
                System.out.println("Četrtek");
                break;
            case 5, 12, 19, 26:
                System.out.println("Petek");
                break;
            case 6, 13, 20, 27:
                System.out.println("Sobota");
                break;
            case 7, 14, 21, 28:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
    
    

}
```
### output 1:
```
PS C:\java\vaja2> javac Naloga2_4.java
PS C:\java\vaja2> java Naloga2_4
12
Petek
PS C:\java\vaja2> 
```
### koda 2:
```java
import java.util.*;
public class Naloga2_4_2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int dan = myObj.nextInt();
        String[] dnevi = {"ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota", "nedelja"};
        System.out.println(dnevi[dan%7-1]);
        
    }
}
```
### ouptut 2:
```

```
---
#nelinearni programi ponavljanja
---
## Naloga 9
### koda: 
```java
    import java.lang.Math;
public class Naloga9{
    public static void main(String[] args){
        System.out.println("  X\t|   Y");
        System.out.println("------------------");
        float x = -45;
        while(x<45){
            x += 0.1;
            String result = String.format("%.1f\t| %.1f", x, Math.sin(Math.toRadians(x)));
            System.out.println(result);
        }
    }
}
```

### output:
```java
PS C:\java\vaja3> javac Naloga9.java
PS C:\java\vaja3> java Naloga9
  X     |   Y
------------------
-44,9   | -0,7
-44,8   | -0,7
-44,7   | -0,7
-44,6   | -0,7
-44,5   | -0,7
-44,4   | -0,7
-44,3   | -0,7
-44,2   | -0,7
-44,1   | -0,7
-44,0   | -0,7
-43,9   | -0,7
-43,8   | -0,7
-43,7   | -0,7
-43,6   | -0,7
-43,5   | -0,7
-43,4   | -0,7
-43,3   | -0,7
-43,2   | -0,7
-43,1   | -0,7
-43,0   | -0,7
-42,9   | -0,7
-42,8   | -0,7
-42,7   | -0,7
-42,6   | -0,7
-42,5   | -0,7
-42,4   | -0,7
-42,3   | -0,7
-42,2   | -0,7
-42,1   | -0,7
-42,0   | -0,7
-41,9   | -0,7
-41,8   | -0,7
-41,7   | -0,7
-41,6   | -0,7
-41,5   | -0,7
-41,4   | -0,7
-41,3   | -0,7
-41,2   | -0,7
-41,1   | -0,7
-41,0   | -0,7
-40,9   | -0,7
-40,8   | -0,7
-40,7   | -0,7
-40,6   | -0,7
-40,5   | -0,6
-40,4   | -0,6
-40,3   | -0,6
-40,2   | -0,6
-40,1   | -0,6
-40,0   | -0,6
-39,9   | -0,6
-39,8   | -0,6
-39,7   | -0,6
-39,6   | -0,6
-39,5   | -0,6
-39,4   | -0,6
-39,3   | -0,6
-39,2   | -0,6
-39,1   | -0,6
-39,0   | -0,6
-38,9   | -0,6
-38,8   | -0,6
-38,7   | -0,6
-38,6   | -0,6
-38,5   | -0,6
-38,4   | -0,6
-38,3   | -0,6
-38,2   | -0,6
-38,1   | -0,6
-38,0   | -0,6
-37,9   | -0,6
-37,8   | -0,6
-37,7   | -0,6
-37,6   | -0,6
-37,5   | -0,6
-37,4   | -0,6
-37,3   | -0,6
-37,2   | -0,6
-37,1   | -0,6
-37,0   | -0,6
-36,9   | -0,6
-36,8   | -0,6
-36,7   | -0,6
-36,6   | -0,6
-36,5   | -0,6
-36,4   | -0,6
-36,3   | -0,6
-36,2   | -0,6
-36,1   | -0,6
-36,0   | -0,6
-35,9   | -0,6
-35,8   | -0,6
-35,7   | -0,6
-35,6   | -0,6
-35,5   | -0,6
-35,4   | -0,6
-35,3   | -0,6
-35,2   | -0,6
-35,1   | -0,6
-35,0   | -0,6
-34,9   | -0,6
-34,8   | -0,6
-34,7   | -0,6
-34,6   | -0,6
-34,5   | -0,6
-34,4   | -0,6
-34,3   | -0,6
-34,2   | -0,6
-34,1   | -0,6
-34,0   | -0,6
-33,9   | -0,6
-33,8   | -0,6
-33,7   | -0,6
-33,6   | -0,6
-33,5   | -0,6
-33,4   | -0,6
-33,3   | -0,5
-33,2   | -0,5
-33,1   | -0,5
-33,0   | -0,5
-32,9   | -0,5
-32,8   | -0,5
-32,7   | -0,5
-32,6   | -0,5
-32,5   | -0,5
-32,4   | -0,5
-32,3   | -0,5
-32,2   | -0,5
-32,1   | -0,5
-32,0   | -0,5
-31,9   | -0,5
-31,8   | -0,5
-31,7   | -0,5
-31,6   | -0,5
-31,5   | -0,5
-31,4   | -0,5
-31,3   | -0,5
-31,2   | -0,5
-31,1   | -0,5
-31,0   | -0,5
-30,9   | -0,5
-30,8   | -0,5
-30,7   | -0,5
-30,6   | -0,5
-30,5   | -0,5
-30,4   | -0,5
-30,3   | -0,5
-30,2   | -0,5
-30,1   | -0,5
-30,0   | -0,5
-29,9   | -0,5
-29,8   | -0,5
-29,7   | -0,5
-29,6   | -0,5
-29,5   | -0,5
-29,4   | -0,5
-29,3   | -0,5
-29,2   | -0,5
-29,1   | -0,5
-29,0   | -0,5
-28,9   | -0,5
-28,8   | -0,5
-28,7   | -0,5
-28,6   | -0,5
-28,5   | -0,5
-28,4   | -0,5
-28,3   | -0,5
-28,2   | -0,5
-28,1   | -0,5
-28,0   | -0,5
-27,9   | -0,5
-27,8   | -0,5
-27,7   | -0,5
-27,6   | -0,5
-27,5   | -0,5
-27,4   | -0,5
-27,3   | -0,5
-27,2   | -0,5
-27,1   | -0,5
-27,0   | -0,5
-26,9   | -0,5
-26,8   | -0,5
-26,7   | -0,4
-26,6   | -0,4
-26,5   | -0,4
-26,4   | -0,4
-26,3   | -0,4
-26,2   | -0,4
-26,1   | -0,4
-26,0   | -0,4
-25,9   | -0,4
-25,8   | -0,4
-25,7   | -0,4
-25,6   | -0,4
-25,5   | -0,4
-25,4   | -0,4
-25,3   | -0,4
-25,2   | -0,4
-25,1   | -0,4
-25,0   | -0,4
-24,9   | -0,4
-24,8   | -0,4
-24,7   | -0,4
-24,6   | -0,4
-24,5   | -0,4
-24,4   | -0,4
-24,3   | -0,4
-24,2   | -0,4
-24,1   | -0,4
-24,0   | -0,4
-23,9   | -0,4
-23,8   | -0,4
-23,7   | -0,4
-23,6   | -0,4
-23,5   | -0,4
-23,4   | -0,4
-23,3   | -0,4
-23,2   | -0,4
-23,1   | -0,4
-23,0   | -0,4
-22,9   | -0,4
-22,8   | -0,4
-22,7   | -0,4
-22,6   | -0,4
-22,5   | -0,4
-22,4   | -0,4
-22,3   | -0,4
-22,2   | -0,4
-22,1   | -0,4
-22,0   | -0,4
-21,9   | -0,4
-21,8   | -0,4
-21,7   | -0,4
-21,6   | -0,4
-21,5   | -0,4
-21,4   | -0,4
-21,3   | -0,4
-21,2   | -0,4
-21,1   | -0,4
-21,0   | -0,4
-20,9   | -0,4
-20,8   | -0,4
-20,7   | -0,4
-20,6   | -0,4
-20,5   | -0,4
-20,4   | -0,3
-20,3   | -0,3
-20,2   | -0,3
-20,1   | -0,3
-20,0   | -0,3
-19,9   | -0,3
-19,8   | -0,3
-19,7   | -0,3
-19,6   | -0,3
-19,5   | -0,3
-19,4   | -0,3
-19,3   | -0,3
-19,2   | -0,3
-19,1   | -0,3
-19,0   | -0,3
-18,9   | -0,3
-18,8   | -0,3
-18,7   | -0,3
-18,6   | -0,3
-18,5   | -0,3
-18,4   | -0,3
-18,3   | -0,3
-18,2   | -0,3
-18,1   | -0,3
-18,0   | -0,3
-17,9   | -0,3
-17,8   | -0,3
-17,7   | -0,3
-17,6   | -0,3
-17,5   | -0,3
-17,4   | -0,3
-17,3   | -0,3
-17,2   | -0,3
-17,1   | -0,3
-17,0   | -0,3
-16,9   | -0,3
-16,8   | -0,3
-16,7   | -0,3
-16,6   | -0,3
-16,5   | -0,3
-16,4   | -0,3
-16,3   | -0,3
-16,2   | -0,3
-16,1   | -0,3
-16,0   | -0,3
-15,9   | -0,3
-15,8   | -0,3
-15,7   | -0,3
-15,6   | -0,3
-15,5   | -0,3
-15,4   | -0,3
-15,3   | -0,3
-15,2   | -0,3
-15,1   | -0,3
-15,0   | -0,3
-14,9   | -0,3
-14,8   | -0,3
-14,7   | -0,3
-14,6   | -0,3
-14,5   | -0,3
-14,4   | -0,2
-14,3   | -0,2
-14,2   | -0,2
-14,1   | -0,2
-14,0   | -0,2
-13,9   | -0,2
-13,8   | -0,2
-13,7   | -0,2
-13,6   | -0,2
-13,5   | -0,2
-13,4   | -0,2
-13,3   | -0,2
-13,2   | -0,2
-13,1   | -0,2
-13,0   | -0,2
-12,9   | -0,2
-12,8   | -0,2
-12,7   | -0,2
-12,6   | -0,2
-12,5   | -0,2
-12,4   | -0,2
-12,3   | -0,2
-12,2   | -0,2
-12,1   | -0,2
-12,0   | -0,2
-11,9   | -0,2
-11,8   | -0,2
-11,7   | -0,2
-11,6   | -0,2
-11,5   | -0,2
-11,4   | -0,2
-11,3   | -0,2
-11,2   | -0,2
-11,1   | -0,2
-11,0   | -0,2
-10,9   | -0,2
-10,8   | -0,2
-10,7   | -0,2
-10,6   | -0,2
-10,5   | -0,2
-10,4   | -0,2
-10,3   | -0,2
-10,2   | -0,2
-10,1   | -0,2
-10,0   | -0,2
-9,9    | -0,2
-9,8    | -0,2
-9,7    | -0,2
-9,6    | -0,2
-9,5    | -0,2
-9,4    | -0,2
-9,3    | -0,2
-9,2    | -0,2
-9,1    | -0,2
-9,0    | -0,2
-8,9    | -0,2
-8,8    | -0,2
-8,7    | -0,2
-8,6    | -0,1
-8,5    | -0,1
-8,4    | -0,1
-8,3    | -0,1
-8,2    | -0,1
-8,1    | -0,1
-8,0    | -0,1
-7,9    | -0,1
-7,8    | -0,1
-7,7    | -0,1
-7,6    | -0,1
-7,5    | -0,1
-7,4    | -0,1
-7,3    | -0,1
-7,2    | -0,1
-7,1    | -0,1
-7,0    | -0,1
-6,9    | -0,1
-6,8    | -0,1
-6,7    | -0,1
-6,6    | -0,1
-6,5    | -0,1
-6,4    | -0,1
-6,3    | -0,1
-6,2    | -0,1
-6,1    | -0,1
-6,0    | -0,1
-5,9    | -0,1
-5,8    | -0,1
-5,7    | -0,1
-5,6    | -0,1
-5,5    | -0,1
-5,4    | -0,1
-5,3    | -0,1
-5,2    | -0,1
-5,1    | -0,1
-5,0    | -0,1
-4,9    | -0,1
-4,8    | -0,1
-4,7    | -0,1
-4,6    | -0,1
-4,5    | -0,1
-4,4    | -0,1
-4,3    | -0,1
-4,2    | -0,1
-4,1    | -0,1
-4,0    | -0,1
-3,9    | -0,1
-3,8    | -0,1
-3,7    | -0,1
-3,6    | -0,1
-3,5    | -0,1
-3,4    | -0,1
-3,3    | -0,1
-3,2    | -0,1
-3,1    | -0,1
-3,0    | -0,1
-2,9    | -0,1
-2,8    | -0,0
-2,7    | -0,0
-2,6    | -0,0
-2,5    | -0,0
-2,4    | -0,0
-2,3    | -0,0
-2,2    | -0,0
-2,1    | -0,0
-2,0    | -0,0
-1,9    | -0,0
-1,8    | -0,0
-1,7    | -0,0
-1,6    | -0,0
-1,5    | -0,0
-1,4    | -0,0
-1,3    | -0,0
-1,2    | -0,0
-1,1    | -0,0
-1,0    | -0,0
-0,9    | -0,0
-0,8    | -0,0
-0,7    | -0,0
-0,6    | -0,0
-0,5    | -0,0
-0,4    | -0,0
-0,3    | -0,0
-0,2    | -0,0
-0,1    | -0,0
-0,0    | -0,0
0,1     | 0,0
0,2     | 0,0
0,3     | 0,0
0,4     | 0,0
0,5     | 0,0
0,6     | 0,0
0,7     | 0,0
0,8     | 0,0
0,9     | 0,0
1,0     | 0,0
1,1     | 0,0
1,2     | 0,0
1,3     | 0,0
1,4     | 0,0
1,5     | 0,0
1,6     | 0,0
1,7     | 0,0
1,8     | 0,0
1,9     | 0,0
2,0     | 0,0
2,1     | 0,0
2,2     | 0,0
2,3     | 0,0
2,4     | 0,0
2,5     | 0,0
2,6     | 0,0
2,7     | 0,0
2,8     | 0,0
2,9     | 0,1
3,0     | 0,1
3,1     | 0,1
3,2     | 0,1
3,3     | 0,

        in tako naprej...
PS C:\java\vaja3> 
```
---
## Naloga10
### koda:
```java
public class Naloga10 {
    public static void main(String[] args){
        System.out.println("  X\t|   Y");
        System.out.println("------------------");
        float x = Float.valueOf(args[0]);
        float end = Float.valueOf(args[1]);
        while(x< end){
            String result = String.format("%.1f\t| %.1f", x, Math.sin(Math.toRadians(x)));
            System.out.println(result);
            x += 0.1;
        }
    }
}
```

### output:
```
  X     |   Y
------------------
-44,9   | -0,7
-44,8   | -0,7
-44,7   | -0,7
-44,6   | -0,7
-44,5   | -0,7
-44,4   | -0,7
-44,3   | -0,7
-44,2   | -0,7
-44,1   | -0,7
-44,0   | -0,7
-43,9   | -0,7
-43,8   | -0,7
-43,7   | -0,7
-43,6   | -0,7
-43,5   | -0,7
-43,4   | -0,7
-43,3   | -0,7
-43,2   | -0,7
-43,1   | -0,7
-43,0   | -0,7
-42,9   | -0,7
-42,8   | -0,7
-42,7   | -0,7
-42,6   | -0,7
-42,5   | -0,7
-42,4   | -0,7
-42,3   | -0,7
-42,2   | -0,7
-42,1   | -0,7
-42,0   | -0,7
-41,9   | -0,7
-41,8   | -0,7
-41,7   | -0,7
-41,6   | -0,7
-41,5   | -0,7
-41,4   | -0,7
-41,3   | -0,7
-41,2   | -0,7
-41,1   | -0,7
-41,0   | -0,7
-40,9   | -0,7
-40,8   | -0,7
-40,7   | -0,7
-40,6   | -0,7
-40,5   | -0,6
-40,4   | -0,6
-40,3   | -0,6
-40,2   | -0,6
-40,1   | -0,6
-40,0   | -0,6
-39,9   | -0,6
-39,8   | -0,6
-39,7   | -0,6
-39,6   | -0,6
-39,5   | -0,6
-39,4   | -0,6
-39,3   | -0,6
-39,2   | -0,6
-39,1   | -0,6
-39,0   | -0,6
-38,9   | -0,6
-38,8   | -0,6
-38,7   | -0,6
-38,6   | -0,6
-38,5   | -0,6
-38,4   | -0,6
-38,3   | -0,6
-38,2   | -0,6
-38,1   | -0,6
-38,0   | -0,6
-37,9   | -0,6
-37,8   | -0,6
-37,7   | -0,6
-37,6   | -0,6
-37,5   | -0,6
-37,4   | -0,6
-37,3   | -0,6
-37,2   | -0,6
-37,1   | -0,6
-37,0   | -0,6
-36,9   | -0,6
-36,8   | -0,6
-36,7   | -0,6
-36,6   | -0,6
-36,5   | -0,6
-36,4   | -0,6
-36,3   | -0,6
-36,2   | -0,6
-36,1   | -0,6
-36,0   | -0,6
-35,9   | -0,6
-35,8   | -0,6
-35,7   | -0,6
-35,6   | -0,6
-35,5   | -0,6
-35,4   | -0,6
-35,3   | -0,6
-35,2   | -0,6
-35,1   | -0,6
-35,0   | -0,6
-34,9   | -0,6
-34,8   | -0,6
-34,7   | -0,6
-34,6   | -0,6
-34,5   | -0,6
-34,4   | -0,6
-34,3   | -0,6
-34,2   | -0,6
-34,1   | -0,6
-34,0   | -0,6
-33,9   | -0,6
-33,8   | -0,6
-33,7   | -0,6
-33,6   | -0,6
-33,5   | -0,6
-33,4   | -0,6
-33,3   | -0,5
-33,2   | -0,5
-33,1   | -0,5
-33,0   | -0,5
-32,9   | -0,5
-32,8   | -0,5
-32,7   | -0,5
-32,6   | -0,5
-32,5   | -0,5
-32,4   | -0,5
-32,3   | -0,5
-32,2   | -0,5
-32,1   | -0,5
-32,0   | -0,5
-31,9   | -0,5
-31,8   | -0,5
```
---
## Naloga 11
### koda:
```java
public class Naloga11{
    public static void main(String[] args){
        int inpar = Integer.valueOf(args[0]);
        for(int i = 0; i<=inpar; i++){
            for(int k = 0; k<=inpar-i; k++){
                System.out.printf("%d ", k);
            }
            System.out.println("");
        }
    }
}
```
### output:
```
public class Naloga11{
    public static void main(String[] args){
        int inpar = Integer.valueOf(args[0]);
        for(int i = 0; i<=inpar; i++){
            for(int k = 0; k<=inpar-i; k++){
                System.out.printf("%d ", k);
            }
            System.out.println("");
        }
    }
}
```
---
## Naloga 12
### koda:
```java
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
```
### output:
```
PS C:\java\vaja3> javac Naloga12.java
PS C:\java\vaja3> java Naloga12 7
7 6 5 4 3 2 1 0 
  6 5 4 3 2 1 0 
    5 4 3 2 1 0 
      4 3 2 1 0 
        3 2 1 0 
          2 1 0 
            1 0 
              0 
PS C:\java\vaja3> 
```
---
## Naloga 13
### koda:
```java
public class Naloga13{
    public static void main(String[] args){
        int inpar = Integer.valueOf(args[0]);
        for(int i = 0; i <= inpar; i++){
            for(int k = inpar - i; k>=0; k--){
                System.out.printf("%d", k);
            }
            System.out.println("");
        }
    }
}
```
### output:
```
PS C:\java\vaja3> javac Naloga13.java
PS C:\java\vaja3> java Naloga13 7
76543210
6543210 
543210  
43210   
3210    
210     
10      
0       
PS C:\java\vaja3> 
```
---
# nelinearni programi ponavljanja
---
## Naloga 1
### Koda:
```java
public class Naloga1{
    public static void main(String[] args){
    char x='O'; // je črka O
    final char y='A'; // to je konstanta
    while(x>=y){
        x--;
        x--;
        System.out.print(x);
    }
    }
}
```
### output:
```
public class Naloga1{
    public static void main(String[] args){
    char x='O'; // je črka O
    final char y='A'; // to je konstanta
    while(x>=y){
        x--;
        x--;
        System.out.print(x);
    }
    }
}
```
---
## Naloga2
### koda:
```java
public class Naloga2 {
    public static void main(String[] args){
        int i=4;
        do {
        System.out.print("To je ");
        System.out.print("repeat oz. do-while zanka ");
        System.out.printf("številka %4d",i);
        System.out.println();
        i = i + 2;
        } while ( i!=20 );
        System.out.println(" Konec zanke ");
        } 
}
```
### output:
```
PS C:\java\vaja4> javac Naloga2.java
PS C:\java\vaja4> java Naloga2
To je repeat oz. do-while zanka ?tevilka    4
To je repeat oz. do-while zanka ?tevilka    6
To je repeat oz. do-while zanka ?tevilka    8
To je repeat oz. do-while zanka ?tevilka   10
To je repeat oz. do-while zanka ?tevilka   12
To je repeat oz. do-while zanka ?tevilka   14
To je repeat oz. do-while zanka ?tevilka   16
To je repeat oz. do-while zanka ?tevilka   18
 Konec zanke
PS C:\java\vaja4> 
```
---
## Naloga 3
### koda:
```java
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
```
### output:
```
PS C:\java\vaja4> java Naloga3 5 
0
0 
0 
0 
0 
1 
3 
7 
7 
7 
7 
7 
7 
15
15
15
15
31
31
31
31
31
31
31
31
31
63
63
63
63
63
63
63
127
127
127
127
127
127
127
255
255
511
511
511
511
511
1023
1023
1023
PS C:\java\vaja4> 
```
---
## Naloga 4
### koda:
```java
import java.util.*;
public class Naloga4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vnos = sc.nextInt();
        System.out.printf("%s %s %s", Integer.toString(vnos), Integer.toBinaryString(vnos), Integer.toHexString(vnos));
    }
}
```
### output:
```
23
23 10111 17
PS C:\java\vaja4> 
```
---
## Naloga 5
### koda:
```java
public class Naloga5 {
    public static void main(String[] args){
        int max = 80;
        int min = 0;
        int range = max - min + 1;

        int maxc = 122;
        int minc = 97;
        int rangec = maxc - minc + 1;

        for(int i = 0; i < 15; i++){
            int crka_gen = (int)(Math.random()*range) + min;
            for(int k = 0; k < 80; k++){
                if(k == crka_gen){
                    System.out.printf("%c", ((char)(Math.random()*rangec) + minc));
                }
                else{
                    System.out.printf("%s", " ");
                }
            }
            System.out.println("");
        }
    }
}
```
### output:
```
                        r
                                                                       d        
                        r
                                m
                                              p
          e
                                                                  y
              c
                                                                  l
         g
           l
                                                              l
                                                                    v
                         r
b
PS C:\java\vaja4> 
```
---
# Naloga6 - izboljšana (generiranje poljubnega 4-kotnika poljubnih dimenzij)
### koda:
```java
import java.util.*;
public class Naloga6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("vnesi dolzino:");
        int dolzina = sc.nextInt();
        System.out.println("vnesi sirino:");
        int sirina = sc.nextInt();
        System.out.println("tvoj kvadrat:");

        for(int i=0; i<sirina; i++){
            for(int k=0; k<dolzina; k++){
                if(((i == 0) && (k == 0)) || ((i == 0) && (k == dolzina-1)) || ((i == sirina-1) && (k == 0)) || ((i == sirina-1) &&(k == dolzina-1))){
                    System.out.printf("%s", "+");
                }
                if(((i == 0) || (i == sirina-1)) && ((k > 0) && (k < dolzina-1))){
                    System.out.printf("%s", "---");
                }
                if(((i > 0) && (i < sirina-1)) && ((k == 0) || (k == dolzina-1))){
                     System.out.printf("%s", "|");
                    
                }
                if(((i > 0) && (k > 0)) && ((i < sirina-1 && k <dolzina-1))){
                    System.out.printf("%s", "   ");
                    
                }
            }
            System.out.println("");
        }
    }
}
```
---
### output:
```
PS C:\java\vaja4> java Naloga6
vnesi dolzino:
5
vnesi sirino:
8
tvoj kvadrat:
+---------+  
|         |  
|         |  
|         |  
|         |  
|         |  
|         |  
+---------+  
PS C:\java\vaja4> 
```
### output 2:
```
PS C:\java\vaja4> java Naloga6
vnesi dolzino:
12
vnesi sirino:
5
tvoj kvadrat:
+------------------------------+
|                              |
|                              |
|                              |
+------------------------------+
PS C:\java\vaja4> 
```
---
## Naloga 7
### koda:
```java
public class Naloga7 {
    public static void main(String[] args){
       int visina = 13; 
       int visina_kvad = (visina - 2)/2;
       int sirina = visina*3;
       int cs = (int)Math.ceil(sirina/2);
       int cv = (int)Math.ceil(visina/2);
       for(int i = 0; i<visina; i++){
           for(int k = 0; k<sirina; k++){
                if(((k > cs-visina_kvad) && (k < cs+visina_kvad)) && ((i > cv-visina_kvad) && (i < cv+visina_kvad))){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("c");
                }
           }
        System.out.println("");
       } 
    }
}
```
### output:
```
PS C:\java\vaja4> javac Naloga7.java
PS C:\java\vaja4> java Naloga7 
ccccccccccccccccccccccccccccccccccccccc
ccccccccccccccccccccccccccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccc         ccccccccccccccc
ccccccccccccccccccccccccccccccccccccccc
ccccccccccccccccccccccccccccccccccccccc
PS C:\java\vaja4> 
```
---
## Naloga 9 (za dodatno vajo in uvod v klase sem jo rešil tudi z uporabo klasov)
### koda1:
```java
public class Naloga9 {
    public static void main(String[] args){
        System.out.println("simulacija strela");
        float min_shot = 4;
        float max_shot = 10;
        float range= max_shot - min_shot;
        float sumshot = 0;
        float shotnow;
        float shotlo = 10;
        float shothi = 0;
        float serijahi = 0;
        float serijalo = 0;
        float[] myshots = new float[10];
        System.out.println("-------------------------------------------------------");
        System.out.println("rezultati:");
        for(int i = 0; i<10; i++){
            System.out.printf("%s %d%s", "serija", i+1, ": ");
            myshots[i] = (float)Math.random();
            shotnow = myshots[i]*range + min_shot;
            System.out.printf("%.1f", myshots[i]*range + min_shot);
            System.out.printf("%s", " ");
            sumshot += myshots[i]*range + min_shot;
            System.out.printf("%s%.1f", "akumulacija: ", sumshot);
            if(shotnow <= shotlo){
                shotlo = shotnow;
                serijalo = i+1;
            }
            if(shotnow >= shothi){
                shothi = shotnow;
                serijahi = i+1;
            }
            System.out.println("");


            
            
        }
        System.out.println();
        System.out.println("Rezultat je:");
        System.out.printf("%.1f", sumshot);

        System.out.println();
        System.out.println("najbolsi rezultat:");
        System.out.printf("%.1f %s%.0f", shothi, "v seriji: ", serijahi);

        System.out.println();
        System.out.println("najslabsi rezultat:");
        System.out.printf("%.1f %s%.0f", shotlo, "v seriji: ", serijalo);
        



        
    }
}
```
### output1:
```
simulacija strela
-------------------------------------------------------
rezultati:
serija 1: 5,6 akumulacija: 5,6  
serija 2: 8,6 akumulacija: 14,3 
serija 3: 4,3 akumulacija: 18,6 
serija 4: 10,0 akumulacija: 28,6
serija 5: 5,2 akumulacija: 33,8 
serija 6: 5,3 akumulacija: 39,1 
serija 7: 9,6 akumulacija: 48,7 
serija 8: 6,8 akumulacija: 55,5 
serija 9: 4,3 akumulacija: 59,8 
serija 10: 8,4 akumulacija: 68,1

Rezultat je:
68,1
najbolsi rezultat:
10,0 v seriji: 4
najslabsi rezultat:
4,3 v seriji: 9
PS C:\java\vaja4> 
```
### koda2 class Streli:
```java
class Streli{
    private static float jaPaLahko;
    float[] shots = new float[10];
    float bestShot = 0;
    float worstShot = 10;
    float sumShots = 0;
    float range = 6;

    float shotGen(){
        float shot = (float)(Math.random()*range) + 4;
        return shot;
    }
    
    void shotGenAll(){
        for(int i = 0; i<10; i++){
            shots[i] = shotGen();
        }
    }

    void izpis(){
        float sestej = 0;
        System.out.println("-------------------------------------");
        System.out.printf("to so vsi streli: ");
        System.out.println("");
        for(int i = 0; i < 10; i++){
            sestej += shots[i];
            System.out.printf("Strel %d: %.1f -- Akumulacija: %.1f", i+1, shots[i], sestej);
            System.out.println("");
        }
        System.out.printf("Best shot: %.1f -- Worst shot %.1f", bestShot, worstShot);
        System.out.println("");
        System.out.println("-------------------------------------");
    }

    void findMax(){
        for(int i = 0; i < 10; i++){
            if(shots[i] >= bestShot){
                bestShot = shots[i];
            }   
        }
    }

    void findMin(){
        for(int i = 0; i < 10; i++){
            if(shots[i] <= worstShot){
                worstShot = shots[i];
            }   
        }
    }

    static void f(Streli s){

    }

}
```
### koda2 class main:
```java
public class Program {
    public static void main(String[] args){
        Streli streli = new Streli();
        streli.shotGenAll();
        streli.findMax();
        streli.findMin();
        streli.izpis(); 

    }
}
```
### output2:
```
PS C:\java\ponavaljanje klasov> javac Program.java
PS C:\java\ponavaljanje klasov> java Program
-------------------------------------
to so vsi streli: 
Strel 1: 8,1 -- Akumulacija: 8,1     
Strel 2: 7,0 -- Akumulacija: 15,1    
Strel 3: 8,4 -- Akumulacija: 23,6    
Strel 4: 6,6 -- Akumulacija: 30,2    
Strel 5: 8,1 -- Akumulacija: 38,3    
Strel 6: 8,6 -- Akumulacija: 46,9    
Strel 7: 5,8 -- Akumulacija: 52,7    
Strel 8: 7,7 -- Akumulacija: 60,4    
Strel 9: 5,0 -- Akumulacija: 65,4    
Strel 10: 7,3 -- Akumulacija: 72,7   
Best shot: 8,6 -- Worst shot 5,0     
-------------------------------------
PS C:\java\ponavaljanje klasov> 
```
---
# Razredni člani
## Naloga 1
### koda1:
```java
public class Naloga1{
    static void izrisiKocko(){
        System.out.println (" -----");
        System.out.println ("|  *  |");
        System.out.println ("|     |");
        System.out.println (" -----");
    }
    public static void main(String[] args){
        izrisiKocko();
        izrisiKocko();
        izrisiKocko();
        izrisiKocko();

    }
}
```
### output:
```
 -----
|  *  |
|     |
 ----- 
 ----- 
|  *  |
|     |
 ----- 
 ----- 
|  *  |
|     |
 ----- 
 ----- 
|  *  |
|     |
 -----
PS C:\java\vaja5> 
```
### koda2:
```java
public class Naloga1_2{
    static void izrisiKocko(){
        System.out.println (" -----");
        System.out.println ("|  *  |");
        System.out.println ("|     |");
        System.out.println (" -----");
    }
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            izrisiKocko();
        }

    }
}
```
### output2:
```
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
PS C:\java\vaja5> 
```
### koda3:
```java
public class Naloga1_3{
    static void izrisiKocko(int k){
        for(int i = 0; i<k; i++){
            System.out.println (" -----");
            System.out.println ("|  *  |");
            System.out.println ("|     |");
            System.out.println (" -----");
        }
        
    }
    public static void main(String[] args){
        izrisiKocko(7);

    }
}
```

### output:
```
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
 -----
|  *  |
|     |
 -----
PS C:\java\vaja5> 
```
---
## Naloga 2
### koda:
```java
public class Naloga2 {
    public static void main(String[] a){
        
        
         nekaj();
        }
        static void nekaj(int i){
         while(i-- > 0)
         System.out.println( i + " Sem v metodi nekaj(int)" );
        
        } 
}
```
#### Funkcija s parametri mora biti klicana s parametri, drugače se program ne zažene.
---
## Naloga 3
### koda:
```java
public class Naloga3 {
    static void izpisi(int i){
        for (int i=1;i<=i;i++)
            cout << i ;
            cout << endl;
       }
    static void izpisi(int i, int j){
        while (i>0){
        System.out.print(i) ;
        i--;
        }
        System.out.println();
       } 
    public static void main(String[] s){

        izpisi(6);
    }
}
```
### Problem nastane, ko inicializiramo int i, ki je bil ze uporabljen pri parametru za funkcijo.
---
## Naloga 4
### koda1:
```java
public static void main(String[] a){
 int i=4;
 for(;i<333;i++){
 //desna pravnava števil v dva stolpca;
 // prvi širine 12, drugi širine 6

System.out.printf("%12d%6d\n",i,i*2);
 }

}
```
### koda2:
```java
public class Naloga5 {
    public static void main(String[] args){
        izpisi(134423454, 12332534, 3);
    }

    static void izpisi(int num1, int num2, int sirina){
        String push = Integer.toString(sirina);
        for(int i = 0; i<10; i++){
            System.out.printf("%" + push + "d %" + push + "d", num1, num2);
            System.out.println("");
        }
    }
}
```
### opomba
DA, v programu so lahko različne funkcije z istim imenom, ki imajo drugačne parametre
```java
static void izpis(int kocka){
    System.out...
}

static void izpis(int kocka, int zaba){
    ...
}
...
```
---
## Naloga 5
### koda:
```java
public class Naloga5 {
    public static void main(String[] args){
        izpisi(134423454, 12332534, 3);
    }

    static void izpisi(int num1, int num2, int sirina){
        String push = Integer.toString(sirina);
        for(int i = 0; i<10; i++){
            System.out.printf("%" + push + "d %" + push + "d", num1, num2);
            System.out.println("");
        }
    }
}
```
### output:
```
        x |  y
       -----------
        -5     0
        -4     0
        -3     0
        -2     0
        -1     0
         0     0
         1     1
         2     1 
         3     1
         4     1
         5     1
```
---
## Naloga 6
### koda:
```java
public class Naloga6{
    static int i= 6;
    static void povecajI(int x){
        System.out.println("I v funkciji pred povečanjem: " + x);
        x = x + 1;
        System.out.println("povečan I v funkciji: " + x);
       }
       public static void main(String[] a){
       
        System.out.println("I pred klicem funkcije " +i);
        povecajI(i);
        System.out.println("I po klicu funkcije " +i);
       
        // zakaj tako ? Poglejte primer klica :
        povecajI(122); // 122 je konstanta v tem delu programa!!!!
        // ali lahku tu pričakujete povečanje KONSTANTE ?
       
       }
       
}
```
### problem je v tem, da se 1. izpiše spremenljivka i in ne spremenljivka x, ki je definirana v parametru funkcije
### Ko 2. kličemo funkcijo s parametrom z vrednostjo 122 pa izpišemo x in še x po povečani vrednosti za 1.
### Problem je tudi da nakoncu napišemo povečan I v funkciji, kar nima nič veze z i-jem(spremenljivko).
---
## Naloga 7
### koda:
```java
static int razredna = 22;
static void povecajI(int x){
 System.out.println("I v funkciji pred povečanjem: " + x);
 x = x + razredna;
 System.out.println("povečan I v funkciji: " + x);
}
public static void main(String[] a){
 int i= 6;

 System.out.println("I pred klicem funkcije " +i);
 povecajI(i);
 System.out.println("I po klicu funkcije " +i);

 // zakaj tako ? Poglejte primer klica :
 povecajI(122); // 122 je konstanta v tem delu programa!!!!
 // ali lahku tu pričakujete povečanje KONSTANTE ?

}
}
```
# komentarji/odgovori/...
### Statična spremenljivka je dosegljiva iz glavne metode, DA je dosegljiva tudi iz funkcije povecajI. Da lahko jo spremenimo na obeh mestih.
### DA lahko recemo, da je razredna globalna spremenljivka znotraj nekega classa. NE znotraj funkcije ne moremo deklarirati statične spremenljivke.
## - Statična funkcija lahko spremeni statično spremenljivko.
## - Nestatična funkcija lahko spremeni statično spremenljivko.
## - Statična funkcija ne more spremeniti nestatične spremenljivke zunaj te funkcije.
## - Statična spremenljivka se shrani v nek naslov v memory in če delamo instance tega klasa ostaja na istem naslovu. 
## - Nestatična spremenljivka se pa shrani v memory takrat, ko naredimo instanco klasa v kateri je.
## - Ko naredimo novo instanco klasa se v memory ta spremenljivka shrani pod drug naslov.
## - Statične spremenljivke ne moremo narediti znotraj funkcije.
---
## Naloga 8
### koda1:
```
public class Naloga8 {
    public static void main(String[] args){
        izracunaj(3, 7, 3);
    }

    
    static void izracunaj(int i){
        int sestej = 0;
        for(int x = 0; x<i; x++){
            sestej = x+i;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k){
        int sestej = i;
        for(int x = 0; x<k; x++){
            sestej += x;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k, int l){
        int sestej = i;
        for(int x = 0; sestej<k; x += l){
            sestej += l;
            System.out.println(sestej);
        }
        System.out.println(sestej);
    }
}
```
### koda2:
```java
public class Naloga8 {
    public static void main(String[] args){
        izracunaj(3, 7);
    }

    
    static void izracunaj(int i){
        int sestej = 0;
        for(int x = 0; x<i; x++){
            sestej = x+i;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k){
        int sestej = i;
        for(int x = 0; x<k; x++){
            sestej += x;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k, int l){
        int sestej = i;
        for(int x = 0; sestej<k; x += l){
            sestej += l;
            System.out.println(sestej);
        }
        System.out.println(sestej);
    }
}
```
### koda3:
```java
public class Naloga8 {
    public static void main(String[] args){
        izracunaj(3, 7, 3);
    }

    
    static void izracunaj(int i){
        int sestej = 0;
        for(int x = 0; x<i; x++){
            sestej = x+i;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k){
        int sestej = i;
        for(int x = 0; x<k; x++){
            sestej += x;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k, int l){
        int sestej = i;
        for(int x = 0; sestej<k; x += l){
            sestej += l;
            System.out.println(sestej);
        }
        System.out.println(sestej);
    }
}
```
### output3:
```
public class Naloga8 {
    public static void main(String[] args){
        izracunaj(3, 7, 3);
    }

    
    static void izracunaj(int i){
        int sestej = 0;
        for(int x = 0; x<i; x++){
            sestej = x+i;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k){
        int sestej = i;
        for(int x = 0; x<k; x++){
            sestej += x;
        }
        System.out.println(sestej+1);
    }
    static void izracunaj(int i, int k, int l){
        int sestej = i;
        for(int x = 0; sestej<k; x += l){
            sestej += l;
        }
        System.out.println(sestej);
    }
}
```
---
# Tabele, rezervacija prostora, Inicializacija...
## naloga1
### koda:
```java
public class Naloga1 {
    public static void main(String[] args){
        int[] tabela = new int[10];
        int osnova = 5;
        int sestevi = 5;
        for(int i=0; i<10; i++){
            System.out.println(osnova);
            tabela[i] = osnova;
            int zgo = osnova;
            osnova += sestevi;
            sestevi = zgo + osnova;
        }
        System.out.println("");
        for(int k=9; k>=0; k--){
            System.out.println(tabela[k]);
        }
    }
}

```
### output:
```
5
10
25
60
145
350
845
2040
4925
11890

11890
4925
2040
845
350
145
60
25
10
5
PS C:\java\vaja6>
```
---
## Naloga 2
### koda1:
```java
public class Naloga2 {
    public static void main(String[] args){
        char[] arr = new char[20];
        for(int i = 0; i<20; i++){
            char letter = (char)((Math.random()* 25+65));
            arr[i] = letter;
        }

        System.out.printf("Vsebina tabele: ");
        for(int i = 0; i<20; i++){
            System.out.printf("%c ", arr[i]);
        }
        System.out.println("");
        System.out.printf("Prvi dve crki: %c %c", arr[0], arr[1]);
        System.out.println("");
        System.out.printf("Zadnji dve crki: %c %c", arr[18], arr[19]);
    }
}
```
### output1:
```
Vsebina tabele: H A T G W T X J A N L G C P C D I J L E 
Prvi dve crki: H A
Zadnji dve crki: L E
PS C:\java\vaja6>
```
### koda2:
```java
public class Naloga2_2 {
    public static void main(String[] args){
        int arr_length = (int)(Math.random()*10) +10;
        char[] arr = new char[arr_length];
        for(int i = 0; i<arr_length; i++){
            char letter = (char)((Math.random()* 25+65));
            arr[i] = letter;
        }

        System.out.printf("Vsebina tabele: ");
        for(int i = 0; i<arr_length; i++){
            System.out.printf("%c ", arr[i]);
        }
        System.out.println("");
        System.out.printf("Prvi dve crki: %c %c", arr[0], arr[1]);
        System.out.println("");
        System.out.printf("Zadnji dve crki: %c %c", arr[arr.length-2], arr[arr.length-1]);
    }
}
```
### output2:
```
Vsebina tabele: I O R C W F V I E E U H 
Prvi dve crki: I O
Zadnji dve crki: U H
PS C:\java\vaja6> 
```
---
## Naloga 3
### koda:
```java
public class Naloga3 {
    public static void main(String[] args){
        int[] myYear = {2, 0, 0, 1};
        System.out.printf("Letnica rojstva: ");
        for(int i = 0; i<4; i++){
            System.out.printf("%d", myYear[i]);
        }
        System.out.println("");
        System.out.printf("Razčlenjena letnica rojstva: ");
        for(int i = 0; i<4; i++){
            System.out.printf("%d", myYear[i]);
            if(i==3){
                break;
            }
            System.out.printf(" - ");

        }
    }
}
```
### output:
```
Letnica rojstva: 2001
Razčlenjena letnica rojstva: 2 - 0 - 0 - 1
PS C:\java\vaja6> 
```
---
## naloga 4
### koda:
```java
public class Naloga4 {
    public static void main(String[] args) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        char[] soglasniki = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        for(int i=0; i<8; i++){
            if((i%2)==1){
                System.out.printf("%c ", samoglasniki[(int)(Math.random()*5)]);
            }
            else{
                System.out.printf("%c ", soglasniki[(int)(Math.random()*21)]);
            }
        }
    }
}
```
### output:
```
g i t e q e f a 
PS C:\java\vaja6> 
```
---
## naloga 5
### koda1:
```java
public class Naloga5 {
    public static void main(String[] args) {
    int[] t1 = {1,2,3,4};
    int[] t2 = t1;
    t2[1]=6;
    t2[3]=9;
    int i=0;
    System.out.print("Prva tabela: ");
    for (i=0;i<t1.length;i++){
    System.out.print(t1[i]+ " ");
    }
    System.out.println();
    System.out.print("Druga tabela: ");
    for (i=0;i<t2.length;i++){
    System.out.print(t2[i]+ " ");
    }
    }
   }
```
### output:
```
Prva tabela: 1 6 3 9 
Druga tabela: 1 6 3 9
PS C:\java\vaja6>
```
### koda2:
```java
se pride
```
### output2:
```
se pride
```
---
## naloga 6
### koda:
```java
import javax.print.event.PrintJobListener;

public class Naloga6 {
    public static void main(String[] args) {
        int students = (int)(Math.random()*10 + 25);
        int nzd = 0;
        int zd = 0;
        int db = 0;
        int pdb = 0;
        int odl = 0;
        int noc = 0;
        int[] uspehGen = new int [students];
        System.out.println("uspehi:");
        for(int i=0; i<students; i++){
            uspehGen[i] = (int)(Math.random()*6);
            System.out.printf("%d ", uspehGen[i]);
            if(uspehGen[i]==0){
                noc++;
            }
            if(uspehGen[i]==1){
                nzd++;
            }
            if(uspehGen[i]==2){
                zd++;
            }
            if(uspehGen[i]==3){
                db++;
            }
            if(uspehGen[i]==4){
                pdb++;
            }
            if(uspehGen[i]==5){
                odl++;
            }
        }
        System.out.println("");
        System.out.println("Nezadostni: " + nzd);
        System.out.println("Zadostni: " + zd);
        System.out.println("Dobri: " + db);
        System.out.println("Pravdobri: " + pdb);
        System.out.println("Odlični: " + odl);
        System.out.println("Neocenjeni: " + noc);

    }
}
```
### output:
```
uspehi:
4 2 3 3 3 0 0 5 5 0 3 0 0 2 5 1 2 0 0 1 3 1 4 0 2 3 0 5 2 2 
Nezadostni: 3
Zadostni: 6
Dobri: 6
Pravdobri: 2
Odlični: 4
Neocenjeni: 9
PS C:\java\vaja6> 
```
---
# se nekaj bo

# zaporedno in dvojisko iskanje
## naloga 1
## koda:
```java
public class Naloga1{
    public static void main(String[] args) {
        int workers = 100;
        int vsota = 0;
        int[] place = new int[workers];
        for(int i=0; i<workers; i++){
            place[i]= (int)(Math.random()*14501+500);
            System.out.println(place[i]);
            if(place[i] == 15000){
                System.out.println("najvisja placa je izplacana.");
            }
            vsota += place[i];
            
        }
        System.out.println("vsota je: " + vsota);
    }
}
```
### output:
```
5826
1951 
13573
4137
9154
8994
14945
10204
6647
8018
2996
4969
886
5304
2160
2881
14735
9372
10800
13753
14528
7046
9730
4229
2168
9540
3872
14766
12679
10417
7553
11396
12082
584
8366
13041
3597
10697
14989
3219
3093
6007
6393
10372
11014
9840
12039
14546
5595
5934
11811
11434
7158
11955
11304
13215
9483
7426
13867
4782
13392
10326
10295
4809
7082
4420
3092
12154
10998
2308
11279
10874
9598
10425
7446
13068
4298
14002
9497
4949
4087
2700
12338
4904
1875
4285
13704
10378
10041
11810
4314
12706
4327
14377
7079
1965
6821
14018
4765
11637
vsota je: 845515
PS C:\java\vaja7>
```
## naloga 2
### koda:
```java
public class Naloga2 {
    public static void main(String[] args) {
        int[] pattern = {2,4,5,11,23,25,33,55,88,89,91,93,98,103,110,130};
        int a = 0;
        int b = (pattern.length)-1;
        int x = 0;
        int wanted = 98;
        int i = 0;
        while(true){
            i++;
            System.out.println("cikel " +i);
            x = ((b-a)/2)+a;
            if(pattern[x] == wanted){
                System.out.println(pattern[x]);
                break;
            }
            else{
                if(wanted > pattern[x]){
                    a = x;
                }
                if(wanted < pattern[x]){
                    b = x;
                }
            }
        }
    }
}
```
### output:
```
cikel 1
cikel 2
cikel 3
cikel 4
98
PS C:\java\vaja7> 
```
## naloga 3
### koda:
```java
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

```
### output:
```
iskana crka je: X
seznam crk:
----------------------------
M Y T M H Y J S D E S O K 
----------------------------
linearno iskanje:
cikel 1
cikel 2
cikel 3
cikel 4
cikel 5
cikel 6
cikel 7
cikel 8
cikel 9
cikel 10
cikel 11
cikel 12
----------------------------
binarno iskanje:
cikel 1
cikel 2
cikel 3
cikel 4
cikel 5
cikel 6
cikel 7
cikel 8
X not found
PS C:\java\vaja7>
```
---
# Enorazsežne tabele, realizacija enostavnih postopkov, struktur...
## naloga 1
## koda je popravljena iz
```java
del3[i] = rez1 + rez2;
```
## na:
```java
del3[i] = dolzinaPalice - (rez1 + rez2);
```
## Zakaj?
#### Drugače bi bil problem, ker mora za trikotnik veljati pogoj ```((a + b) > c) && ((b + c) > a) && ((a + c) > b)```.
#### pri debagiranju programa, sem ugotovil, da ta pogoj nikoli ne drži, ker je ```((del1[i] + del2[i]) > del3[i])``` vedno false, kar je logično, ker je vedno ```del3[i] = rez1 + rez2;``` pri istem i-ju,
### kar pomeni, da: ```del1[i] + del2[i] = del3[i]```=> nikoli nemoremo sestaviti trikotnika.
###### to mi je vzelo zelo veliko časa
### vse naloge so rešene v eni kodi:
```java
import java.util.*;
public class RezalnikTrikotnikov {
    /**
    *    nastavitve za serijo:
    *                 velikost serije in dolžina palice
    *                 priprava ustreznega števila paketov   
    */
    static int velikostSerije;
    static int[] dobro1slabo0;
    static int dolzinaPalice;
    static int[] del1;
    static int[] del2;
    static int[] del3;
    public static void inicializacijaSerije(){
        velikostSerije = 1000;
        dolzinaPalice  = 100;  // v cm		
        del1 = new int[velikostSerije];
        del2 = new int[velikostSerije];
        del3 = new int[velikostSerije];
        dobro1slabo0 = new int[velikostSerije];
   }   
   /**
   *    razrez palice na na tri stranice trikotnika
   */
   public static void razreziPalice(){
  
      for(int i=0; i< velikostSerije; i++) { 
         int rez1 = (int)(Math.random()*98+1);
         int rez2 = (int)(Math.random()*(dolzinaPalice-rez1));
  
         del1[i] = rez1;    
         del2[i] = rez2;   
         del3[i] = dolzinaPalice - (rez1 + rez2);
      }  
   }  
   
   /**
   *    izpise vsebino vseh paketov, dobrih in izmeta, v obliki (a,b,c), pri čemer so a,b,c dolžine palic v paketih;
   *     za prvi paket torej :  (del1[0],del2[0],del3[0])   
   */

   public static void izpisiVsebinoPaketov(){
       for(int i = 0; i<10; i++){
           System.out.printf("(%d, %d, %d)", del1[i], del2[i], del3[i]);
           System.out.println("");
       }
   }
   public static void izpisiVsebinoVsehPaketov(){
       System.out.println("start");
       System.out.println("----------");
       float vsiOdpadki = 0;
       float vsiKompleti = 0;
       float prcntDobro;
       
       for(int i = 0; i<velikostSerije; i++){
                if(((del1[i] + del2[i]) > del3[i]) && ((del2[i] + del3[i]) > del1[i]) && ((del3[i] + del1[i]) > del2[i])){
                    System.out.printf("Trikotniki: (%d, %d, %d)", del1[i], del2[i], del3[i]);
                    System.out.println("");  
                    vsiKompleti++;  
                    dobro1slabo0[i] = 1;
                    
                }
                else{
                    System.out.println("odpadek"); 
                    vsiOdpadki++;
                    dobro1slabo0[i] = 0;
                }   
       }
       System.out.println("-----------");
       System.out.printf("Vsi zavrženi kompleti: %.0f", vsiOdpadki);
       System.out.println("");
       System.out.printf("Vsi dobri kompleti: %.0f", vsiKompleti);
       System.out.println("");
       prcntDobro = vsiKompleti / vsiOdpadki;
       System.out.printf("Procent dobrih: %.2f", (prcntDobro * 100));
       System.out.println("");
       System.out.printf("Procent slabih: %.2f", (100-(prcntDobro * 100)));
       System.out.println("");
       System.out.println("-----------");
   }
   public static void izpisiVsebinoNajdaljsa(){
       int saveLongest = 0;
       int saveLongestPack = 0;
       for(int i= 0; i < velikostSerije; i++){
            if(del1[i]>saveLongest){
                saveLongest = del1[i];
                saveLongestPack = i;
            }
            if(del2[i]>saveLongest){
                saveLongest = del2[i];
                saveLongestPack = i;
            }
            if(del3[i]>saveLongest){
                saveLongest = del3[i];
                saveLongestPack = i;
            }
       }
       System.out.println("Najdaljša palca: "+saveLongest);
       System.out.println("V paketu: "+saveLongestPack);

        if(dobro1slabo0[saveLongestPack] == 1){
            System.out.println("paket je uporaben");
       }
        if(dobro1slabo0[saveLongestPack] == 0){
            System.out.println("paket je neuporaben");
        }
        System.out.println("vsebina paketa: ("+ del1[saveLongestPack]+", "+del2[saveLongestPack]+", "+del3[saveLongestPack]+")");
   }
    
}

```
### output:
```
start
----------
odpadek
odpadek
odpadek
Trikotniki: (35, 29, 36)
Trikotniki: (41, 37, 22)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (23, 38, 39)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (44, 22, 34)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (35, 25, 40)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (35, 34, 31)
odpadek
Trikotniki: (17, 41, 42)
odpadek
odpadek
Trikotniki: (38, 20, 42)
Trikotniki: (11, 44, 45)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (48, 33, 19)
odpadek
Trikotniki: (45, 48, 7)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (31, 38, 31)
Trikotniki: (44, 48, 8)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (39, 28, 33)
Trikotniki: (49, 39, 12)
Trikotniki: (48, 5, 47)
Trikotniki: (45, 30, 25)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (46, 31, 23)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (42, 12, 46)
Trikotniki: (36, 28, 36)
odpadek
odpadek
odpadek
Trikotniki: (41, 39, 20)
odpadek
odpadek
odpadek
Trikotniki: (46, 37, 17)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (21, 39, 40)
Trikotniki: (32, 28, 40)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (45, 47, 8)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (22, 47, 31)
odpadek
odpadek
Trikotniki: (26, 45, 29)
odpadek
odpadek
odpadek
Trikotniki: (22, 29, 49)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (33, 43, 24)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (27, 32, 41)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (8, 46, 46)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (34, 24, 42)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (36, 25, 39)
odpadek
odpadek
Trikotniki: (42, 16, 42)
odpadek
Trikotniki: (33, 37, 30)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (48, 48, 4)
Trikotniki: (49, 35, 16)
odpadek
Trikotniki: (49, 47, 4)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (41, 20, 39)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (35, 20, 45)
Trikotniki: (23, 30, 47)
odpadek
Trikotniki: (41, 46, 13)
Trikotniki: (30, 36, 34)
odpadek
Trikotniki: (29, 33, 38)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (23, 32, 45)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (32, 24, 44)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (42, 48, 10)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (47, 5, 48)
odpadek
odpadek
Trikotniki: (48, 42, 10)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (34, 18, 48)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (33, 28, 39)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (43, 19, 38)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (15, 39, 46)
Trikotniki: (38, 23, 39)
Trikotniki: (46, 10, 44)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (30, 36, 34)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (49, 12, 39)
odpadek
odpadek
Trikotniki: (44, 40, 16)
odpadek
Trikotniki: (40, 29, 31)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (43, 49, 8)
Trikotniki: (18, 35, 47)
odpadek
Trikotniki: (47, 48, 5)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (47, 27, 26)
odpadek
odpadek
odpadek
Trikotniki: (43, 31, 26)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (33, 19, 48)
Trikotniki: (26, 31, 43)
odpadek
Trikotniki: (27, 29, 44)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (10, 46, 44)
Trikotniki: (12, 46, 42)
odpadek
odpadek
odpadek
Trikotniki: (48, 20, 32)
odpadek
odpadek
Trikotniki: (45, 38, 17)
Trikotniki: (32, 34, 34)
Trikotniki: (27, 38, 35)
Trikotniki: (14, 45, 41)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (32, 42, 26)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (11, 45, 44)
Trikotniki: (13, 42, 45)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (33, 19, 48)
odpadek
odpadek
Trikotniki: (47, 29, 24)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (40, 46, 14)
Trikotniki: (45, 25, 30)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (22, 29, 49)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (37, 28, 35)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (31, 34, 35)
odpadek
Trikotniki: (41, 33, 26)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (28, 33, 39)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (19, 42, 39)
Trikotniki: (25, 26, 49)
odpadek
Trikotniki: (18, 41, 41)
odpadek
odpadek
Trikotniki: (25, 30, 45)
Trikotniki: (45, 22, 33)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (31, 46, 23)
Trikotniki: (31, 28, 41)
odpadek
odpadek
odpadek
Trikotniki: (48, 28, 24)
odpadek
Trikotniki: (45, 11, 44)
odpadek
odpadek
Trikotniki: (29, 24, 47)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (34, 37, 29)
odpadek
odpadek
odpadek
Trikotniki: (43, 29, 28)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (34, 46, 20)
odpadek
odpadek
Trikotniki: (44, 33, 23)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (37, 40, 23)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (39, 22, 39)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (38, 22, 40)
Trikotniki: (37, 37, 26)
odpadek
odpadek
Trikotniki: (18, 42, 40)
Trikotniki: (23, 45, 32)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (31, 45, 24)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (42, 40, 18)
Trikotniki: (7, 49, 44)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (42, 41, 17)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (44, 12, 44)
odpadek
odpadek
Trikotniki: (19, 36, 45)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (30, 48, 22)
odpadek
Trikotniki: (41, 17, 42)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (46, 46, 8)
odpadek
odpadek
odpadek
Trikotniki: (39, 46, 15)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (20, 41, 39)
odpadek
odpadek
Trikotniki: (29, 45, 26)
odpadek
Trikotniki: (45, 33, 22)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (46, 26, 28)
odpadek
Trikotniki: (46, 31, 23)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (38, 47, 15)
Trikotniki: (14, 45, 41)
odpadek
Trikotniki: (49, 45, 6)
Trikotniki: (40, 36, 24)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (23, 31, 46)
odpadek
odpadek
odpadek
Trikotniki: (37, 43, 20)
Trikotniki: (47, 28, 25)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (22, 33, 45)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (8, 49, 43)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (24, 36, 40)
odpadek
odpadek
odpadek
Trikotniki: (24, 40, 36)
Trikotniki: (48, 22, 30)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (45, 13, 42)
odpadek
Trikotniki: (41, 37, 22)
Trikotniki: (42, 41, 17)
odpadek
Trikotniki: (48, 7, 45)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (45, 22, 33)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (31, 36, 33)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (30, 47, 23)
Trikotniki: (44, 20, 36)
Trikotniki: (30, 43, 27)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (49, 29, 22)
Trikotniki: (29, 44, 27)
Trikotniki: (21, 48, 31)
odpadek
odpadek
Trikotniki: (38, 30, 32)
odpadek
odpadek
odpadek
Trikotniki: (23, 30, 47)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (36, 38, 26)
Trikotniki: (31, 25, 44)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (48, 15, 37)
odpadek
odpadek
Trikotniki: (49, 31, 20)
odpadek
odpadek
odpadek
odpadek
Trikotniki: (48, 22, 30)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (35, 40, 25)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (43, 16, 41)
Trikotniki: (19, 49, 32)
Trikotniki: (41, 16, 43)
Trikotniki: (46, 37, 17)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (20, 44, 36)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (37, 25, 38)
odpadek
odpadek
Trikotniki: (35, 40, 25)
odpadek
odpadek
Trikotniki: (25, 46, 29)
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (20, 38, 42)
odpadek
odpadek
odpadek
odpadek
odpadek
Trikotniki: (43, 38, 19)
odpadek
odpadek
odpadek
odpadek
-----------
Vsi zavrženi kompleti: 837
Vsi dobri kompleti: 163
Procent dobrih: 19,47
Procent slabih: 80,53
-----------
Najdaljša palca: 98
V paketu: 52
paket je neuporaben
vsebina paketa: (98, 1, 1)
PS C:\java\vaje\vaja8> 
```
---
## sorting algoritmi
### sam sem realiziral bubble in selection, insertion pa sem prepisal realizacijo. Pri insertion-u sem popravil le , 
### da array izpisuje nakoncu for-a, zato da izpiše tudi zadnjo urejeno.
### Zadnji se uredi od najmanjšega do največjega.
### Koda class Sort:
```java
import java.util.*;
public class Sort {
    static int[] list = new int[6];
    static int swap;
    static int k;
    static int i;
    void gen(){ 
        for(int i = 0; i<6; i++){
            list[i] = (int)((Math.random()*100)+1);
            System.out.printf(list[i] + " ");    
        }
        System.out.println("");
        System.out.println("");
    }
    void insertion(){
        int dolzina = list.length;
        int meja    = 1;        // neurejeno na začetku, 1. urejen
        int mesto   = 0;       
        while (meja < dolzina){
            for(mesto=0; mesto<meja && list[mesto] < list[meja]; mesto++);      
            int temp = list[meja];  
            for (int i=meja;i>mesto;i--){
                int tt = list[i];
                list[i]   = list[i-1];
                list[i-1] = tt;
            }
            
            list[mesto] = temp; 
            meja++;
            
            System.out.println(Arrays.toString(list));               
       }
    }
    void bubble(){
        int dolzina = list.length;
        int a = 0;
        int b = a+1;
        for(int i=0; i<(dolzina); i++){
            for(int k=0; k<(dolzina-1); k++){
                a=k;
                b=a+1;
                if(list[a]>list[b]){
                    int temp = list[a];
                    list[a] = list[b];
                    list[b] = temp;
                }
                System.out.println(Arrays.toString(list));
            }
        }
    }
    void selection(){
        int dolzina = list.length;
        for(int i = 0; i<(dolzina); i++){
            int currentMin = i;
            for(int k=0; k<(dolzina); k++){

                if(list[k] < list[currentMin]){
                    currentMin = k;
                    
                }
                int temp = list[i];
                list[i] = list[currentMin];
                list[currentMin] = temp;
                
                
            }
            System.out.println(Arrays.toString(list));
            
              
        }
    }
    
}
```
### Koda z main metodo
```java
import java.util.*;
public class Naloga1{
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.gen();
        sort.selection();
        sort.gen();
        sort.bubble();  
        sort.gen();
        sort.insertion();             
    }
}
```
### output:
```
18 77 100 78 36 58 

[18, 77, 100, 78, 36, 58]
[77, 18, 100, 78, 36, 58]
[100, 77, 18, 78, 36, 58]
[100, 78, 77, 18, 36, 58]
[100, 78, 77, 36, 18, 58]
[100, 78, 77, 58, 36, 18]
50 51 59 52 44 64

[50, 51, 59, 52, 44, 64]
[50, 51, 59, 52, 44, 64]
[50, 51, 52, 59, 44, 64]
[50, 51, 52, 44, 59, 64]
[50, 51, 52, 44, 59, 64]
[50, 51, 52, 44, 59, 64]
[50, 51, 52, 44, 59, 64]
[50, 51, 44, 52, 59, 64]
[50, 51, 44, 52, 59, 64]
[50, 51, 44, 52, 59, 64]
[50, 51, 44, 52, 59, 64]
[50, 44, 51, 52, 59, 64]
[50, 44, 51, 52, 59, 64]
[50, 44, 51, 52, 59, 64]
[50, 44, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
[44, 50, 51, 52, 59, 64]
19 21 54 74 56 86

[19, 21, 54, 74, 56, 86]
[19, 21, 54, 74, 56, 86]
[19, 21, 54, 74, 56, 86]
[19, 21, 54, 56, 74, 86]
[19, 21, 54, 56, 74, 86]
PS C:\java\vaje\vaja9> 
```
# Tabele: sklad
## lastna realizacija sklada
### koda:
```java
class Sklad{
    int[] data;
    int pointer;
    Sklad(){
        data = new int[1000];
        pointer = 0;
    }

    public void push(int vrednost){
        data[pointer] = vrednost;
        pointer++;
    }

    public int pop(){
        pointer--;
        return data[pointer];
    }

}

public class SkladVaja{

    
    public static void main(String[] args) {
        
        Sklad skl = new Sklad();
        skl.push(33);
        skl.push(43);
        skl.push(64);
        skl.push(23);
        skl.push(323);
        System.out.println(skl.pop());
        System.out.println(skl.pop());
        System.out.println(skl.pop());
    }
}

```
### output:
```
323
23
64
PS C:\java\LAV> 
```
# osnove OP vaja za lastno razumevanje
### koda:
```java
public class BelezenjeOseb{
    String ime;
    String priimek;
    Telefon telefon;
    BelezenjeOseb(String ime, String priimek, Telefon telefon){
        this.ime = ime;
        this.priimek = priimek;
        this.telefon = telefon;
    }

    public String toString() {
        return ime + " " + priimek + " " + telefon;
    }


    public static void main(String[] args) {
        Telefon lovrotel = new Telefon("Huawei", "040618441", "Celje");
        Telefon mihatel = new Telefon("Samsung", "070615750", "Preserje pri Radomljah");
        BelezenjeOseb lovro = new BelezenjeOseb("lovro", "rakar ", lovrotel);
        BelezenjeOseb miha = new BelezenjeOseb("miha", "kranc ", mihatel);
        System.out.println(lovro);  
        System.out.println(miha); 
    }
    
}

class Telefon{
    String znamka;
    String cifra;
    String lokacija;
    Telefon(String znamka, String cifra, String lokacija){
        this.znamka = znamka;
        this.cifra = cifra;
        this.lokacija = lokacija;
    }
    public String toString(){
        return znamka + " " + cifra + " " + lokacija;
    }
}
```
### output:
```
lovro rakar  Huawei 040618441 Celje
miha kranc  Samsung 070615750 Preserje pri Radomljah
PS C:\java\LAV> 
```
# Tabele: metode razreda arrays
## naloga 1
### koda:
```java

import java.util.*;
public class Naloga1{
    public static void main(String[] args) { // ← main
        char[] znaki = new char[100];
        float[] stevila = new float[100];
        //test za fill ↓
        Arrays.fill(znaki, 'A');
        Arrays.fill(stevila, 12.3f);
        //test za equals ↓
        int[] a = new int[100];
        Arrays.fill(a, 10);
        int[] b = new int[100];
        Arrays.fill(b, 11);
        System.out.println("ista dolzina tabel, razlicne vrednosti:");
        if(Arrays.equals(a, b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        int[] c = new int[10];
        Arrays.fill(c, 11);
        int[] d = new int[12];
        Arrays.fill(d, 11);
        System.out.println("razlicna dolzina tabel, iste vrednosti:");
        if(Arrays.equals(c, d)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        int[] e = new int[100];
        Arrays.fill(e, 11);
        int[] f = new int[100];
        Arrays.fill(f, 11);
        System.out.println("ista dolzina tabel, iste vrednosti:");
        if(Arrays.equals(e, f)){
            System.out.println("true");
        }
        else{
            System.out.println();
        }
        // tabela napolnjena z naključnimi vrednostmi
        int[] TestAr = new int[10];
        // test copyOfRange
        Arrays.setAll(TestAr, index-> (int)(Math.random()*6));
        System.out.println(Arrays.toString(Arrays.copyOf(TestAr, 6)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(TestAr, 0,(TestAr.length-3))));
        //  Naredimo lahko kopijo areja, in mu dodamo prazna mesta↓
        System.out.println(Arrays.toString(Arrays.copyOf(TestAr, 15)));

    }

}
```
### output:
```
ista dolzina tabel, razlicne vrednosti:
false
razlicna dolzina tabel, iste vrednosti:
false
ista dolzina tabel, iste vrednosti:
true
[4, 2, 5, 1, 4, 3]
[4, 2, 5, 1, 4, 3, 4]
[4, 2, 5, 1, 4, 3, 4, 0, 4, 2, 0, 0, 0, 0, 0]
PS C:\java\vaje\vaja 11> 
```
---
## Naloga 2
### koda:
```java
import java.util.Arrays;

public class Naloga2 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        
        Arrays.setAll(ar, index-> (int)(Math.random()*10));
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
```
### output:
```
PS C:\java\vaje\vaja 11> javac Naloga2.java
PS C:\java\vaje\vaja 11> java Naloga2 15
[3, 6, 6, 9, 3, 5, 6, 0, 0, 4, 4, 8, 7, 1, 9]
[0, 0, 1, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 9]
PS C:\java\vaje\vaja 11> 
```
## Naloga 3
### koda:
```java
import java.util.Arrays;

public class Naloga3 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        
        Arrays.setAll(ar, index-> (int)(Math.random()*10));
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar, ((int)(ar.length-1)/3), (((int)(ar.length-1)/3)*(ar.length-1)/3));
        System.out.println(Arrays.toString(ar));
    }
}
```
### output:
```
PS C:\java\vaje\vaja 11> javac Naloga3.java
PS C:\java\vaje\vaja 11> java Naloga3 10   
[5, 4, 3, 7, 5, 4, 2, 7, 5, 9]
[5, 4, 3, 2, 4, 5, 5, 7, 7, 9]
PS C:\java\vaje\vaja 11> 
```
## Naloga 4
#### ni tako lahka kot se mi je zdelo na prvi pogled
### koda:
```java
import java.util.*;

public class Naloga4 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] ar = new int[n];
        int start = 0;
        int end = 0;
        Arrays.setAll(ar, index-> (int)(Math.random()*30));

        for(int i = 0; i<ar.length; i++){
            if((ar[i] == 9) || (ar[i] == 18)){
                start = i;
                break;    
            }
        }

        int i = start;
        while(i < ar.length){
            i++;
            if((ar[i] == 9) || (ar[i] == 18)){
                end = i;
                break;
            }
        }



        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar, start, end);
        System.out.println(Arrays.toString(ar));
    }
}
```
### output:
```
PS C:\java\vaje\vaja 11> java Naloga4 20
[29, 5, 21, 15, 20, 7, 11, 18, 13, 28, 5, 25, 10, 27, 8, 23, 19, 25, 9, 11]
[29, 5, 21, 15, 20, 7, 11, 5, 8, 10, 13, 18, 19, 23, 25, 25, 27, 28, 9, 11]
PS C:\java\vaje\vaja 11> 
```
# Večrazsežnostne tabele
## naloga 1
### koda:
```java
class Naloga1{

    public static void main(String[] arg){

       char tab[][]={{‘s’,’o’,’s’,’e’,’d’},{‘o’,’p’,’e’,’r’,’a’},
                     {‘k’,’r’,’a’,’v’,’a’}};

       v = tab.length;
       s = tab[0].length;
       System.out.println(v);
       System.out.println(s);
       System.out.println(“Tabela :“+v+“ x “+s);
    }
} 
```
### output:
```
Error...
```
### Kako interpretirate rezultate, ki jih program izpiše ? Narišite tabelo tab!
#### Napake v sintaksi...za char se uporabljajo enojni ravni narekovaji, tabela se definira ```char[][] tab =```...
##### verjetno zato, ker urejevalniki besedila po svoje obrnejo narekovaje
### dodano ```int[] s = new int[tab[0].length];```
### popravljena koda: 
```java

