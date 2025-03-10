public class WordMatch {
    private String secret; 

        public WordMatch(String word){
            secret = word;
        }

        public int scoreGuess(String guess){
            int num = 0;
            for(int x = 0; x < secret.length(); x++){
                if(secret.substring(x).equalsIgnoreCase(guess)){
                    num++;
                }
            }
            return num * guess.length() * guess.length();
        }

        public String findBetterGuess(String guess1, String guess2){
            if(scoreGuess(guess1) > scoreGuess(guess2)){
                return guess1;
            }
            else if(scoreGuess(guess2) > scoreGuess(guess1)){
                return guess2;
            }
            else if(guess1.compareTo(guess2) > 0){
                return guess1;
            }
            return guess2;
        }
        
}
