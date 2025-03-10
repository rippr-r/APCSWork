
import java.util.Random;
import java.util.Scanner;
public class JavPractice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0 ;
        do{
            System.out.println(i);
            i++;
        }while(i <= 100);

        
        System.out.println(" ");
        System.out.println(" ");

        
        do{
            System.out.println("Enter a even number.");
            i = scan.nextInt();
            
        }while(i % 2 != 0);
        System.out.println("Congrats! Its even");


        System.out.println(" ");
        System.out.println(" ");


        Random RandNum = new Random();
        int RandNum1 = RandNum.nextInt(20)+1;
        int RandNum2= RandNum.nextInt(20)+1;
        char c;

        do{
            System.out.println("What is the answer?");
             System.out.println(RandNum1+ " * " +RandNum2);
              System.out.println(" ");

                int w = RandNum2 - RandNum1;
                 int x = RandNum1 * RandNum2;
                  int y = RandNum1 + RandNum2;
                   int z = RandNum1 / RandNum1;

                System.out.println("Enter a answer.");
                 System.out.println("A) " +w);
                  System.out.println("B) " +x);
                   System.out.println("C) " +y);
                    System.out.println("D) " +z);
                     c = scan.next().charAt(0);

                if(c != 'B'){
                    System.out.println("Incorrect!");
                }

        }while(c != 'B' );
        System.out.println("Correct!");

    }
}
