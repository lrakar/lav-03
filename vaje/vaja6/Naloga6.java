import javax.print.event.PrintJobListener;

public class Naloga6 {
    public static void main(String[] args) {
        int students = (int)(Math.random()*10 + 25);
        int nzd = 0;
        int zd = 0;
        int db = 0;
        int pdb = 0;
        int odl = 0;
        int noc = 0;
        int[] uspehGen = new int [students];
        System.out.println("uspehi:");
        for(int i=0; i<students; i++){
            uspehGen[i] = (int)(Math.random()*6);
            System.out.printf("%d ", uspehGen[i]);
            if(uspehGen[i]==0){
                noc++;
            }
            if(uspehGen[i]==1){
                nzd++;
            }
            if(uspehGen[i]==2){
                zd++;
            }
            if(uspehGen[i]==3){
                db++;
            }
            if(uspehGen[i]==4){
                pdb++;
            }
            if(uspehGen[i]==5){
                odl++;
            }
        }
        System.out.println("");
        System.out.println("Nezadostni: " + nzd);
        System.out.println("Zadostni: " + zd);
        System.out.println("Dobri: " + db);
        System.out.println("Pravdobri: " + pdb);
        System.out.println("Odlični: " + odl);
        System.out.println("Neocenjeni: " + noc);

    }
}
