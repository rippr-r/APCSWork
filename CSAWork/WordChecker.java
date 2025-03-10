import java.util.*;
public class WordChecker {
    private ArrayList<String> wordList;

    public WordChecker(){
        wordList = new ArrayList<String>();
        
        wordList.add("Cat");
        wordList.add("Catcha");
        wordList.add("Cat");



    }

    public boolean isWordChain(){
        String check = wordList.get(0);
        int checkk = 0;
        boolean checking;

        for(int x = 0; x < wordList.size() - 1; x++){
            if(wordList.get(x).contains(check)){
                checkk++;
                check = wordList.get(x);
            }

        }
        if(checkk >= wordList.size()){
            return checking = true;
        }
        else{
            return checking = false;
        }
    }

    public ArrayList<String> createList(String target){
        ArrayList<String> beginWith = new ArrayList<>();

        for(int x = 0; x < wordList.size(); x++){
            if(wordList.get(x).startsWith(target))
            beginWith.add(wordList.get(x));
        }

        return beginWith;
    }
    public static void main(String[] args) {
        WordChecker wc = new WordChecker();

        // Check if it's a valid word chain
        System.out.println("Is word chain: " + wc.isWordChain()); // Expected: false

    }    
}   

