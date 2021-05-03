public class Naloga5 {
    public static void main(String[] args) {
    int[] t1 = {1,2,3,4};
    int[] t2 = t1;
    t2[1]=6;
    t2[3]=9;
    int i=0;
    System.out.print("Prva tabela: ");
    for (i=0;i<t1.length;i++){
    System.out.print(t1[i]+ " ");
    }
    System.out.println();
    System.out.print("Druga tabela: ");
    for (i=0;i<t2.length;i++){5
    System.out.print(t2[i]+ " ");
    }
    }
   }
   