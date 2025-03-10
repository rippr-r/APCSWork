
import java.util.*;
public class NonVoidMethodPractice {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String meat = pza();
        System.out.println("The customer wants the following toppings");
        System.out.println(meat);


    }//Ends Main
    public static String pza(){

        System.out.println("Welcome to Papa Johns");
         System.out.println("Choose a meat for your pizza, 1 for Pepperoni, 2 for Ham, 3 for Sausage");
          int meat = scan.nextInt();
           String choiceMeat = " ";
        if(meat == 1){
            choiceMeat = "Pepperoni";
        }
        else if(meat == 2){
            choiceMeat = "Ham";
        }
        else if(meat == 3){
            choiceMeat = "Sausage";
        }
        else{
            choiceMeat = "No meat";
        }
        return choiceMeat;
    }//Ends pza
}//Ends Class
