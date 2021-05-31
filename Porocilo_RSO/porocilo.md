# Rekurzivni_postopki
## Naloga1.java
```java
// args: 10 15
// author: Lovro Rakar
// menthor: Marko Kastelic
/*<StartComments>
</endComments>*/

public class Naloga1{
    static int a = 0;
    static int b = 0;
    static int max = 0;
    static int min = 0;
    static int i = 0;
    public static void main(String[] args) {
        a = Integer.valueOf(args[0]);
        b = Integer.valueOf(args[1]);
        
        if(a > b){
            max = a;
            min = b;
        }

        else{
            max = b;
            min = a;
        }

        izpis();
        
    }

    static void izpis(){
        min++;
        if(min == max){
            return;
        }
        System.out.println(min);
        izpis();
    }
}

```
## Output 
```java
11 
12 
13 
14 

```


## Naloga2.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.Arrays;

public class Naloga2 {
    static int i = 0;
    static int[] a;
    static int[] b;
    public static void main(String[] args) {
        a = new int[41];
        b = new int[41];
        ugotovitev();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a == b){
            System.out.println("Vsebina je palindromistična");
        }
        else{
            System.out.println("vsebina ni palindromistična");
        }

    }
    static void ugotovitev(){
        if(i == 40){
            return;
        }

        a[i] = (int)((Math.random()*10) +1);
        b[40-i] = a[i];
        i++;

        
        ugotovitev();
    }
    
}

```
## Output 
```java
[4, 4, 1, 3, 3, 4, 9, 4, 8, 4, 9, 7, 8, 1, 9, 9, 4, 2, 8, 7, 9, 9, 10, 5, 3, 6, 10, 5, 10, 5, 8, 4, 2, 9, 6, 8, 3, 5, 4, 1, 0] 
[0, 1, 4, 5, 3, 8, 6, 9, 2, 4, 8, 5, 10, 5, 10, 6, 3, 5, 10, 9, 9, 7, 8, 2, 4, 9, 9, 1, 8, 7, 9, 4, 8, 4, 9, 4, 3, 3, 1, 4, 4] 
vsebina ni palindromistična 

```


## Naloga3.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.Arrays;

public class Naloga3 {
    static int[] list;
    static int index;
    static int min;
    public static void main(String[] args) {
        list = new int[10];
        index = 0;
        rekurzivniDel();
        System.out.println(Arrays.toString(list));
        System.out.println("minimum je:" + min);
    }


    static void rekurzivniDel(){
        list[index] = (int)(Math.random()*10);
        index++;
        if(min > list[index]){
            min = list[index];
        }
        if(index == 9){
            return;
        }

        rekurzivniDel();
    }
}
```
## Output 
```java
[3, 9, 1, 8, 0, 6, 7, 9, 2, 0] 
minimum je:0 

```


## Naloga4.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga4 {
    static int[][] list;
    static int column = 0;
    static int row = 0;
    public static void main(String[] args) {
        list = new int[11][11];

        column();
    }

    static void column(){
        list[row][column] = 10;
        System.out.printf("%d ", list[row][column]);

        row++;
        if (row == 10){
            row = 0;
            System.out.println("");
            column++;
        }

        if (column == 10){
            return;
        }
        
        
        
        
        column();
    }
}
```
## Output 
```java
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  
10 10 10 10 10 10 10 10 10 10  

```


## Naloga5.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
naloga je rešena brez statičnih spremenljivk...
</endComments>*/
public class Naloga5 {
    public static void main(String[] args) {
        IntGenPalindr intpalindr = new IntGenPalindr();
        StringGenPalindr stringpalindr = new StringGenPalindr();
        System.out.println("string palindrom: ");
        System.out.println(stringpalindr.gen("i", 10));

        System.out.println("int palindrom: ");
        System.out.println(intpalindr.gen("3", 4));
    }

}

class IntGenPalindr{
    int gen(String i, int dolzina){
        int result = 0;
        String temp = "";
        for(int k = dolzina; k>0; k--){
            temp = temp + i;
        }
        result = Integer.valueOf(temp);
        return result;
    }
}

class StringGenPalindr{
    String gen(String i, int dolzina){
        String result = "";
        for(int k = dolzina; k > 0; k--){
            result = result + i;
        }
        return result;
    }
}
```
## Output 
```java
string palindrom:  
iiiiiiiiii 
int palindrom:  
3333 

```


