public class Naloga9 {
    public static void main(String[] args){
        System.out.println("simulacija strela");
        float min_shot = 4;
        float max_shot = 10;
        float range= max_shot - min_shot;
        float sumshot = 0;
        float shotnow;
        float shotlo = 10;
        float shothi = 0;
        float serijahi = 0;
        float serijalo = 0;
        float[] myshots = new float[10];
        System.out.println("-------------------------------------------------------");
        System.out.println("rezultati:");
        for(int i = 0; i<10; i++){
            System.out.printf("%s %d%s", "serija", i+1, ": ");
            myshots[i] = (float)Math.random();
            shotnow = myshots[i]*range + min_shot;
            System.out.printf("%.1f", myshots[i]*range + min_shot);
            System.out.printf("%s", " ");
            sumshot += myshots[i]*range + min_shot;
            System.out.printf("%s%.1f", "akumulacija: ", sumshot);
            if(shotnow <= shotlo){
                shotlo = shotnow;
                serijalo = i+1;
            }
            if(shotnow >= shothi){
                shothi = shotnow;
                serijahi = i+1;
            }
            System.out.println("");


            
            
        }
        System.out.println();
        System.out.println("Rezultat je:");
        System.out.printf("%.1f", sumshot);

        System.out.println();
        System.out.println("najbolsi rezultat:");
        System.out.printf("%.1f %s%.0f", shothi, "v seriji: ", serijahi);

        System.out.println();
        System.out.println("najslabsi rezultat:");
        System.out.printf("%.1f %s%.0f", shotlo, "v seriji: ", serijalo);
        



        
    }
}
