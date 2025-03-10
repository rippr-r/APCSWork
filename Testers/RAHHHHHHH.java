package TesterThingys;


public class RAHHHHHHH {
    public static void main(String[] args) {
        
        double tuition = 10000.00;
        int year = 0;
        while(year <= 9){
            System.out.println("The tuition for year " +year+ " is $" +Math.round(tuition * 100) / 100d);

            year++;
            tuition *= 1.05;
        }
    }
}
