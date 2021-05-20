import java.lang.Math;
public class Naloga9{
    public static void main(String[] args){
        System.out.println("  X\t|   Y");
        System.out.println("------------------");
        float x = -45;
        while(x<45){
            x += 0.1;
            String result = String.format("%.1f\t| %.1f", x, Math.sin(Math.toRadians(x)));
            System.out.println(result);
        }
    }
}