public class StepTracker {
    private int minAmount;
    private int totAmount;
    private int numDaysTrac;
    private int actDays;

    public StepTracker(){
        minAmount = 10000;
        totAmount = 0;
        numDaysTrac = 0;
        actDays = 0;
    }

    public void addDailySteps(int steps){
        totAmount += steps;
        numDaysTrac++;

        if(steps >= minAmount){
            actDays++; //Also will track the days considered active
        }
    }

    public int activeDays(){
        return actDays;
    }

    public double averageSteps(){
        double avg = 0.0;

        if(numDaysTrac == 0){
            return 0.0; //Avoids "Divide by 0 errors"
        }
        else{
            avg = totAmount / numDaysTrac;
            return avg;
        }
    }
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(); //New instance
        
        //ChatGPT generated testers V
        tr.addDailySteps(5000);  // Inactive day
        tr.addDailySteps(12000); // Active day
        tr.addDailySteps(15000); // Active day
        tr.addDailySteps(3000);  // Inactive day

        System.out.println("Active Days: " + tr.activeDays()); // Output: 2
        System.out.println("Average Steps: " + tr.averageSteps()); // Output: 8750.0
    }
}