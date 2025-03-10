public class NestedForPractice {
    public static void main(String[] args) {
        //Print nums 1-5, 10 times

        for(int i = 1; i <= 10; i++){ //rows 
            System.out.print(i+ ".)");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }


        //Pascal's Triangle
        int rows = 5;
        for(int x = 1; x <= rows; x++){
            for(int y = 1; y <= rows - x; y++){
                System.out.print(" ");
            }
            for(int z = 1; z <= (2*x-1); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
