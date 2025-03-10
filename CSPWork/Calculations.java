
import java.util.Scanner;

public class Calculations{
    public static void main(String[] args) {

         @SuppressWarnings("resource")

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first number?");
            int oneNum = scan.nextInt();
        System.out.println("What is your second number?");
            int twoNum = scan.nextInt();

             int add = oneNum + twoNum;
             int sub = oneNum - twoNum;
             int mul = oneNum * twoNum;
             int div = oneNum / twoNum;

        System.out.println("Here are your calculations");
        System.out.println("-------------------------------");

        System.out.println(+oneNum+" + " +twoNum+ " = " +add );
         System.out.println(+oneNum+" - " +twoNum+ " = " +sub );
          System.out.println(+oneNum+" * " +twoNum+ " = " +mul );
           System.out.println(+oneNum+" / " +twoNum+ " = " +div );

    }
}