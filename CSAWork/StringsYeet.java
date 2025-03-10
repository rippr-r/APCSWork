import java.util.*;
public class StringsYeet {
    static Scanner scan = new Scanner(System.in);
    public void trueMain(){
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        
        System.out.println("The reverse of the string is: ");
        System.out.println(reverseString(str));
        System.out.println("The number of vowels in the string is: ");
        System.out.println(countVowels(str));
    }

    public static String reverseString(String s1){
        String s2 = "";
        for(int i = s1.length()-1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        return s2;
        
    }
    public int countVowels(String s1){
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < s1.length(); i++){
            if(vowels.contains(s1.substring(i, i+1))){
                return 1 + countVowels(s1.substring(i+1));
            }
        }
        return 0;
    }
    public static void main(String[] args){
        StringsYeet yeet = new StringsYeet();
        yeet.trueMain();
    }
}
