
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LoopAssignment {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number less than 100");
        int tens = scan.nextInt();

        while(tens < 101){
            System.out.println(tens+ " is divisble by 10");
            tens +=10;
        }


    System.out.println(" ");
    System.out.println(" ");

        //#2
        double tuition = 10000.00;
        int year = 0;
        while(year <= 9){
            System.out.println("The tuition for year " +year+ " is $" +Math.round(tuition * 100) / 100d);

            year++;
            tuition *= 1.05;
        }

    System.out.println(" ");
    System.out.println(" ");

        //3

        int loop = 0;
        int right = 0;
        int wrong = 0;

        while(loop <= 9){

            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            String answerString = JOptionPane.showInputDialog("What is " +num1+ " + " +num2+ " ? ");
            int answer = Integer.parseInt(answerString);
            loop ++;


            if(num1 + num2 == answer){
                right ++;
            }
            else if(num1 + num2 != answer){
                wrong++;
            }

            if(loop == 10){
            System.out.println("You got " +right+ " correct");
            System.out.println("and you got " +wrong+ " incorrect.");
            }
        }
    }
}
