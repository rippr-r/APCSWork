
import java.util.*;
public class MethodsPracticeVandNV {
    public static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the numbers you need the average of with spacing by hiting enter.");
         int n1 = scan.nextInt();
          int n2 = scan.nextInt();
           int n3 = scan.nextInt();

          System.out.println(" ");

         int plus = average(n1, n2, n3) +50;
        System.out.println("The average is: " +average(n1, n2, n3));
         System.out.println("The average plus fifty is:  " +plus);


         System.out.println(" ");


        System.out.println("Enter two numbers to see if they are multiples of eachother with spacing by hiting enter.");
         int n4 = scan.nextInt();
          int n5 = scan.nextInt();

        System.out.println(multiple(n4, n5) );


         System.out.println(" ");
                   

        System.out.println("Enter the amount of pumpkins you are tring to buy.");
         double n6 = scan.nextDouble();

        System.out.println("Your price is " +pumpkin(n6)+ "$");
    }//Ends Main

    public static int average(int n1, int n2, int n3){
        int avg;
         avg = (n1 + n2 + n3) / 3;

        return avg;
    }//Ends Average

    public static boolean multiple(int n1, int n2){
        boolean isMultiple;
        if(n1 % n2 == 0){
            isMultiple = true;
        }
        else{
            isMultiple = false;
        }
        return isMultiple;
    }//Ends Multiple

    public static double pumpkin(double n1){
         double price;
          double tax;
           double total;

        price = (n1 * 7.0);
         tax = price * .05;
          total = price + tax;

        return total;
    }//Ends Pumpkin

}//Ends Class
