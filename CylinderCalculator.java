
import java.util.Scanner;
public class CylinderCalculator {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the height of the cylinder?");
         double height = scan.nextDouble();
        System.out.println("What is the radius of the cylinder?");
         double radius = scan.nextDouble();

         double area = radius * radius * Math.PI;
         double volume = area * height;

        System.out.println("Area: " +area);
         System.out.println("Volume: " +volume);
          System.out.println("Rounded Area: " +Math.round(area * 100) / 100d);
           System.out.println("Rounded Volume: " +Math.round(volume * 100) / 100d);
    }
}
