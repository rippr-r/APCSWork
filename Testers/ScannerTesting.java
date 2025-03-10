package TesterThingys;

import java.util.Scanner;
public class ScannerTesting {
    public static void main(String[] args) {

       @SuppressWarnings("resource")
      Scanner scan = new Scanner(System.in); 
       
       //Stored as a string
       System.out.println("Whats your name?");
       String name = scan.next();

        //Stored as a integer
          System.out.println("Whats your age?");
          int age = scan.nextInt();

        //Senior quote
       System.out.println("What is your senior quote?");
       String quote = scan.next();
       //This makes the entire variable to appear as 'scan.next()' just looks for the next word and stops after the first space
       quote += scan.nextLine();

       System.out.println("Thank you, " +name+ ", you are " +age+ " years old");
        System.out.println("and your senior quote is " +quote);
    }
}
