import java.util.*;
public class DeMorganPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Set username and password
        final String adminUsername = "admin";
            final String adminPassword = "admin123";

        //Ask user to enter username and password
        System.out.println("Enter username: ");
            String username = sc.nextLine();
        System.out.println("Enter password: ");
            String password = sc.nextLine();
        
        //Create Short-circuit evaluation using &&
        if(username.equals(adminUsername) && password.equals(adminPassword)){
            System.out.println("Welcome Admin!");
        } 
        else{
            System.out.println("Invalid username or password!");
        }

        //Take two boolean values from user
        System.out.println("Enter first boolean value (true / false): ");
            boolean A = sc.nextBoolean();
        System.out.println("Enter second boolean value (true / false): ");
            boolean B = sc.nextBoolean();

        //Apply DeMorgan's Law
        boolean leftSide1 = !(A && B);
        boolean rightSide1 = !A || !B;

        boolean leftSide2 = !(A || B);
        boolean rightSide2 = !A && !B;

        //Display results
        System.out.println("DeMorgan's First Law: !(A && B) == !A || !B");
            System.out.println("Left Side: " + leftSide1 + " |  Right Side: " + rightSide1);
            System.out.println("Are they equal? " + (leftSide1 == rightSide1));
            
        System.out.println("DeMorgan's Second Law: !(A || B) == !A && !B");
            System.out.println("Left Side: " + leftSide2 + " |  Right Side: " + rightSide2);
            System.out.println("Are they equal? " + (leftSide2 == rightSide2));
    }
}
