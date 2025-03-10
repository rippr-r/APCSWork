import java.util.*;
public class JavaPract8 {
    public static void main(String[] args) {
     ArrayList <String> words = new ArrayList <String>();
        words.add("This");
        words.add("Not");
        words.add("A");
        words.add("Lists");
        words.add("Of");
        words.add("Words!");
     System.out.println(words);

        System.out.println("\n");
    
   
   Scanner scan = new Scanner(System.in);
     Random rand = new Random();
     ArrayList <Integer> random = new ArrayList <Integer>();
         for(int i = 0; i < 5; i++){
            random.add(rand.nextInt(10)+1);
         }
         // Check case - System.out.println(random);
     System.out.println("Enter a number 1 - 10 to see if it is contained within the ArrayList");
         int r = scan.nextInt();
         if(random.contains(r)){
            System.out.println("You Pass!");
            System.out.println(random);
         }
         else{
            System.out.println("You failed!");
            System.out.println(random);
         }

        System.out.println(" \n ");
     ArrayList <Integer> large = new ArrayList <Integer>();
         for(int x = 0; x < 10; x++){
            large.add(rand.nextInt(50)+1);
         }
         //Used help from geeksforgeeks.org
         int max = Collections.max(large);
     System.out.println(large);
     //Check case -- System.out.println(max);
     System.out.println("The largest number in the array is: " +max);
     System.out.println("It is located at position: " +large.indexOf(max));
     //If duplicates -- System.out.println("It is located at position (if duplicates): " +large.lastIndexOf(max));
         
     
    }
}
