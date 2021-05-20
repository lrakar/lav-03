public class Naloga4 {
    public static void main(String[] args) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        char[] soglasniki = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        for(int i=0; i<8; i++){
            if((i%2)==1){
                System.out.printf("%c ", samoglasniki[(int)(Math.random()*5)]);
            }
            else{
                System.out.printf("%c ", soglasniki[(int)(Math.random()*21)]);
            }
        }
    }
}
