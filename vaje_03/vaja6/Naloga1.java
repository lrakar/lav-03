public class Naloga1 {
    public static void main(String[] args){
        int[] tabela = new int[10];
        int osnova = 5;
        int sestevi = 5;
        for(int i=0; i<10; i++){
            System.out.println(osnova);
            tabela[i] = osnova;
            int zgo = osnova;
            osnova += sestevi;
            sestevi = zgo + osnova;
        }
        System.out.println("");
        for(int k=9; k>=0; k--){
            System.out.println(tabela[k]);
        }
    }
}
