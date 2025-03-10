package TesterThingys;

import java.util.*;
public class ArrayPract {

    public static void main(String[] args) {

        //Item / Zombie Arrays
        String backpack[] = {"Shotgun", "Assualt Rifle", "Sniper", "Pistol"};
         String zombies[] = {"Close Zombies", "Mid Zombies", "Far Zombies"};

        System.out.println("Backpack Items:");
         System.out.println(backpack[0]);
          System.out.println(backpack[1]);
           System.out.println(backpack[2]);


        System.out.println("Zombies You'll Find:");
         System.out.println(zombies[0]);
          System.out.println(zombies[1]);
           System.out.println(zombies[2]);
 
        int numbers[] = {4, 90, 556, 51, 123};
        
        System.out.println(numbers[4]);



System.out.println(" \n \n \n \n ");

String[] catnames = {"Lucy", "Bo", "Max"};

        //1st Way
        System.out.print(catnames[0]+ ", ");
        System.out.print(catnames[1]+ ", ");
        System.out.print(catnames[2]+ ", ");

        System.out.println("\n \n");

        //2nd Way
        for(int i = 0; i<3; i++){
            System.out.print(catnames[i]+ ", ");
        }

        //-------------
        System.out.println("\n \n");

        int[] testscores = {100, 100, 82, 9, 75};

        for(int k = 0; k< testscores.length ; k++){
            System.out.print(testscores[k]+ ", ");
        }
        //------------

        System.out.println("\n \n");
        Scanner scan = new Scanner(System.in);

        int[] ages = new int[10];

        for(int m = 0; m < 10; m++ ){
         System.out.println("Enter your age");
            int userAge = scan.nextInt();

            ages[m] = userAge;
        }
        
          
        System.out.println("guess if a number is in the array");
        int num = scan.nextInt();
        boolean answer = false;
        for(int s = 0; s<ages.length; s++ ){
            if(num == ages[s]){
                answer = true;
            }
        }
        if(answer == true){
            System.out.println("yay");
        }




  
    }
}
