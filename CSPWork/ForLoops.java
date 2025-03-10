
import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println(" ");

        for(int j = 0; j<=20; j++){
            if(j%2 != 1){
                System.out.println(j+ " is even.");

            }
            else{
                System.out.println(j+ " is odd.");
            }

        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Enter a word.");
        String word = scan.next();

        for(int k = 0; k < word.length(); k++){
            char letter = word.charAt(k);
            System.out.print(letter+ " ");
        }

        System.out.println(" ");
        System.out.println(" ");

       
        Scanner sc = new Scanner(System.in);
        int userIn = 0;

        for(int m = 1; m < 3; m++){
            System.out.println("Enter either 1 to 3 to receive a positive message");
            userIn = scan.nextInt();
            if(userIn == 1){
                System.out.println("You're cool.");
            }
            else if(userIn == 2){
                System.out.println("You are amazing!");
            }
            else if(userIn == 3){
                System.out.println("You look good today");
            }
            else{
                System.out.println("You suck! You can't even follow basic directions! Enter 1, 2, or 3!");
            }

        }






    }
}
