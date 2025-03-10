import java.util.*;
import java.io.*;
public class Roulette {
    private static final String FILE_NAME = "roulette.txt";
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    private int bet;
    private int number;
    private String color;
    private static int bankMoney;

    public Roulette(){
        number = setNumber();
        color = setColor();
        bankMoney = loadRouletteMoney();
    }

    private void saveRouletteMoney() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){ //Opens the file "roulette.txt" in write mode with fileWriter
            writer.write(String.valueOf(bankMoney)); //Writes the value to the file
        } 
        catch(IOException e) { // If it can not be written then it catches the exception and prints the error code
            System.out.println("Error saving bank money.");
        }   
    }

    private int loadRouletteMoney() {
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){ //Opens the "roulette.txt" file, reading it with FileReader
            return Integer.parseInt(reader.readLine()); //Converts the text into a integer using the parseInt tool and returns
        } 
        catch(IOException | NumberFormatException e){ // If it can not read the file or it contains invalid data, it returns the default balence
            return 0; // Default starting money if file not found or error occurs
        }
    }

    private int setNumber(){
        if(color == "green"){
            return 0;
        }
        return rand.nextInt(35)+1;
    }

    private String setColor(){
        int color = rand.nextInt(3);
        if(color == 0){
            return "Red";
        }
        else if(color == 1){
            return "Black";
        }
        else{
            return "Green";
        }
    }

    private void numberBet(){
        System.out.println("Enter a number to bet on:");
        System.out.println("0 - 36");
        int num = sc.nextInt();
        if(num == number){
            System.out.println("You won! You earned " + bet*2 + " dollars!");
            bankMoney += bet*2;
            saveRouletteMoney();
        }
        else{
            System.out.println("You lost! You lost " + bet + " dollars!");
            bankMoney -= bet;
            saveRouletteMoney();
        }
    }

    private void colorBet(){
        System.out.println("Enter a color to bet on:");
        System.out.println("Red, Black, or Green");
            String col = sc.next();
        if(col.equalsIgnoreCase(color)){
            System.out.println("You won! You earned " + bet*2 + " dollars!");
            bankMoney += bet*2;
            saveRouletteMoney();
        }
        else{
            System.out.println("You lost! You lost " + bet + " dollars!");
            bankMoney -= bet;
            saveRouletteMoney();
        }
    }

    private void color_number_bet(){
        System.out.println("Enter a color to bet on:");
            String col = sc.next();
        System.out.println("Enter a number to bet on:");
        System.out.println("Reds are Even, Blacks are Odds.");
            int num = sc.nextInt();
        if(num == number && col.equalsIgnoreCase(color)){
            System.out.println("You won! You earned " + bet*2 + " dollars!");
            bankMoney += bet*2;
            saveRouletteMoney();
        }
        else{
            System.out.println("You lost! You lost " + bet + " dollars!");
            bankMoney -= bet;
            saveRouletteMoney();
        }
    }

    private void even_or_odd(){
        System.out.println("Even (E) or Odd (O)?");
            char choice = sc.next().charAt(0);
        even_odd(choice);
    }

    private void depositMoney(){
        System.out.println("How much money do you want to deposit?");
            int depo = sc.nextInt();
        System.out.println("Depositing money...");
            bankMoney += depo;
        saveRouletteMoney();
    }

    private void the_game_true(){
        System.out.println("How much do you want to bet?");
            bet = sc.nextInt();

            if(checkBet(bet)){
                System.out.println("What would you like to do?");
                System.out.println("Bet on a number (1), color (2), both (3), Even/Odd (4)?");
                int choice = sc.nextInt();

                if(choice == 1){
                    numberBet();
                }
                else if(choice == 2){
                    colorBet();
                }
                else if(choice == 3){
                    color_number_bet();
                }
                else if(choice == 4){
                    even_or_odd();
                }
            }
    }

    private void exit_the_game(){
        System.out.println("Exiting game.");
        System.out.println("You have $" +bankMoney+ ".");
        saveRouletteMoney();
    }

    private void even_odd(char C){
        if(C == 'e' || C == 'E'){
            if(check_if_even()){
                System.out.println("You won! You earned " + bet*2 + " dollars!");
                bankMoney += bet*2;
                saveRouletteMoney();
            }
            else{
                System.out.println("You lost! You lost" + bet + " dollars!");
                bankMoney -= bet;
                saveRouletteMoney();
            }
        }
        else if(C == 'o' || C == 'O'){
            if(!check_if_even()){
                System.out.println("You won! You earned " + bet*2 + " dollars!");
                bankMoney += bet*2;
                saveRouletteMoney();
            }
            else{
                System.out.println("You lost! You lost" + bet + " dollars!");
                bankMoney -= bet;
                saveRouletteMoney();
            }
        }
    }

    private boolean checkBet(int bet2){
        if(bet2 > bankMoney){
            return false;
        }
        return true;
    }

    private boolean check_if_money(){
        if(bankMoney == 0){
            return false;
        }
        return true;
    }

    private boolean check_if_even(){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    private void secondTrueMain(){
        System.out.println("Welcome to Roulette!");
        System.out.println("You have " + loadRouletteMoney() + " dollars in your bank.");
        System.out.println("What would you like to do?");
        System.out.println("Deposit (1), play (2), exit (3)?");
    }

    private void trueMain(){
        secondTrueMain();
        int game_choice = sc.nextInt();
        if(game_choice == 2){
            if(check_if_money()){
                the_game_true();
            }
            else{
                System.out.println("You need to deposit money.");
            }
        }
        else if(game_choice == 1){
            depositMoney();
        }
        else if(game_choice == 3){
            exit_the_game();
            System.exit(10);
        }
    }

    //Scroll up for complicated mess of methods.
    public static void main(String[] args) {
        Roulette roulette = new Roulette();

        for(int i = 0; i > -1; i++){
            roulette.trueMain();
            System.out.println();
        }
    }

}
