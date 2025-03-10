import java.util.*;
import java.io.*;
public class BlackJack{
    private static final String FILE_NAME = "blackjack_money.txt";
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    private int dealer_card_one;
    private int dealer_card_two;
    private int player_card_one;
    private int player_card_two;

    private int dealer_hand;
    private int player_hand;

    private int split_one;
    private int split_two;

    private int jackMoney;
    
        private int bet;
    
        public BlackJack(){
            dealer_card_one = rand.nextInt(10)+1;
            dealer_card_two = rand.nextInt(10)+1;
            player_card_one = rand.nextInt(10)+1;
            player_card_two = rand.nextInt(10)+1;
    
            //Hands
            dealer_hand = dealer_card_one + dealer_card_two;
            player_hand = player_card_one + player_card_two;
    
            //Split 
            split_one = player_card_one;
            split_two = player_card_two;
    
            //Money
            jackMoney = loadJackMoney();
        }
    
         public void saveJackMoney(){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){ //Opens the file "bankMoney" in write mode with fileWriter
                writer.write(String.valueOf(jackMoney)); //Writes the value to the file
            } 
            catch(IOException e){ // If it can not be written then it catches the exception and prints the error code
                System.out.println("Error saving bank money.");
            }   
        }
    
        public int loadJackMoney(){
            try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){ //Opens the "bankMoney" file, reading it with FileReader
                return Integer.parseInt(reader.readLine()); //Converts the text into a integer using the parseInt tool and returns
            } 
            catch(IOException | NumberFormatException e){ // If it can not read the file or it contains invalid data, it returns the default balence
                return 0; // Default starting money if file not found or error occurs
            }
        }
    
        public void player_choice(int choice){
            if(choice == 1){ //Hit
                int newCard = rand.nextInt(10)+1;
                player_hand += newCard;
                System.out.println("You drew a " + newCard);
                System.out.println("Your hand is now " + player_hand);
    
                if(player_hand > 21){
                    System.out.println("You busted! Dealer wins.");
                    jackMoney -= bet;
                    saveJackMoney();
                    return;
                } 
                else{
                    player_questions();
                }
            }
            else if(choice == 2){ //Stay
                dealer_questions();
            }
            else if(choice == 3 && player_card_one == player_card_two){ //Split
                splits();
                split_one_player_questions();
            }
        }
    
        public void player_questions(){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Hit");
            System.out.println("2. Stay");
            if (player_card_one == player_card_two) {
                System.out.println("3. Split");
            }
            int choice = sc.nextInt();
            player_choice(choice);
        }
    
        public void splits(){
            System.out.println("You split your hand!");
            System.out.println("Your first hand is " + split_one);
            System.out.println("Your second hand is " + split_two);
        }
    
        public void split_one_player_questions(){
            System.out.println("What do you want to do with your first hand?");
            System.out.println("1. Hit");
            System.out.println("2. Stay");
            int choice = sc.nextInt();
            if (choice == 1){
                int newCard = rand.nextInt(10)+1;
                split_one += newCard;
                System.out.println("You drew a " + newCard);
                System.out.println("Your first hand is now " + split_one);
                if(split_one > 21){
                    System.out.println("You busted on this hand.");
                    jackMoney -= bet;
                    saveJackMoney();
                }
            }
            split_two_player_questions();
        }
    
        public void split_two_player_questions(){
            System.out.println("What do you want to do with your second hand?");
            System.out.println("1. Hit");
            System.out.println("2. Stay");
            int choice = sc.nextInt();
            if(choice == 1){
                int newCard = rand.nextInt(10)+1;
                split_two += newCard;
                System.out.println("You drew a " + newCard);
                System.out.println("Your second hand is now " + split_two);
                if (split_two > 21) {
                    System.out.println("You busted on this hand.");
                    jackMoney -= bet;
                    saveJackMoney();
                }
            }
            dealer_questions();
        }
    
        public void dealer_questions(){
            System.out.println("The dealer's hidden card was " + dealer_card_two);
            System.out.println("The dealer's hand is " + dealer_hand);
    
            while(dealer_hand < 17){
                int newCard = rand.nextInt(10)+1;
                dealer_hand += newCard;
                System.out.println("The dealer drew a " + newCard);
                System.out.println("The dealer's hand is now " + dealer_hand);
            }
    
            if(dealer_hand > 21){
                System.out.println("The dealer busted! You win!");
                    if(player_hand == 21 || bet == jackMoney){
                        jackMoney += bet * 2;
                        saveJackMoney();
                    } 
                    else{
                        jackMoney += bet;
                        saveJackMoney();
                    }
            }
            else if (dealer_hand > player_hand){
                System.out.println("The dealer wins!");
                jackMoney -= bet;
                saveJackMoney();
            } 
            else if (dealer_hand < player_hand){
                System.out.println("You win!");
                    if(player_hand == 21 || bet == jackMoney){
                        jackMoney += bet * 2;
                        saveJackMoney();
                    } 
                    else{
                        jackMoney += bet;
                        saveJackMoney();
                    }

            } 
            else{
                System.out.println("It's a tie!");
                saveJackMoney();
            }
        }
        
        public void betting(){
            System.out.println("You have $" +jackMoney);
            System.out.println("How much money do you want to bet?");
            bet = sc.nextInt();
        }
    
        public void deposit_money(){
            System.out.println("How much money do you want to deposit?");
            int depo = sc.nextInt();
            System.out.println("Depositing money...");
            jackMoney += depo;
            saveJackMoney();
        }
    
        public void outputs(){
            System.out.println("\nWelcome to BlackJack!");
            System.out.println("\nTry to get as close to 21 as possible without going over.");
            System.out.println("\nDealer's first card: " + dealer_card_one);
            System.out.println("Your cards: " + player_card_one + " and " + player_card_two);
            System.out.println("Your total: " + player_hand);
        }
    
        public boolean bet_is_more(int bet){
            if(bet > jackMoney){
                return true;
            }
            return false;
        }
    
        public boolean bet_is_zero(){
            if(jackMoney == 0){
                return true;
            }
            return false;
        }
    
        public void trueMain(){
            if(bet_is_zero()){
                System.out.println("You have no money in your account.");
                deposit_money();
            }
            betting();
            outputs();
            player_questions();
        }

        public void exiting(){
            System.out.println("Thanks for playing!");
            System.out.println("Saving money...");
            System.out.println("You have $" +jackMoney);
            saveJackMoney();
            System.exit(10);
        }
    
        public static void main(String[] args){
            BlackJack blackjack = new BlackJack();
            boolean playAgain = true;
    
            while(playAgain){
                blackjack.trueMain();
    
                System.out.println("\nDo you want to play again? (yes/no)");
                String response = sc.next().toLowerCase();
                playAgain = response.equals("yes");
            }
            blackjack.exiting();
    }
}
