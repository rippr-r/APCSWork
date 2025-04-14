import java.util.*;
public class ConnectFour {
    static Scanner scan = new Scanner(System.in);
    private String[][] board = new String[6][7];
    private String player1_choice;
    private char one_color;
    private char two_color;
    private int currentPlayer;
    private int previousPlayer;

    public ConnectFour(){
        currentPlayer = 1;
        previousPlayer = 2;
    }

    public char get_one_color(){
        return one_color;
    }

    public char get_two_color(){
        return two_color;
    }

    public int get_currentPlayer(){
        return currentPlayer;
    }

    /*
     * Board layout:
     * ---------------
     * | | | | | | | |
     * ---------------
     * | | | | | | | |
     * ---------------
     * | | | | | | | | 
     * ---------------
     * | | | | | | | | 
     * ---------------
     * | | | | | | | |
     * ---------------
     * | | | | | | | |
     * ---------------
     */

    public void print_board(){
        System.out.println("---------------");
        for(int i = 0; i < 6; i++){
            System.out.print("|");
            for(int j = 0; j < 7; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    public void pick_color(){
        System.out.println("Please pick a color for player 1 (Red or Yellow): ");
        String color = scan.nextLine();
        while(!color.equalsIgnoreCase("Red") && !color.equalsIgnoreCase("Yellow")){
            System.out.println("Invalid input. Please pick a color for player 1 (Red or Yellow): ");
            color = scan.nextLine();
            player1_choice = color;
            
        }
        player1_choice = color;

        if(player1_choice.equalsIgnoreCase("Red")){
            one_color = 'R';
            two_color = 'Y';
        } 
        else{
            one_color = 'Y';
            two_color = 'R';
        }
    }

    public void set_board(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                board[i][j] = " ";
            }
        }
    }

    public void drop_piece(int column){
        for(int i = 5; i >= 0; i--){
            if(board[i][column].equals(" ")){
                if(currentPlayer == 1){
                    board[i][column] = String.valueOf(one_color);
                    currentPlayer = 2;
                    previousPlayer = 1;
                } 
                else{
                    board[i][column] = String.valueOf(two_color);
                    currentPlayer = 1;
                    previousPlayer = 2;
                }
                return;
            }
        }
    }

    // Used Github AI to help with this function, used to help generate the repetitive code like all the loops once the horizontal loop was made.
    public boolean check_winner(){
        // Check horizontal
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 4; j++){
                if(board[i][j].equals(String.valueOf(one_color)) && board[i][j+1].equals(String.valueOf(one_color)) && board[i][j+2].equals(String.valueOf(one_color)) && board[i][j+3].equals(String.valueOf(one_color))){
                    return true;
                    } 
                else if(board[i][j].equals(String.valueOf(two_color)) && board[i][j+1].equals(String.valueOf(two_color)) && board[i][j+2].equals(String.valueOf(two_color)) && board[i][j+3].equals(String.valueOf(two_color))){
                    return true;
                }
            }
        }

        // Check vertical
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 7; j++){
                if(board[i][j].equals(String.valueOf(one_color)) && board[i+1][j].equals(String.valueOf(one_color)) && board[i+2][j].equals(String.valueOf(one_color)) && board[i+3][j].equals(String.valueOf(one_color))){
                    return true;
                } 
                else if(board[i][j].equals(String.valueOf(two_color)) && board[i+1][j].equals(String.valueOf(two_color)) && board[i+2][j].equals(String.valueOf(two_color)) && board[i+3][j].equals(String.valueOf(two_color))){
                    return true;
                }
            }
        }

        // Check diagonal (bottom left to top right)
        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 4; j++){
                if(board[i][j].equals(String.valueOf(one_color)) && board[i-1][j+1].equals(String.valueOf(one_color)) && board[i-2][j+2].equals(String.valueOf(one_color)) && board[i-3][j+3].equals(String.valueOf(one_color))){
                    return true;
                } 
                else if(board[i][j].equals(String.valueOf(two_color)) && board[i-1][j+1].equals(String.valueOf(two_color)) && board[i-2][j+2].equals(String.valueOf(two_color)) && board[i-3][j+3].equals(String.valueOf(two_color))){
                    return true;
                }
            }
        }

        // Check diagonal (top left to bottom right)
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                if(board[i][j].equals(String.valueOf(one_color)) && board[i+1][j+1].equals(String.valueOf(one_color)) && board[i+2][j+2].equals(String.valueOf(one_color)) && board[i+3][j+3].equals(String.valueOf(one_color))){
                    return true;
                } 
                else if(board[i][j].equals(String.valueOf(two_color)) && board[i+1][j+1].equals(String.valueOf(two_color)) && board[i+2][j+2].equals(String.valueOf(two_color)) && board[i+3][j+3].equals(String.valueOf(two_color))){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check_if_full(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                if(board[i][j].equals(" ")){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check_column_is_full(int column){
        for(int i = 0; i < 6; i++){
            if(board[i][column].equals(" ")){
                return false;
            }
        }
        return true;
    }

    public void startgame(){
        pick_color();
        set_board();

        while(!check_winner()){
            print_board();
            System.out.println("Player " + currentPlayer + "'s turn. Choose a column (0-6): ");
            int column = scan.nextInt();
            while(column < 0 || column > 6 || check_column_is_full(column)){
                if(column < 0 || column > 6){
                    System.out.println("Invalid input. Choose a column (0-6): ");
                } 
                else if(check_column_is_full(column)){
                    System.out.println("Column " + column + " is full. Choose another column: ");
                }
                column = scan.nextInt();
            }
            drop_piece(column);
            
            if(check_winner()){
                print_board();
                System.out.println("Player " + previousPlayer + " wins!");
                break;
            }
            if(check_if_full()){
                print_board();
                System.out.println("It's a tie!");
                break;
            }
        }
    }
}