## Naloga6.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga6 {
    public static void main(String[] args) {
        Find ponovi = new Find();
        String stavek = "korenje je videlo da je korenje spet korenje in korenje";
        System.out.println(ponovi.findSpecificSubstring(stavek, "korenje", 0));
    }
}
class Find{
    int findSpecificSubstring(String stavek, String beseda, int i) {
        if(stavek.equals("")){
            return i;
        }
        else if (stavek.contains(beseda)){
            i++;
            return findSpecificSubstring(stavek.substring(stavek.indexOf(beseda) + beseda.length()), beseda, i);
        }
        return i;
    }
}

```
## Output 
```java
4 

```


## Naloga7.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga7 {
    public static void main(String[] args) {
        Obrni obrni = new Obrni();
        String znaki = "12345";
        System.out.println(znaki);
        System.out.println(obrni.reverseString(znaki, znaki.length()));
        znaki = "Ceni plačo maneken, a moč alpinec.";
        System.out.println(znaki);
        System.out.println(obrni.reverseString(znaki, znaki.length()));
        
    }
}

class Obrni{
    String reverse;
    
    String replaceChar(String str, char ch, int index){
        StringBuilder myString = new StringBuilder(str);
        myString.setCharAt(index, ch);
        return myString.toString();
    }
    
    String reverseString(String znaki, int i){
        if(i-1 <= (int)(znaki.length()/2)){
            return znaki;
        }
        int z = znaki.length()-i;
        int k = i - 1;
        Character zS = znaki.charAt(z);
        Character kS = znaki.charAt(k);
        znaki = replaceChar(znaki, zS, k);
        znaki = replaceChar(znaki, kS, z);
        znaki = reverseString(znaki, --i);
        return znaki;
    }
}
```
## Output 
```java
12345 
54321 
Ceni plačo maneken, a moč alpinec. 
.cenipla čom a ,enkenam očalp ineC 

```


## Naloga8.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga8 {
    public static void main(String[] args) {
        Naloga8 myObj = new Naloga8();
        System.out.println(myObj.findNSD(4, 16));
    }

    int findNSD(int a, int b){
        if(b != 0){
            return findNSD(b, a % b);
        }
        else{
            return a;
        }
    }
}
```
## Output 
```java
4 

```


## Naloga9.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga9 {
    public static void main(String[] args) {
        Naloga9 myObj = new Naloga9();
        System.out.println(myObj.racN(11, 3));
    }

    int racN(int a, int vsota){
        if(a == 0){
            return vsota;
        }
        else{
            return racN(a-1, vsota * a);
        }
    }
}
```
## Output 
```java
119750400 

```


# Rekurzivni postopki utrjevanje
## Naloga1.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/

public class Naloga1{
    public static void main(String[] args) {
        System.out.println("Dajte mi zrna za vsako polje na šahovnici.");
        Naloga1 myObj = new Naloga1();
        myObj.hamr(1, 64);
        System.out.println("error 404: ni toliko pšeničnih zrnc na zemlji");
    }

    void hamr(long zrna, int stevec){
        if(stevec == 0){
            return;
        }
        System.out.println(zrna);
        hamr(zrna*2, --stevec);
    }
}
```
## Output 
```java
Dajte mi zrna za vsako polje na šahovnici. 
1 
2 
4 
8 
16 
32 
64 
128 
256 
512 
1024 
2048 
4096 
8192 
16384 
32768 
65536 
131072 
262144 
524288 
1048576 
2097152 
4194304 
8388608 
16777216 
33554432 
67108864 
134217728 
268435456 
536870912 
1073741824 
2147483648 
4294967296 
8589934592 
17179869184 
34359738368 
68719476736 
137438953472 
274877906944 
549755813888 
1099511627776 
2199023255552 
4398046511104 
8796093022208 
17592186044416 
35184372088832 
70368744177664 
140737488355328 
281474976710656 
562949953421312 
1125899906842624 
2251799813685248 
4503599627370496 
9007199254740992 
18014398509481984 
36028797018963968 
72057594037927936 
144115188075855872 
288230376151711744 
576460752303423488 
1152921504606846976 
2305843009213693952 
4611686018427387904 
-9223372036854775808 
error 404: ni toliko pšeničnih zrnc na zemlji 

```


## Naloga2.java
```java
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
```
## Output 
```java
vnesi željeni n v zaporedju 

```


## Naloga3.java
```java
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
```
## Output 
```java
koliko členov zaporedja želite? 

```


## Naloga4.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
s tem zaporedjem sem se matral 2 uri, na koncu sem šel na The On-Line Encyclopedia of Integer Sequences® (OEIS®), kjer nisem našel podatka o tem zaporedju.
zaporedje, ki ga ne morem ugotoviti je: 1, 3, 5, 3, 1, 15, 29, 3
</endComments>*/
```
## Output 
```java

```


