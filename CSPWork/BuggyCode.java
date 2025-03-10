
//Capital J - 1
//no '.' after java - 2
import java.util.Scanner;
public class BuggyCode {
    public static void main(String[] args) {
        //Lowercase Scanner - 3
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        //Improper 'a' variable, also in paraenthesis - 8
        int a = input.nextInt();
        //Improper 'b' variable, also in paraenthesis - 9
        int b = input.nextInt();

        //Was subtraction instead of addition - 11
        int sum = a + b;
        
        //Missing semicolon - 4
        int product = a * b;
        
        // Uses '<' not '>' - 10
        if (sum >= 0) {
            System.out.println("Sum is greater than zero");
        }
        
        //Missing quotation marks - 5
        //Lowercase String
       String x = "nope";
    }
} //Missing ending brace - 6
