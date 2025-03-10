
import java.util.*;
public class JavaPractice7 {
    public static void main(String[] args) {
        String[] alpha = {"My, ", "Favorite ", "Game ", "is ", "Miecraft."};

        for(int i = 0; i<5; i++){
            System.out.print(alpha[i]);
        }

     System.out.println(" \n ");

     Scanner scan = new Scanner(System.in);
     int attempts = 0;
     int guess;
     
    int[] bravo = {11, 17, 6, 8, 25, 32, 49, 3, 12, 42};

     do{
        System.out.println("Guess a number in the array ");
        guess = scan.nextInt();
        attempts++;
    }while(guess != bravo[8]);
    
    System.out.println("You got it correct");
    for(int i = 0; i<10; i++){
        System.out.print(bravo[i]+ ", ");
    }

        
            
    }

}
