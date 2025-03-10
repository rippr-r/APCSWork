import java.util.*;
import java.io.*;

public class GameOfChanceV2 {
        private static final String FILE_NAME = "bankMoney.txt";
        static Scanner sc = new Scanner(System.in);
        static Random rand = new Random();

        private String coin;
        private String spinner;
        private static int bankMoney;
        private static int bet;
        private static int right;
    
        public GameOfChanceV2(){
            setDie();
            coin = setCoin();
            spinner = setSpinner();
            bankMoney = loadBankMoney();
        }
    
        public void saveBankMoney() {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){ //Opens the file "bankMoney" in write mode with fileWriter
                writer.write(String.valueOf(bankMoney)); //Writes the value to the file
            } 
            catch(IOException e) { // If it can not be written then it catches the exception and prints the error code
                System.out.println("Error saving bank money.");
            }   
        }

        public int loadBankMoney() {
            try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){ //Opens the "bankMoney" file, reading it with FileReader
                return Integer.parseInt(reader.readLine()); //Converts the text into a integer using the parseInt tool and returns
            } 
            catch(IOException | NumberFormatException e){ // If it can not read the file or it contains invalid data, it returns the default balence
                return 0; // Default starting money if file not found or error occurs
            }
        }

        // methods for guessing VV
        public int diceRoll(){
            int attempts = 0;
            System.out.println("");
            System.out.println("Guess what number you rolled (1-6)");
                int dice = sc.nextInt();

            //If the DICE value is greater than 6 and less than 1 VV
            for(int x = 0; x < 4; x++){
                if(dice < 1 || dice > 6){
                    attempts++;
                    if(attempts == 3){
                        System.out.println("You have reached the maximum number of attempts");
                        System.exit(10);
                    }
                    System.out.println("Invalid number, please enter a number between 1 and 6");
                    dice = sc.nextInt();
                }
            }
            return dice;
        }
    
        public String coinFlip(){
            int attempts = 0;
            System.out.println("");
            System.out.println("Guess what side the coin landed on");
            System.out.println("Heads or Tails");
                String coins = sc.next();
            for(int x = 0; x < 4; x++){
                if(!coins.equalsIgnoreCase("Heads") && !coins.equalsIgnoreCase("Tails")){
                    attempts++;
                    if(attempts == 3){
                        System.out.println("You have reached the maximum number of attempts");
                        System.exit(10);
                    }
                    System.out.println("Invalid choice, please enter a valid side");
                    coins = sc.next();
                    }
                }
            return coins;
        }
    
        public String spinnerSpin(){
            int attempts = 0;
            System.out.println("");
            System.out.println("Guess what color the spinner landed on");
            System.out.println("Red, Green, Blue, or Yellow");
                String spin = sc.next();
            for(int x = 0; x < 4; x++){
                if(!spin.equalsIgnoreCase("Red") && !spin.equalsIgnoreCase("Green") && !spin.equalsIgnoreCase("Blue") && !spin.equalsIgnoreCase("Yellow")){
                    attempts++;
                    if(attempts == 3){
                        System.out.println("You have reached the maximum number of attempts");
                        System.exit(10);
                    }
                    System.out.println("Invalid choice, please enter a valid color");
                    spin = sc.next();
                    }
                }
            return spin;
        }
    
    
        //Assignemnts of statics
        public int setDie(){
            return rand.nextInt(6)+1;
        }
    
        public String setCoin(){
            int coinFlip = rand.nextInt(2);
                if(coinFlip == 0){
                    coin = "Heads";
                }
                else{
                    coin = "Tails";
                }
            return coin;
        }
    
        public String setSpinner(){
            int spinnerSpin = rand.nextInt(4)+1;
                if(spinnerSpin == 1){
                    spinner = "Red";
                }
                else if(spinnerSpin == 2){
                    spinner = "Green";
                }
                else if(spinnerSpin == 3){
                    spinner = "Blue";
                }
                else{
                    spinner = "Yellow";
                }
            return spinner;
        }
    
        //How many were right and return what was rolled for each private variable
        public void returnStates(int n1, String n2, String n3){
            int die = setDie(); 
            String coin = setCoin(); 
            String spinner = setSpinner(); 
    
            System.out.println("");
            System.out.println("The die rolled a " + die);
            System.out.println("The coin landed on " + coin);
            System.out.println("The spinner landed on " + spinner);
    
            if(n1 == die){
                right++;
            }
            if(n2.equalsIgnoreCase(coin)){
                right++;
            }
            if(n3.equalsIgnoreCase(spinner)){
                right++;
            }
    
            money_formula(right, bet);
        }
    
        public void money_formula(int right, int bet){
            if(right == 1){
                System.out.println("You won 1 time! Addng the bet to your bank!");
                bankMoney += bet;
            }
            else if(right == 2){
                System.out.println("You won 2 times! Doubling the bet!");
                bankMoney += bet * 2;
            }
            else if(right == 3){
                System.out.println("You won 3 times! Tripling the bet!");
                bankMoney += bet * 3;
            }
            else{
                System.out.println("You lost it all!");
                bankMoney -= bet;
            }
        }

        public void loop_for_choices(){
            right = 0;
            System.out.println("You have: $"+bankMoney+ " in your bank");
            System.out.println("What do you want to do?"); 
            System.out.println("1. Deposit money");
            System.out.println("2. Play a game");
            System.out.println("3. Exit game");
            int choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("How much money do you want to deposit?");
                        int depo = sc.nextInt();
                    System.out.println("Depositing money...");
                        bankMoney += depo;
                    saveBankMoney();
                }
                else if(choice == 2){
                    System.out.println("");
                    System.out.println("How much money do you want to bet?");
                        bet = sc.nextInt();
                    if(bets(bet)){
                        int guessedDie = diceRoll();
                        String guessedCoin = coinFlip();
                        String guessedSpinner = spinnerSpin();

                        returnStates(guessedDie, guessedCoin, guessedSpinner);
                        saveBankMoney();
                    }
                    else{
                        System.out.println("Please deposit money into the account.");
                    }
                    
                }
                else if(choice == 3){
                    System.out.println("Exiting game.");
                    System.out.println("You have $" +bankMoney+ ".");
                    saveBankMoney();
                    System.exit(10);
                }
        }

        public boolean bets(int bet){
            if(bet > bankMoney){
                return false;
            }
            else{
                return true;
            }
        }

        //Main method 
        public static void main(String[] args) {
            System.out.println("Welcome to the Game of Chance!");
            GameOfChanceV2 game = new GameOfChanceV2();

            for(int x = 0; x > -1; x++){
                game.loop_for_choices();
                System.out.println("");
            }  
        }
}