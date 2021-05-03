import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class Testingnal5 {

    public static void main(String[] args) {
        System.out.println("Vnesi 3 mestno število");

        Scanner myObj = new Scanner(System.in);
        int vnos = myObj.nextInt();
        
        System.out.println(vnos);
        System.out.println(Integer.toBinaryString(vnos));
        System.out.println(String.format("%s", vnos));
        System.out.println(String.format("Tole je zdej binary z dvemi mesti: %2s", Integer.toBinaryString(vnos)));
        System.out.println(String.format("Tole je zdej binary s tremi mesti: %3s", Integer.toBinaryString(vnos)));
        System.out.println(String.format("%10s", Integer.toBinaryString(vnos)));
        System.out.println(String.format("%10s", Integer.toBinaryString(vnos)).replaceAll(" ", "0"));
        
        String vmesni_rez = String.format("%10s", Integer.toBinaryString(vnos)).replaceAll(" ", "0");
        String result = vmesni_rez.substring(vmesni_rez.length()-4);
        System.out.println(result);
        System.out.println(result.replaceAll("1", " 1").split(" ").length-1);
        System.out.println("Lovro".substring(2,"Lovro".length()));

        String a = "Domen, gleda, v, ekran";
        for(int i =0; i< a.split(",").length; i++){
            System.out.println(a.split(",")[i]);
        }


        System.out.println(String.format("Danes je %3f stopnji celzija.", 15f));
        System.out.println("Danes je " + 15 + " stopnij celizija");
    }

    String MyFormat(String str, int ...a){
        return String.format(str, a);
    }

    public static void MojaMetoda(){
        
    }
}
