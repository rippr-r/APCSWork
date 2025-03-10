
import java.util.Scanner;
//Updated with Scanner!
public class ClassInfo{
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your classroom number?");
        int rnum = scan.nextInt();

         System.out.println("How may people are in your class?");
          int csize = scan.nextInt();
        
          System.out.println("What is your class name?");
           String cname = scan.next();
            cname += scan.nextLine();

           System.out.println("After submitting the current work, what is the class average? (Nearest tenth)");
            double caver = scan.nextDouble();

            System.out.println("Your class, " +cname+ " , in room " +rnum+ " has " +csize+ " people in it.");
            System.out.println("The class average after submitting all the work is, " +caver );
    }
}
