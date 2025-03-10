
import java.util.Scanner;
public class Conditionals3 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Tiny Easy Gameshow");
     System.out.println("I am your Host RippR");
      System.out.println("All you have to do to win is to choose the right door");
       System.out.println("Please choose between door 1, 2, 3");
        System.out.println("Enter -1 to exit");

            int userNum = scan.nextInt();

        //Exit
        if (userNum == -1){
            System.exit(0);
        }

        if (userNum == 1){
            System.out.println("Congrats! You won a brand new band-aid!");
        }
        else if (userNum == 2){
            System.out.println("Congrats! You won a brand new door handle!");
        }
        else if (userNum == 3){
            System.out.println("Congrats! You won a brand new Toothbrush!");
        }
        else{
            System.out.println("You won nothing! Choose a valid number!");
        }

        System.out.println("Enter a letter!");
        char let = scan.next().charAt(0);
        System.out.println("You entered " +let);
    }   
}
