
import java.util.*;
public class NonVoidPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Are you old enough to rent a car?");
          System.out.println("Enter your age:");
           int userAge = scan.nextInt();

            if(findAge(userAge) == true){
                System.out.println("You are old enough to rent a car!");
            }
            else{
                System.out.println("You are not old enough to rent a car!");
            }

    }//Ends Main

    public static boolean findAge(int age){
        boolean yn;
            if(age < 25){
                yn = false;
            }
            else{
                yn = true;
            }
        return yn;    
    }
}//Ends Class
