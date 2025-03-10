package TesterThingys;

import java.util.Scanner;
public class ModulusStuff {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

      System.out.println("Enter your highest grade, middle grade, and lowest grade (Seperate via hitting enter)");
         double high = scan.nextDouble();
         double mid = scan.nextDouble();
         double low = scan.nextDouble();
            double cgrade = (high + mid + low) / 3.0;

         System.out.println("Your grade in the class is " +cgrade); 
 }
}
