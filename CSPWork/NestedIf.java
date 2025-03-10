
import java.util.Scanner;;
public class NestedIf {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Happy Birthday! Do you want to go out or stay in for dinner?");
            System.out.println("Press 1 to go out and Press 2 to stay home");
              int userChoice = scan.nextInt();

            if(userChoice == 1){
             System.out.println("We will go out to eat!");
              System.out.println("Press 1 for Red Robin and Press 2 for Subway!");
                    int choiceOne = scan.nextInt();

                if(choiceOne == 1){
                 System.out.println("Ok! We will go to Red Robin for dinner");

                }//Ends choice 2 If
                else if(choiceOne == 2){
                 System.out.println("Ok! We will go to Subway!");

                }//ends choice 2 ElseIf

            }//ends choice 1 If
            else if(userChoice == 2){
             System.out.println("We will stay at home to eat!");
              System.out.println("Press 1 for Salmon and Press 2 for Burgers");
               
                 int choiceTwo = scan.nextInt();
                    if(choiceTwo == 1){
                     System.out.println("Ok! We will have Salmon for dinner!");

                    }
                    else if(choiceTwo == 2){
                     System.out.println("Ok! We will have Burgers for dinner!");

                    }
            }//ends choice 1 ElseIf













    }
}
