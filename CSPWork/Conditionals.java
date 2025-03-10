

import java.util.Scanner; 

public class Conditionals {
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your height in inches.");
         int hgt = scan.nextInt();

            if (hgt >= 50){
                System.out.println("You are " +hgt+ " inches tall. You may ride the coaster alone.");
            }//Ends if
            else if (hgt >= 45){
                System.out.println("You are " +hgt+ " inches tall. You may ride the coaster with someone.");
            }//Ends else/if
            else{
                System.out.println("You are " +hgt+ " inches tall. You are not able to ride the coaster.");
            }//Ends Else


    }
}
