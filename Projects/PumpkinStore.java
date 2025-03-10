
import java.util.*;

public class PumpkinStore {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to the pumpkin store!");

                int num = numPump();
                String size = sizePump();
                double price = pricePump(size);
                double sub = subTot(num, price);
                double sale = saleTax(sub);
             
            totalPri(num, size, price, sub, sale);
    }

    //Number of Pumpkins --1 
    //Size of Pumpkins -- 2 
    //Price of Pumpkins -- 3
    //Subtotal of purchance --4
    //Sales Tax of purchace --5
    //Final total --6

    public static int numPump(){
        System.out.println("How many pumpkins do you want?");
            int number = scan.nextInt();
            // Check case - System.out.println(number);
        return number;
    }//1

    public static String sizePump(){
        System.out.println("What is the size of the pumpkins you want to buy?");
         System.out.println("Large? Medium? Small?");
          String size = scan.next();
          // Check case - System.out.println(size);
        return size;
    }//2

    public static double pricePump(String s1){
       double pri = 0;
        if(s1.equalsIgnoreCase("small")){
            pri = 2.25;
        }
        else if(s1.equalsIgnoreCase("medium")){
            pri = 4.25;
        }
        else if(s1.equalsIgnoreCase("large")){
            pri = 7.65;
        }
        System.out.println("The price for " +s1+ " is " +pri);
        return pri;
    }//3

    public static double subTot(int n1, double n2){
        double total = n1 * n2;
        return total;
    }//4

    public static double saleTax(double n3){
        double tax = 0.07 * n3;
        return tax;
    }//5

    public static void totalPri(int NU, String SZ, double PR, double STOT, double ST){
        Double TOT = ST + STOT;
        System.out.println("    Subtotal: " +STOT);
        System.out.println("    Sales tax: " +ST);
        System.out.println("    Total: " +TOT);
    }
}