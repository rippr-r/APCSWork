import java.util.*;
public class level {
    public static level rand = new level();
    public static Scanner scan = new Scanner(System.in);
    public boolean goalReached(int points){
        if(points >= 100){
            return true;
        }
        return false;
    }

    public int getPoints(){
        if(goalReached(100)){
            return 100;
        }
    }
}
