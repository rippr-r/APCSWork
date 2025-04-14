import java.util.*;
public class WordleProject {
    static Scanner scan = new Scanner(System.in);
    private String[][] guess_display = new String[12][5];
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String word;
    private String guess;
    private int guess_count = 0;

    public boolean word_length(String guess){
        if(guess.length() != 5){
            System.out.println("Please enter a 5 letter word.");
            return false;
        }
        return true;
    }

    public void set_word(){
        System.out.println("Please enter a 5 letter word.");
        System.out.println("All characters must be upper letters.");
        String word = scan.nextLine();
        while(!word.equals(word.toUpperCase()) || !word_length(word)){
            System.out.println("Please enter a 5 letter word. ");
            System.out.println("All characters must be upper letters.");
            word = scan.nextLine();
        }
        this.word = word;
    }

    public void set_guess(){
        System.out.println("Please enter your guess");
        System.out.println("5 letter word and All characters must be upper letters.");
        String guess = scan.nextLine();
        while(!guess.equals(guess.toUpperCase()) || !word_length(guess)){
            System.out.println("Please enter a 5 letter word. ");
            System.out.println("All characters must be upper letters.");
            guess = scan.nextLine();
        }
        this.guess = guess;
        for(int i = 0; i < 5; i++){
            guess_display[guess_count * 2][i] = String.valueOf(guess.charAt(i)); //stores the current guess in the guess_display array at the even rows (guess_count * 2)
        }
    }

    public String get_word(){
        return word;
    }

    public String get_guess(){
        return guess;
    }

    public void clrscr(){
        for(int i = 0; i < 50; ++i) {
            System.out.println();
        }
    } 

    public void true_main(){
        set_word();
        clrscr();

        while(guess_count < 6){
            set_guess();
            check_guess();
            update_alphabet();
            guess_count++;

            if(guess.equals(word)){
                System.out.println("Congratulations! You guessed the word!");
                System.out.println("This took you " +guess_count+ " tries.");
                print_guess_display();
                break;
            }
            else if(guess_count == 6){
                System.out.println("Sorry, you've used all your tries. The word was: " + word);
                break;
            }
        }
    }

    //Even rows of guess_display = the guess
    //Odd rows of guess_display = clues 
    // * = Correct 
    //@ = Correct, Wrong place
    //x = Incorrect and not used
    //Used GitHub Copilot to help debug this method and to give me ideas on how to improve this method
    public void check_guess() {
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Convert the word and guess to character arrays for easier comparison
        char[] wordChars = word.toCharArray();
        char[] guessChars = guess.toCharArray();
        
        // Create a boolean array to track which letters in the word have been matched
        boolean[] matched = new boolean[word.length()];

        // First pass: Check for exact matches (green `*`)
        for(int i = 0; i < wordChars.length; i++){
            if(guessChars[i] == wordChars[i]){
                result.append("*"); // Exact match
                matched[i] = true; // Mark this letter as matched
            } 
            else{
                result.append("x");
                matched[i] = false; 
            }
        }

        // Second pass: Check for letters in the wrong position (yellow `@`)
        for(int i = 0; i < guessChars.length; i++){
            if(result.charAt(i) == 'x'){ // Only check letters that are not exact matches
                for(int j = 0; j < wordChars.length; j++){
                    if(!matched[j] && guessChars[i] == wordChars[j]){
                        result.setCharAt(i, '@'); // Update to yellow `@`
                        matched[j] = true; // Mark this letter as matched
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < 5; i++){
            guess_display[guess_count * 2 + 1][i] = String.valueOf(result.charAt(i)); //stores the clue in the guess_display array at the odd rows (guess_count * 2 + 1)
        }

        // Print the result
        System.out.println("Clue: " + result.toString());
    }

    public void update_alphabet(){
        // Iterate through the guessed word
        for(int i = 0; i < guess.length(); i++){
            char guessedChar = guess.charAt(i);

            // Replace the guessed character in the alphabet array with '#'
            for(int j = 0; j < alphabet.length; j++){
                if(alphabet[j] == guessedChar){
                    alphabet[j] = '#';
                    break;
                }
            }
        }

        // Print the updated alphabet array
        System.out.println("Remaining Letters:");
        for(char c : alphabet){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    //Used GitHiub Copilot to help debug this method
    public void print_guess_display(){
        System.out.println("\nGuess Display:");
        for(int i = 0; i < guess_count * 2; i++){
            for(int j = 0; j < 5; j++){
                if(guess_display[i][j] != null){ // Only prints non null values
                    System.out.print(guess_display[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }

    public void display_2D(){
        for(int i = 0; i < guess_display.length; i++){
            for(int j = 0; j < guess_display[i].length; j++){
                System.out.print(guess_display[i][j] + " ");
            }
            System.out.println();
        }
    }
}
