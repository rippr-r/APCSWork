public class ArrayWorking {
    public static void main(String[] args) {
        char[][] student_questions = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] score = new int[student_questions.length];

        for(int i = 0; i < student_questions.length; i++){
            for(int j = 0; j < student_questions[i].length; j++){
                if(student_questions[i][j] == key[j]){
                    score[i] += 1;
                }
            }
            System.out.println("Student " + (i + 1) + " score: " + score[i]);
        }
    }
}
