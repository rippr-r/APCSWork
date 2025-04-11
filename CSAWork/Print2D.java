public class Print2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 10, 1}
        };

        System.out.println("2D Array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        String[][] strArr = {
            {"Kris", "is", "Gae", "Yes"},
            {"Chicken", "Jockey", "The", "Overworld"},
            {"The", "End", "is", "Never"},
        };
        String word = "";
        System.out.println("2D String Array:");
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < strArr[i].length; j++){
                System.out.print(strArr[i][j] + " ");
                    if(word.length() < strArr[i][j].length()){
                        word = strArr[i][j];
                    }
            }
            System.out.println();
        }
        System.out.println("Longest word is: " + word);
    }
}
