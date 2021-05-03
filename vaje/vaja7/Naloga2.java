public class Naloga2 {
    public static void main(String[] args) {
        int[] pattern = {2,4,5,11,23,25,33,55,88,89,91,93,98,103,110,130};
        int a = 0;
        int b = (pattern.length)-1;
        int x = 0;
        int wanted = 98;
        int i = 0;
        while(true){
            i++;
            System.out.println("cikel " +i);
            x = ((b-a)/2)+a;
            if(pattern[x] == wanted){
                System.out.println(pattern[x]);
                break;
            }
            else{
                if(wanted > pattern[x]){
                    a = x;
                }
                if(wanted < pattern[x]){
                    b = x;
                }
            }
        }
    }
}
