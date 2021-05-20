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
