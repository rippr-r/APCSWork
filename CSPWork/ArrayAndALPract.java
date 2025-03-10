import java.util.*;
public class ArrayAndALPract {
    public static void main(String[] args) {
     Random rand = new Random();
    
     int[] arr = new int[10];
     ArrayList <Integer> al = new ArrayList <>();

     for(int i = 0; i < 10; i++){
        arr[i] = rand.nextInt(50)+1;
        //Check case -- System.out.print(arr[i]+ ", ");
     }
     for(int q = 0; q < arr.length; q++){
        al.add(arr[q]);
     }

     System.out.println("The array is: " +al);
     System.out.println("The lowest number is: " +Collections.min(al));
     //Check case  -- System.out.println(arr); 
     //Check case  -- System.out.println(al); 

        System.out.println(" \n ");  

     ArrayList <Integer> AL = new ArrayList <Integer>();
        for(int p = 0; p < 10; p++){
            AL.add(rand.nextInt(50)+1);
        }
     //Check case  -- System.out.println(AL);
     int evens = numEvens(AL);
     System.out.println("The array is: " +AL);
     System.out.println("The number of evens are: " +evens);
     
          
    }

    //Used ChatGPT to help me with this method by debugging. 
    //Those reccomended changes were added
    public static int numEvens(ArrayList<Integer> numbers) {
        int count = 0;
        for(int num : numbers) {
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
