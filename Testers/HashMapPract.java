package TesterThingys;

import java.util.*;
public class HashMapPract {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
         happy.put("a", 10);
         happy.put("b", 4);
         happy.put("c", 88);
        System.out.println(happy);
        System.out.println(happy.get("c"));
        
         System.out.println(" ");

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyjoe1996", "FluffyPonies!");
        fun.put("CharB3@r!", "1qaz@wsx");
        fun.put("helloKittyFan", "123");

          // <key> , <value>

        // fun.remove("helloKittyFan");
       //  System.out.println(fun.containsValue("123"));
      //   System.out.println(fun.containsValue("1234"));
     //    System.out.println(fun.replace("bobbyjoe1996", "B3tt3rP@ssw0rd"));

           System.out.println(fun);
           System.out.println("Passwords: " +fun.values());
           System.out.println("Usernames: " +fun.keySet());
        //System.out.println(fun.);



    }
}
