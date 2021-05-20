public class Naloga1{
    public static void main(String[] args) {
        int workers = 100;
        int vsota = 0;
        int[] place = new int[workers];
        for(int i=0; i<workers; i++){
            place[i]= (int)(Math.random()*14501+500);
            System.out.println(place[i]);
            if(place[i] == 15000){
                System.out.println("najvisja placa je izplacana.");
            }
            vsota += place[i];
            
        }
        System.out.println("vsota je: " + vsota);
    }
}