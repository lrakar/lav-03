package tictactoe;

import java.util.*;
/**
 * Krožna vrsta s stražarjem
 * 
 * omejitve: vrsta pozitivnih vrednosti (vračanje -1 pri prazni vrsti)
 * posebnosti: če je vrsta polna, se ne zgodi nič (KISS)
 * 
 * @author G3ab 
 * @version 0.1/20150119
 */
public class Vrsta_kroz
{
    // robna pogoja : head je na stražarju, tail kaže, kam damo naslednjega
    static int head=0, tail=1;
    static int[] vrstaKS = new int[15]; // 14 + stražar

    

    static int naslednji(int current){
        return ((current+1)%vrstaKS.length);
    }
    
      
    static void add(int element){
        
        // če ni poln (T==H)
        if (head != tail){
          vrstaKS[tail] = element;
          tail = naslednji(tail);
       }
    }
    
    // vrnemo -1. če je vrsta prazna (tail == naslednji(head)
    static int remove(){
        
        if (tail != naslednji(head) ){
          head = naslednji(head);
          return vrstaKS[head];
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
        System.out.println( remove() );
        System.out.println( remove() );
        System.out.println( remove() );
        System.out.println( remove() );
        
        for(int i=1;i<17;i++)
           add(i+(j+1)*30);
          
         kajJeVVrsti();   
           
        }
        
       
        // testni končni izpis vsebine System.out.println(Arrays.toString(vrstaKS));
    }
    
    // test: izpis vsebine vrste, kot jemljemo ven elemente; postopek je za vrsto nedestruktiven
    static void kajJeVVrsti(){
        // od head do tail izpišemo vse elemente
        int localHead = head;
        while ( tail !=naslednji(localHead) ){
            System.out.print( vrstaKS[naslednji(localHead)]+" ");
            localHead = naslednji(localHead);
        }
        System.out.println();
    }
}
