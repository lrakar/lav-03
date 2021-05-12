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
