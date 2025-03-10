import java.lang.Math;
public class PowersOfTwo {
    public static void main(String[] args) {
        powersOfTwo();
    }
    public static void powersOfTwo(){
        double z = 2;
        double y = 1;
        for(int x = 1; x < 11; x++){
            System.out.println(Math.pow(z, y));
            y++;
        }
    }
}
