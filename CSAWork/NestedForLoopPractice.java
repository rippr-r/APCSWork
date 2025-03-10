public class NestedForLoopPractice {
    public static void main(String[] args) {

        //Problem 1
           for(int i = 1; i <= 10; i++){ //rows 
                System.out.print(i+ ".)");
                for (int j = 1; j <= 5; j++){
                    System.out.print(j+ " ");
                }
                System.out.println();
            }

        System.out.println();
        
        //Problem 2
            int rows = 5;
            for(int x = 1; x <= rows; x++){
               for(int y = 1; y <= rows - x; y++){
                System.out.print("  ");
                }
                for(int z = 1; z <= (2*x-1); z++){
                    System.out.print(x);
                }
                System.out.println();
            }

        System.out.println();

        //Problem 3
        for(int m = 0; m < 6; m++){ //ROWS
            for(int n = 0; n < 6; n++){ //COLLUMS
                System.out.print("(" +m+ "," +n+ ")");

            }
            System.out.println();
        }

        System.out.println();

        //Problem 4
        System.out.print("\t ");
        for(int o = 1; o < 13; o++){
            System.out.print(o+ " ");
        }
        System.out.println("\n\t_________________________________________");

        for(int m = 1; m < 13; m++){ //ROWS
            System.out.print(m+ "\t|"); // UP DOWN
            for(int n = 1; n < 13; n++){ //COLLUMS
                int p = m * n;
                System.out.print(p+ " ");

            }
            System.out.println();
        }

        System.out.println();

        //Problem 5
        for(int r = 0; r < 60; r++){ //num1
            for(int t = 0; t < 60; t++){
                if(r >= 10 && t >= 10){
                    if((r + t == 60) && (t + r == 60)){
                        System.out.println("("+r+","+t+")");
                    }
                }
            }
        }

        System.out.println();
        
        //Problem 6
        for(int q = 0; q < 60; q++){ //num1
            for(int c = 0; c < 60; c++){
                if((q >= 10 && c >= 10) && ((q - c == 14) || (c - q == 14))){
                    if((q + c == 60) && (c + q == 60)){
                        System.out.println("("+q+","+c+")");
                    }
                }
            }
        }
    }
}
