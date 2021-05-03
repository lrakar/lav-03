class Streli{
    private static float jaPaLahko;
    float[] shots = new float[10];
    float bestShot = 0;
    float worstShot = 10;
    float sumShots = 0;
    float range = 6;

    float shotGen(){
        float shot = (float)(Math.random()*range) + 4;
        return shot;
    }
    
    void shotGenAll(){
        for(int i = 0; i<10; i++){
            shots[i] = shotGen();
        }
    }

    void izpis(){
        float sestej = 0;
        System.out.println("-------------------------------------");
        System.out.printf("to so vsi streli: ");
        System.out.println("");
        for(int i = 0; i < 10; i++){
            sestej += shots[i];
            System.out.printf("Strel %d: %.1f -- Akumulacija: %.1f", i+1, shots[i], sestej);
            System.out.println("");
        }
        System.out.printf("Best shot: %.1f -- Worst shot %.1f", bestShot, worstShot);
        System.out.println("");
        System.out.println("-------------------------------------");
    }

    void findMax(){
        for(int i = 0; i < 10; i++){
            if(shots[i] >= bestShot){
                bestShot = shots[i];
            }   
        }
    }

    void findMin(){
        for(int i = 0; i < 10; i++){
            if(shots[i] <= worstShot){
                worstShot = shots[i];
            }   
        }
    }

    static void f(Streli s){

    }

}