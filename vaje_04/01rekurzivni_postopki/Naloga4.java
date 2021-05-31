// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
public class Naloga4 {
    static int[][] list;
    static int column = 0;
    static int row = 0;
    public static void main(String[] args) {
        list = new int[11][11];

        column();
    }

    static void column(){
        list[row][column] = 10;
        System.out.printf("%d ", list[row][column]);

        row++;
        if (row == 10){
            row = 0;
            System.out.println("");
            column++;
        }

        if (column == 10){
            return;
        }
        
        
        
        
        column();
    }
}
