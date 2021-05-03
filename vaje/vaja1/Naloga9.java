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

