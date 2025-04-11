import java.util.*;
public class RandomNumsArray {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        double[][] matrix2 = new double[3][4];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = rand.nextInt(2); 
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Enter the numbers in row one:");
        for(int i = 0; i < matrix2[0].length; i++){
            matrix2[0][i] = scan.nextDouble();
        }
        System.out.println("Enter the numbers in row two:");
        for(int i = 0; i < matrix2[1].length; i++){
            matrix2[1][i] = scan.nextDouble();
        }
        System.out.println("Enter the numbers in row three:");
        for(int i = 0; i < matrix2[2].length; i++){
            matrix2[2][i] = scan.nextDouble();
        }

        System.out.println("");
        
        System.out.println("The matrix is:");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("Sum of column 1: " + sumColumn(matrix2, 0));
        System.out.println("Sum of column 2: " + sumColumn(matrix2, 1));
        System.out.println("Sum of column 3: " + sumColumn(matrix2, 2));
        System.out.println("Sum of column 4: " + sumColumn(matrix2, 3));
    }

    public static double sumColumn(double[][] m, int colIndex) {
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][colIndex];
        }
        return sum;
    }
}
