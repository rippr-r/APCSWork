import java.util.ArrayList;
public class DelimiterChecker{
    private String openDel;
    private String closeDel;

    public DelimiterChecker(){
        //Default delimiters
        openDel = "(";
        closeDel = ")";
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delimits = new ArrayList<>();

        for(int x = 0; x < tokens.length; x++){
            if(tokens[x].equals(openDel) || tokens[x].equals(closeDel)){
                delimits.add(tokens[x]);
            }
        }

        return delimits;
    }


    public boolean isBalenced(ArrayList<String> delimiters){
            boolean balance; //Return
            int openCount = 0;
            int closedCount = 0; 
    
            for(int x = 0; x < delimiters.size(); x++){
                if(delimiters.get(x).equals(openDel)){
                    openCount++;
                }
                else if(delimiters.get(x).equals(closeDel)){
                    closedCount++;
                }
            }
            if(openCount == closedCount){
                balance = true;
            }
            else{
                balance = false;
            }
    
            return balance;
    }
    
    public static void main(String[] args) {
        DelimiterChecker checker = new DelimiterChecker(); // Create an instance

        String[] tokens = {"a", "(", "b", "+", "c", ")", "d", "(", ")"};
        ArrayList<String> delimiting = checker.getDelimitersList(tokens);

        // Expected Output: ["(", ")", "(", ")"]
            System.out.println(delimiting); 

        //Balence checker V
            ArrayList<String> delimiters = new ArrayList<>();
            delimiters.add("(");
            delimiters.add("(");
            delimiters.add(")");
            delimiters.add(")");
    
                System.out.println(checker.isBalenced(delimiters)); // Output: true
    
            ArrayList<String> unbalanced = new ArrayList<>();
            unbalanced.add("(");
            unbalanced.add(")");
            unbalanced.add(")");
    
                System.out.println(checker.isBalenced(unbalanced)); // Output: false
    }
}