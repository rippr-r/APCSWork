import java.util.Random;
public class LightBoard {
    private double prob = 0.4; //40% chance of being of being on 
    private Random rand = new Random();
    private boolean[] [] lights;
                // X , Y 

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];

        for(int row = 0; row < numRows; row++){
            for(int col = 0; col < numCols; col++){
                lights[row][col] = rand.nextDouble() < prob; 
            }
        }
    }  
    
    public boolean evaluateLight(int row, int col){ 
            return lights[row][col]; 
    
        }
    
        public static void main(String[] args) {
            LightBoard board = new LightBoard(5,7); //Create a instance

            int x = 4;
            int y = 3;

            System.out.println("The location " +x+ " " +y+ " is:");
             System.out.println(board.evaluateLight(x, y));
    }
}
