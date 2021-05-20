public class Naloga10 {
    public static void main(String[] args){
        System.out.println("  X\t|   Y");
        System.out.println("------------------");
        float x = Float.valueOf(args[0]);
        float end = Float.valueOf(args[1]);
        while(x< end){
            String result = String.format("%.1f\t| %.1f", x, Math.sin(Math.toRadians(x)));
            System.out.println(result);
            x += 0.1;
        }
    }
}
