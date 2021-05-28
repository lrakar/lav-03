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
