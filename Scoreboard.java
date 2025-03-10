public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int scoreOne;
    private int scoreTwo; 

    public Scoreboard(String nameOne, String nameTwo){
       teamOne = nameOne;
       teamTwo = nameTwo;
       scoreOne = 1;
       scoreTwo = 0;
    }

    public String getScore(int n1, int n2){
        @SuppressWarnings("unused")
        String scores = " ";
        String nextUp;

        scoreOne += n1;
        scoreTwo += n2;

        if(scoreOne > scoreTwo){
            nextUp = teamTwo; 
        }
        else{
            nextUp = teamOne; 
        }

        return scores = scoreOne+ "-" +scoreTwo+ "-" +nextUp;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");

        // System.out.println("Test 1: " + game.getScore(0, 0)); // Expected: Red: 1 - Blue: 0 | Next up: Blue
        // System.out.println("Test 2: " + game.getScore(0, 1)); // Expected: Red: 1 - Blue: 1 | Next up: Red
        // System.out.println("Test 3: " + game.getScore(2, 0)); // Expected: Red: 3 - Blue: 1 | Next up: Blue



    }
}
