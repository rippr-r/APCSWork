
import java.util.Scanner;
//Updated with Scanner!!
public class DogsAndSchools {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
         String name = scan.nextLine();
        System.out.println("What is your 1st dog's name?");
         String dogOne = scan.nextLine();
        System.out.println("What is your 2nd dog's name?");
         String dogTwo = scan.nextLine();

        System.out.println("When did you graduate from college?");
         int humGrad = scan.nextInt();
        System.out.println("When did your first dog graduate from PetSmart Obedience School?");
         int dogyOne = scan.nextInt();
         System.out.println("When did your Second dog graduate from PetSmart Obedience School?");
         int dogyTwo = scan.nextInt();
         
         System.out.println("My name is " +name+ ", and I graduated from college in " +humGrad);
          System.out.println("My first dog's name is " +dogOne+ ", and they gradutated from PetSmart Obedience School" +dogyOne);
           System.out.println("My second dog's name is " +dogTwo+ ", and they gradutated fromPetSmart Obedience School " +dogyTwo);
    }
}
