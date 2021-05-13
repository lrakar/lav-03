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