
import java.util.Scanner; 
public class Conditionals2 {

public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("What day works best? (Enter a number 1 - 5, 1 Being Monday and 5 being Friday.)");
         int day = scan.nextInt();

        if (day == 1 ){
            System.out.println("Your appointment date is on Monday.");
        }
        else if (day == 2){
            System.out.println("Your appointment date is on Tuesday.");
        }
        else if (day == 3){
            System.out.println("Your appointment date is on Wednesday.");
        }
        else if (day == 4){
            System.out.println("Your appointment date is on Thursday.");
        }
        else if (day == 5){
            System.out.println("Your appointment date is on Friday.");
        }
        else{
            System.out.println("You entered an invalid number. Re-enter a new number (1 - 5)");
        }

    }
}

