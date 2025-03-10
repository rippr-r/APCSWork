import java.util.Scanner;
public class NumChecker {

   /* public boolean isNegative(int num){
        if(num < 0){
            return true;
        }
        return false;
    }*/

    public static void main(String[] args) {
        //NumChecker numChecker = new NumChecker();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        
        /*System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(num < 0){
            System.out.println("The number is negative");
        }
        if(num > 0){
            System.out.println("The number is positive");
        }*/

        if(score >= 90){
            System.out.println("A");
        }
        else if(score >= 80){
            System.out.println("B");
        }
        else if(score >= 70){
            System.out.println("C");
        }
        else if(score >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        

    }
}
