import java.util.*;
public class ArrayListPract2 {
    public static void main(String[] args) {
        ArrayList <Integer> scores = new ArrayList <Integer>();
         scores.add(98);
         scores.add(86);

        System.out.println(scores);
        scores.add(1, 76);
        System.out.println(scores);
         System.out.println("Size of list: " +scores.size());
         System.out.println("is the list empty? " +scores.isEmpty());
         System.out.println("Does it contain 100? " +scores.contains(100));
         System.out.println("Does it contain 76? " +scores.contains(76));
         System.out.println("Where is 76? " +scores.indexOf(76));
         System.out.println("Where is 100 located? " +scores.indexOf(100));
        
        scores.add(2, 98);
        System.out.println(scores);
        System.out.println("where is the last index of 98? " +scores.lastIndexOf(98));
    }
}
