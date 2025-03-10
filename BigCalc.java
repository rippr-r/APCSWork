

import java.util.Scanner;
import java.util.Random;
public class BigCalc{
   public static Scanner scan = new Scanner(System.in);
   public static void main(String[] args){
      String ans;
      do{
         System.out.println("Would you like to answer a math question, y/n?");
         ans = scan.next();
         if(ans.equalsIgnoreCase("n")){
            System.out.println("K, byeee.");
            System.exit(0);
         }
         System.out.println("Enter the type of question you want to answer: (+, -, *, /, %):");
         char op = scan.next().charAt(0); 
         
         Random rand = new Random();
         int num1 = rand.nextInt(10) + 1;
         int num2 = rand.nextInt(10) + 1;

         if(op == '+'){
            System.out.println("What is:");
             System.out.println(num1+ " + " +num2);
                int answer = scan.nextInt();
             if(answer == add(num1, num2)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
         }//Ends +
         else if(op == '-'){
            System.out.println("What is:");
             System.out.println(num1+ " - " +num2);
                int answer = scan.nextInt();
             if(answer == sub(num1, num2)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
         }//Ends -
         else if(op == '*'){
            System.out.println("What is:");
             System.out.println(num1+ " * " +num2);
                int answer = scan.nextInt();
             if(answer == mul(num1, num2)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
         }//Ends *
         else if(op == '/'){
            System.out.println("What is:");
             System.out.println(num1+ " / " +num2);
                int answer = scan.nextInt();
             if(answer == div(num1, num2)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
         }//Ends /
         else if(op == '%'){
            System.out.println("What is:");
             System.out.println(num1+ " % " +num2);
                int answer = scan.nextInt();
             if(answer == mod(num1, num2)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
         }//Ends %

      }while(ans.equalsIgnoreCase("y"));
   }// end main

public static int add(int n1, int n2){
    int sum; 
    sum = n1 + n2;
    return sum;
}
public static int sub(int n1, int n2){
    int dif;
    dif = n1 - n2;
    return dif;
}
public static int mul(int n1, int n2){
    int mul;
    mul = n1 * n2;
    return mul;
}
public static int div(int n1, int n2){
    int div;
    div = n1 / n2;
    return div;
}
public static int mod(int n1, int n2){
    int mod;
    mod = n1 % n2;
    return mod;
}
}//ends class
