import java.util.*;
public class GameOfChance {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    private int die;
    private String coin;
    private String spinner;

    public GameOfChance(){
        die = setDie();
        coin = setCoin();
        spinner = setSpinner();
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
            return coin = "Heads";
        }
        else{
            return coin = "Tails";
        }
    }

    public String setSpinner(){
        int spinnerSpin = rand.nextInt(4)+1;
        if(spinnerSpin == 1){
            return spinner = "Red";
        }
        else if(spinnerSpin == 2){
            return spinner = "Green";
        }
        else if(spinnerSpin == 3){
            return spinner = "Blue";
        }
        else{
            return spinner = "Yellow";
        }
    }

    //How many were right and return what was rolled for each private variable
    public void returnStates(int n1, String n2, String n3){
        int right = 0;

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

        System.out.println("You got " +right+ " correct!" );
    }

    //Main method 
    public static void main(String[] args) {
        System.out.println("Welcome to the Game of Chance!");   
            GameOfChance game = new GameOfChance();
            int guessedDie = game.diceRoll();
            String guessedCoin = game.coinFlip();
            String guessedSpinner = game.spinnerSpin();

            game.returnStates(guessedDie, guessedCoin, guessedSpinner);
    }
    
}
