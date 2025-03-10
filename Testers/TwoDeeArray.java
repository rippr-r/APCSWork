package TesterThingys;

public class TwoDeeArray {
    public static void main(String[] args) {
        int[][] lotteryCard = {{20, 15, 7},
                               {50, 7, 22},
                               {7, 45, 73}
        };

        // OR

        int[][] lotteryCard2  = new int[3][3];
         lotteryCard2[0][0] = 20;
          lotteryCard2[0][1] = 15;
           lotteryCard2[0][2] = 7;
            lotteryCard2[1][0] = 50;
             lotteryCard2[1][1] = 7;
              lotteryCard2[1][2] = 22;
               lotteryCard2[2][0] = 7;
                lotteryCard2[2][1] = 45;
                 lotteryCard2[2][2] = 73;

        //[row] [column]
        System.out.println(lotteryCard[0][0]);
            System.out.println(" ");

        for(int i = 0; i<3; i++){
            System.out.println(lotteryCard[i][i]);
        }

        System.out.println(" ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}