package TesterThingys;
import java.util.ArrayList;
public class ArrayListPract {


    public static void main(String[] args) {
        
        String[] fruits = new String[3];
         fruits[0] = "Mango";
         fruits[1] = "Apple";
         fruits[2] = "Strawberry";
        System.out.println(fruits[2]);


        @SuppressWarnings("rawtypes")
        ArrayList fruitList = new ArrayList();
         fruitList.add("Mango");
         fruitList.add("Apple");
         fruitList.add("Strawberry");
         fruitList.add("Watermelon");
        System.out.println(fruitList);
    }
}
