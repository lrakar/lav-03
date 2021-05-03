package tictactoe;

import java.util.*;
/**
 * Linearna vrsta
 * 
 * omejitve: vrsta pozitivnih vrednosti (vračanje -1 pri prazni vrsti)
 * posebnosti: če je vrsta polna, se ne zgodi nič (KISS)
 * 
 * da ohranimo logično dolžino vrste, je potrebno vsakič elemente premakniti proti glavi vrste
 * 
 * 
 * @author G3ab 
 * @version 0.1/20150119
 */
public class Vrsta_linearna_II
{
    // robna pogoja : head je na stražarju, tail kaže, kam damo naslednjega
    static int head=0, tail=0;
    static int[] vrsta = new int[15]; // 14 + stražar

    
      
    static void add(int element){
        
        // če ni polna, dodaj, premakni rep
        if (tail < vrsta.length ){
          vrsta[tail] = element;
          tail++;
       }
    }
    
    // vrnemo -1. če je vrsta prazna (tail == head)
    static int remove(){
        
        if (tail != head ){
          int retEl = vrsta[head];
          //head++;
          //premakni vse elemente za eno mesto proti glavi, pozicijo glave ohrani
          int i=head;
          while(i<tail-1){
              vrsta[i] = vrsta[i+1];
              i++;
            }
          tail--;  
          return retEl;
        }
        return -1;
    }
    
    // zgolj demonstracija delovanja
    public static void main(String[] abcd){
        
        // test, če deluje 'na prazno+
        System.out.println( remove() );
        System.out.println( remove() );
        kajJeVVrsti();
        
        // test dodajanja: dodamo 17 elementov na 14 mest; dodati jih mora zgolj 14
        for(int i=1;i<17;i++)
           add(i);
        kajJeVVrsti();
        //[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14]
        //[]
           
        // dodajanje odvzemanje (5x - odstranimo 4, dodamo 16!
       
        for(int j=0;j<5;j++){
            System.out.println( "odstranjujem:" );   
        System.out.println( remove() );
        System.out.println( remove() );
        System.out.println( remove() );
        System.out.println( remove() );
        
            System.out.print( "dopolnjujem z: " );
        for(int i=1;i<17;i++){
           add(i+(j+1)*30);
           System.out.print(i+(j+1)*30+",");
        }
        System.out.println();  
         kajJeVVrsti();   
           
        }
        
       
        // testni končni izpis vsebine System.out.println(Arrays.toString(vrsta));
    }
    
    // test: izpis vsebine vrste, kot jemljemo ven elemente; postopek je za vrsto nedestruktiven
    static void kajJeVVrsti(){
        // od head do tail izpišemo vse elemente
        int localHead = head;
        while ( tail !=localHead ){
            System.out.print( vrsta[localHead]+" ");
            localHead =localHead+1;
        }
        System.out.println();
    }
}
