
import java.util.Scanner;
public class LoopsPract {
    public static void main(String[] args) {
        
        int sumA = 0;
       for(int j = 0; j <= 100; j++){
            sumA += j;
       }

       int average = sumA /100;
       System.out.println("Sum: " +sumA);
       System.out.println("Average: " +average);


       
       System.out.println(" ");
       System.out.println(" ");
       


        for(int i = 0; i <= 100; i++){
            int sum = i + i;
            System.out.println(sum);
        }


        System.out.println(" ");
        System.out.println(" ");



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word.");
        String word = scan.next();

        for(int k = 0; k < word.length(); k++){
            char letter = word.charAt(k);
            System.out.print(letter+ " ");
        }



        System.out.println(" ");
        System.out.println(" ");



        Scanner scanA = new Scanner(System.in);

        System.out.println("Enter a word.");
        String wordA  = scan.next();

        for(int k = wordA.length() - 1; k >= 0; k--){
            System.out.print(wordA.charAt(k));
        }






    }
}
