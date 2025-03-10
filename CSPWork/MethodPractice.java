
import java.util.Scanner;
public class MethodPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number 1 - 12");
         int userInput = scan.nextInt();
          checkMonth(userInput);

            System.out.println(" ");
            System.out.println(" ");

        System.out.println("The number of times you want your alarm to go off.");
         int num = scan.nextInt();
          alarm(num);

    }// Ends Main

    public static void checkMonth(int mo){

        if(mo == 1){
            System.out.println("January");
        }
        else if(mo == 2){
            System.out.println("Febuary");
        }
        else if(mo == 3){
            System.out.println("March");
        }
        else if(mo == 4){
            System.out.println("April");
        }
        else if(mo == 5){
            System.out.println("May");
        }
        else if(mo == 6){
            System.out.println("June");
        }
        else if(mo == 7){
            System.out.println("July");
        }
        else if(mo == 8){
            System.out.println("August");
        }
        else if(mo == 9){
            System.out.println("September");
        }
        else if(mo == 10){
            System.out.println("October");
        }
        else if(mo == 11){
            System.out.println("November");
        }
        else if(mo == 12){
            System.out.println("December");
        }
        else{
            System.out.println("Invalid number.");
        }

    }// Ends checkMonth

    public static void alarm(int numTim){
        for(int i = 0; i < numTim; i++ ){
          System.out.println("Beep!");
        }
    }// Ends alarm

}// Ends Class
