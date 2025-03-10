import java.util.*;
public class ExtraCredit1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to the expense tracker!");
        dailySpend();
    
    }

    public static void dailySpend(){
       int i = 1;
       int gasTotal = 0;
       int foodTotal = 0;
       int cloTotal = 0;
       int othTotal = 0;

        while(i<=5){
           System.out.println("What did you spend on for day " +i);

           System.out.print("Gas? ");
           int gas = scan.nextInt();
           System.out.print("Food? ");
            int food = scan.nextInt();
           System.out.print("Clothes? ");
             int clothes = scan.nextInt();
           System.out.print("Other? ");
              int oth = scan.nextInt();

            i++;
            gasTotal += gas;
            foodTotal += food;
            cloTotal += clothes;
            othTotal += oth;
        }
        totalSpent(gasTotal, foodTotal, cloTotal, othTotal);
    }
    public static void totalSpent(int n1, int n2, int n3, int n4){
        int totals = n1 + n2 + n3 + n4;

        System.out.println("Weekly spent: ");
        System.out.println("    Food: " +n2);
        System.out.println("    Clothes: " +n3);
        System.out.println("    Gas: " +n1);
        System.out.println("    Other: " +n4);
        System.out.println("    Total: " +totals );

        if(totals > 150){
            System.out.println("WARNING!");
            System.out.println("You spent more than $150");
            System.out.println("You need to cut back on spending");
        }
    }
}

