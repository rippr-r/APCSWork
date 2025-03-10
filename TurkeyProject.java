import java.util.*;
public class TurkeyProject {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Welcome to the Thanksgiving dinner generator! \nHow many people are in your family?");
        int people = scan.nextInt();

        for(int i = 0; i< people; i++){
         String main = entree();
          String second = sides();
           String third = desserts();

         Summary(main, second, third);
          double fourth = subTot(main, second, third);
           double fifth = saleTax(fourth);
            totalSpent(fourth, fifth); 
        }
    }

        //Method 1 - Entree Type - 
        //Method 1.5 - Meats -
        //Method 2 - Sides -
        //Method 2.5 - How many sides -
        //Method 3 - Dessert - 
        //Method 3.5 - Summary
        //Method 4 - Subtotal -
        //Method 5 - Sales Tax -
        //Method 6 - Total
    
    public static String entree(){
        int food = 0; 

        System.out.println("Enter '1' for vegetarian and '2' for non-vegetarian meals");
         int entreeChoice = scan.nextInt();
         String foodss = " ";
         if(entreeChoice == 1){
            foodss = "Butternut Squash Ravioli";
            System.out.println("Entree: " +foodss);
            foodss = "veggies";

         }
         else if(entreeChoice == 2){
            food = rand.nextInt(3)+1;
            foodss = meats(food);
            System.out.println("Entree: " +foodss);

            foodss = "meat";
            //Check case - System.out.println(food);
         }
         else{
            System.out.println("Please select 1 or 2.");
            return null; 
         }
         System.out.println(" ");
         return foodss;
    }//Ends 1

    public static String meats(int n1){
        String choice = "";
        if(n1 == 1){
            choice = "Turkey";
        }
        else if(n1 == 2){
            choice = "Chicken";
        }
        else if(n1 == 3){
            choice = "Ham";
        }
        return choice;
    }//Ends 1.5

    public static String sides(){
        int Side = 0;
        String Sides;
        System.out.println("How many sides do you want? ");
        System.out.println("1, 2 or 3?");
         int choice = scan.nextInt();
         Side = choice;

        Sides = sidesChoice(choice);
        System.out.println("Sides: " +Sides);
        System.out.println(" ");
        return Sides;
    }

    public static String sidesChoice(int n1){
        String strang = " ";
        if(n1 == 1){
            strang = "Mashed Potatoes";
        }
        else if(n1 == 2){
            strang = "Mashed Potatoes and Green Beans";
        }
        else if(n1 == 3){
            strang = "Mashed Potatoes, Green Beans and Cranberries";
        }
        else{
            System.out.println("Invalid choice. Please select a number between 1 and 3.");
            return null; 
        }
        return strang;
    }//Ends 2.5
    //Used ChatGPT to debug. 
    public static String desserts(){
        String Array[] = {"Buffer", "Chocolate Cake", "Pumpkin pie", "Pecan Pie", "Flan", "Ice Cream"};
        String dessert = " ";

        System.out.println("Choose from 1 - 5 for a dessert");
        int choice = scan.nextInt();

        dessert = Array[choice];
        System.out.println("Dessert: " +dessert);
       
        return dessert;
    }//Ends 3

    public static void Summary(String n1, String n2, String n3){
        System.out.println(" ");
        System.out.println("Summary of Purchaces");
            System.out.println("Entree: " +n1);
            System.out.println("Sides: " +n2);
            System.out.println("Dessert: " +n3);
    }//Ends 3.5

    public static double subTot(String n1, String n2, String n3){
        double ST = 0.00;
        int sides = 0;

        if(n2 == "Mashed Potatoes"){
            sides = 1;
        }
        else if(n2 == "Mashed Potatoes and Green Beans"){
            sides = 2;
        }
        else if(n2 == "Mashed Potatoes, Green Beans and Cranberries"){
            sides = 3;
        }

        //Entrees
        if(n1 == "veggies" ){
            //Veggies
            ST += 5.00;
        }
        else if(n1 == "meat"){
            //Meats
            ST += 6.00;
        }

        //Sides
        if(sides == 1){
            ST += 2.00;
        }
        else if(sides == 2){
            ST += 4.00;
        }
        else if(sides == 3){
            ST += 6.00;
        }
        
        //Dessert
        if(n3 == "Chocolate Cake"){
            //Cake
            ST += 6.00;
        }
        else if(n3 == "Pumpkin Pie"){
            //Pie
            ST += 5.00;
        }
        else if(n3 == "Pecan Pie"){
            //Pie
            ST += 5.00;
        }
        else if(n3 == "Flan"){
            ST += 7.00;
        }
        else if(n3 == "Ice Cream"){
            ST += 7.00;
        }

        System.out.println("\n");
        System.out.println("Subtotal: " +ST);
        return ST;
    }//Ends 4 

    public static double saleTax(double n1){
        double taxes = n1 * .04;
        
        System.out.println("Sales Tax: " +taxes);
        return taxes;
    }//Ends 5

    public static double totalSpent(double n1, double n2){
        double total = n1 + n2;

        System.out.println("Total Spending: " +total);
        return total;
    }//Ends 6
}