## Naloga5.java
```java
public class Naloga5 {
    public static void main(String[] args) {
       Zaporedje zap = new Zaporedje();
       int dolzina = 10;
       int[] list = new int[dolzina];
       list[0] = 1;
       list[1] = 3;
       System.out.printf("%d, %d, ", 1, 3);
       System.out.println(zap.funkcija(list, list.length, 1));
    }
}

class Zaporedje{
    int funkcija(int[] list, int dolzina, int i){
        i++;
        if(i<dolzina-1){
            if((i%2) == 0){
                list[i] = 2* list[i-1] - list[i-2];
                return funkcija(list, dolzina, i);
            }
            if((i%2) == 1){
                list[i] = 2* (list[i-2] + list[i-3]-list[i-1]);
                return funkcija(list, dolzina, i);
            }
        }
        
        return list[i];
    }
}
```
## Output 
```java
1, 3, 0 

```


# Dedovanje razredov
## ArduinoPrimer.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.util.ArrayList;

public class ArduinoPrimer
{
    public static void main(String[] args) {
        var modules = new ArduinoBase[5];
        
        var wm = new WifiModule();
        var mm = new MidiModule();
        var cm = new CustomModule();

        modules[0] = wm;        
        modules[1] = mm;        
        modules[2] = cm;        
        
        p(wm.WhatDoIDo());
        p(mm.WhatDoIDo());
        p(cm.WhatDoIDo());
        
        for(int i=0; i<3; i++){
            var pin = modules[i].Pin();
            p(pin);
        }
        
    }
    
    public static void p(String m){
        System.out.println(m);
    }
    
    public static void p(int m){
        System.out.println(m);
    }
}

interface IModule{
    public int Pin();
}

abstract class ArduinoBase {
    private String MacAddresss;
    private String MachineAddress;
    
    public String WhatDoIDo(){
        return "I am arduino base";
    }
    
    public abstract int Pin();
}

class WifiModule extends ArduinoBase {
    public int Pin(){
        return 1;
    }
    
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with a wifi module";
    }
}

class MidiModule extends ArduinoBase  {
    public int Pin(){
        return 2;
    }
    
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with midi module";
    }
    
    public void MidiModuleMethod(){}
}

class CustomModule extends ArduinoBase  {
    public int Pin(){
        return 3;
    }
    public String WhatDoIDo(){
        var b = super.WhatDoIDo();
        return b + " with custom module";
    }
    
    public void CustomMethod(){}
}









```
## Output 
```java
I am arduino base with a wifi module 
I am arduino base with midi module 
I am arduino base with custom module 
1 
2 
3 

```


# GUI vaje
## Naloga1.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
dostop do javafx knjižnice zahteva nekaj dodatnih korakov
potrebno je dodatno namestiti pravo verzijo java fx, skladno z verzijo jave, ni že nameščena (po novem)!
v vs code je treba v zavihku java project, referenced library dodati javafx knjižnico.
potem pa dela:)
</endComments>*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Naloga1 extends Application{
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Naslov programa");
        
        button = new Button();
        button.setText("Start");

        StackPane layout = new StackPane(); //pozicionirajmo tipko na sredino
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

```
## Output 
```java

```


## Naloga2.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Naloga2 extends Application implements EventHandler<ActionEvent>{
    static int cookie = 0;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");
        
        button = new Button();
        button.setText("Start");

        button.setOnAction(this);

        StackPane layout = new StackPane(); //pozicionirajmo tipko na sredino
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            
        }
    }
 
}

```
## Output 
```java

```


## Naloga3.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Naloga3 extends Application{
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Okno");
        button = new Button();
        button.setText("lovro");
                        //event e je parameter
        button.setOnAction(e -> System.out.println("hello"));
        
        //layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
```
## Output 
```java

```


## Naloga4.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Naloga4 extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Button button1 = new Button("pojdi na sceno 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - Children are laid out in vertical column
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        scene1 = new Scene(layout1, 200, 200);

        //button 2
        Button button2 = new Button("go back");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Naloga4");
        window.show();
    }
}
```
## Output 
```java

```


## Naloga5.java
```java
// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Naloga5 extends Application{
    public static void main(String[] args) {
        launch(args);    
    }

    @Override
    public void start(Stage primaryStage) {
        Circle cir = new Circle();
        cir.setFill(Color.BLACK);
        cir.setRadius(50);
        cir.setLayoutX(50);
        cir.setLayoutY(50);

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(4));
        transition.setToX(500);
        transition.setToY(500);
        transition.setNode(cir);
        transition.play();

        Pane root = new Pane();
        root.getChildren().add(cir);
        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("Krogec");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
```
## Output 
```java

```


