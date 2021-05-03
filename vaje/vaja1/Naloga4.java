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
