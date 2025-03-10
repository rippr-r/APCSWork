package SchoolWork;
import java.util.Scanner;
public class BabyCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your first int. Enter -1 to exit.");
            int numOne = scan.nextInt();

            if(numOne == -1){
                System.exit(0);
            }

        System.out.println("Enter your second int.");
            int numTwo = scan.nextInt();
        System.out.println("Enter your operation. (+ , - , / , * , %)");
            char oper =  scan.next().charAt(0);

            int add = numOne + numTwo;
            int sub = numOne - numTwo;
            int div = numOne / numTwo; 
            int mul = numOne * numTwo;
            int mod = numOne % numTwo;

        if (oper == '+'){
            System.out.println(numOne+ " + " +numTwo+ " = " +add);
        }
        else if(oper == '-'){
            System.out.println(numOne+ " - " +numTwo+ " = " +sub);
        }
        else if(oper == '/'){
            System.out.println(numOne+ " / " +numTwo+ " = " +div);
        }
        else if(oper == '*'){
            System.out.println(numOne+ " * " +numTwo+ " = " +mul);
        }
        else if(oper == '%'){
            System.out.println(numOne+ " % " +numTwo+ " = " +mod);
        }
        else{
            System.out.println("You entered a invalid operation or the operation is not understood");
        }
        
    }
}
