import java.util.*;
public class Feeder {
    private int currentFood;
    private double probOfBear;

    private Random rand = new Random();
    private int randomNum;

    public Feeder(){
        currentFood = 500;
        probOfBear = .5;

        int min = 10;
        int max = 50;
        randomNum = rand.nextInt(max - min + 1) + min;
    }

    public void simulateOneDay(int numBirds){

        if(rand.nextDouble() < probOfBear){
            currentFood = 0;
        }
        else if(rand.nextDouble() > probOfBear){
            currentFood -= randomNum;
                if(currentFood < 0){
                    currentFood = 0;
                }
        }
        
        if(currentFood <= 0){
            System.out.println("The bears ate all the food!");
        }
        else{
            System.out.println("Current food after the birds ate is " +currentFood+ " grams");
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
       int numDaysEaten = 0;
        if(currentFood <= 0){
            return numDaysEaten;
       }

       for(int x = 0; x < numDays; x++){
            currentFood -= randomNum;
            numDaysEaten++;
       }
       return numDaysEaten;
    }

    public static void main(String[] args) {
        Feeder fr = new Feeder();
        fr.simulateOneDay(5);

        System.out.println(fr.simulateManyDays(5, 6));

    }
}
