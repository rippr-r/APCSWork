import java.util.*;
public class Game {
    //Has errors but is the rough outline of the code

    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);
    private int levelOne;
    private int levelTwo;
    private int levelThree;

    public Game(){
        levelOne = rand.nextInt(1, 10);
        levelTwo = rand.nextInt(1, 10);
        levelThree = rand.nextInt(1, 10);
    }

    public void play(){

    }

    public boolean isBonus(){
        if(levelOne == levelTwo && levelTwo == levelThree){
            return true;
        }
        return false;
    }

    public int getPoints(){
        
    }

    public int playManyTimes(int n){

    }

}
