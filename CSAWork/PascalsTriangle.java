
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of lines for the triangle.");
         int no = scan.nextInt();
         int spaces = no;
         int number = 1;

        for(int i=0; i < no; i++){

            //Nested For loop for spaces
            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            number = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number * (i-j) / (j+1);
            }
            spaces--;
            System.out.println();
        }
    }
}
