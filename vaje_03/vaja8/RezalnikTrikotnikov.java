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


 