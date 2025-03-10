
import java.util.Scanner;
import java.util.Random;
public class DoWhilePract {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = 0, sum = 0, i = 1;

        System.out.print("Enter a number: ");
        n = scan.nextInt();
        do{
            sum += i;
            i++;
        }while(i <= n);
        System.out.println("Sum of the numbers 1 -  "+n+ " is: " +sum);

        System.out.println(" ");
        System.out.println(" ");

        Random RandNum = new Random();
        int num = RandNum.nextInt(20)+1;
        int guess;
        int attempts = 0;

        do{
            System.out.println("Guess the number between 1 and 20");
            guess = scan.nextInt();
            attempts++;
        }while(guess != num);
        System.out.println("You got it correct in " +attempts+ " attempt(s).");

        System.out.println(" ");
        System.out.println(" ");

        int u = 1, number = 0;

        System.out.println("Enter a number.");
        number = scan.nextInt();

        do{
            System.out.println(number+ " * " +u+ " = " +(number * u));
            u++;
        }while(u <= 12);


    }
}
