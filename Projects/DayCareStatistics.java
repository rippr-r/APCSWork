import java.io.*;
import java.util.*;
public class DayCareStatistics{
    static Scanner sc = new Scanner(System.in);

    private int numOfLines = 0;
    private String[] names;
    private int[] ages;
    private String[] genders;
    private String[] hometowns;
    private int[] days;
    private String[] numbers;

    //Used Github Copilot to help debug errors caused by moving to object based coding.
    public DayCareStatistics() {
        String[] rows = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            // Determine how many lines
            while (line != null) {
                numOfLines++;
                line = br.readLine();
            }
            br.close();

            // Initialize arrays after determining numOfLines
            names = new String[numOfLines];
            ages = new int[numOfLines];
            genders = new String[numOfLines];
            hometowns = new String[numOfLines];
            days = new int[numOfLines];
            numbers = new String[numOfLines];

            rows = new String[numOfLines];
            // Makes each row into an array
            BufferedReader br2 = new BufferedReader(new FileReader("data.txt"));
            line = br2.readLine();
            int i = 0; // Index
            while (line != null) {
                rows[i] = line;
                line = br2.readLine();
                i++;
            }
            br2.close();
        } catch (IOException e) {
            System.out.println("An error has occurred");
        }

        for (int i = 0; i < rows.length; i++) {
            String[] parts = rows[i].split(","); // Split the row by commas
            names[i] = parts[0]; // Name
            ages[i] = Integer.parseInt(parts[1]); // Age
            genders[i] = parts[2]; // Gender
            hometowns[i] = parts[3]; // Hometown
            days[i] = Integer.parseInt(parts[4]); // Days attending
            numbers[i] = parts[5]; // Phone number
        }
    }
    
    public void print_names(){
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }

    public void histogram(){
        int homeGreen = 0;
        int homeSpring = 0;
        int homeFrank = 0;
        int homeWash = 0;

        for(int i = 0; i < hometowns.length; i++){
            if(hometowns[i].equals("Springfield")){
                homeSpring++;
            }
            if(hometowns[i].equals("Greenville")){
                homeGreen++;
            }
            if(hometowns[i].equals("Franklin")){
                homeFrank++;
            }
            if(hometowns[i].equals("Washington")){
                homeWash++;
            }
        }

        System.out.println("Histogram of Towns: ");
        System.out.println("Springfield: " + "*".repeat(homeSpring));
        System.out.println("Greenville: " + "*".repeat(homeGreen));
        System.out.println("Franklin: " + "*".repeat(homeFrank));
        System.out.println("Washington: " + "*".repeat(homeWash));
    }

    public void print_average_ages(){
        int maleAgeSum = 0;
        int maleCount = 0;
        int femaleAgeSum = 0;
        int femaleCount = 0;

        for(int i = 0; i < genders.length; i++){
            if(genders[i].equalsIgnoreCase("M")){ // Check if gender is Male
                maleAgeSum += ages[i];
                maleCount++;
            } 
            else if(genders[i].equalsIgnoreCase("F")){ // Check if gender is Female
                femaleAgeSum += ages[i];
                femaleCount++;
            }
        }

        double maleAverage = (maleAgeSum) / maleCount;
        double femaleAverage = (femaleAgeSum) / femaleCount;

        System.out.println("The average male age is: " + maleAverage);
        System.out.println("The average female age is: " + femaleAverage);

    }

    public void print_revenue(){
        int oneYear = 0;
        int twoYear = 0;
        int threeYear = 0;
        int fourYear = 0;
        int fiveYear = 0;

        for(int i = 0; i < ages.length; i++){
            if(ages[i] == 1){ 
                oneYear+= ages[i];
            } 
            if(ages[i] == 2){ 
                twoYear+= ages[i];
            } 
            if(ages[i] == 3){ 
                threeYear+= ages[i];
            } 
            if(ages[i] == 4){ 
                fourYear+= ages[i];
            } 
            if(ages[i] == 5){ 
                fiveYear+= ages[i];
            } 
        }

        int oneYearTotal = oneYear * 35;
        int twoYearTotal = twoYear * 30;
        int threeYearTotal = threeYear * 25;
        int fourYearTotal = fourYear * 20;
        int fiveYearTotal = fiveYear * 15;

        int total = oneYearTotal + twoYearTotal + threeYearTotal + fourYearTotal + fiveYearTotal;

        System.out.println("Total Revenue this week is: $" + total);

    }

    public void child_lookup(){
        System.out.println("from the list, chose who you want to look up.");
        for(int i = 0; i < names.length; i++){
            System.out.println(i + ") " +names[i]);
        }
        int choice = sc.nextInt();

        System.out.println("Name: " + names[choice]);
        System.out.println("Age: " + ages[choice]);
        System.out.println("Gender: " + genders[choice]);
        System.out.println("Hometown: " + hometowns[choice]);
        System.out.println("Days Attending: " + days[choice]);
        System.out.println("Phone Number: " + numbers[choice]);

    }

    public void print_last_names(){
        //Used AI to help with the sorting algorithm 
        //Lines 176 - 215
        //Commented out notes to help me understand the code and to understand the flow of the code
        for(int i = 0; i < names.length - 1; i++){
            for(int j = 0; j < names.length - i - 1; j++){
                //Extract last names for comparison
                String lastName1 = names[j].substring(names[j].lastIndexOf(" ") + 1); //Takes the first value
                String lastName2 = names[j + 1].substring(names[j + 1].lastIndexOf(" ") + 1); //Takes the adjacent value
        
                //Compare last names and swap if needed
                if(lastName1.compareTo(lastName2) > 0){ //Compares the last names to see if lastname1 comes after lastname2 alphabetically, compares each letter, letter by letter
                    //Swap names
                    String tempName = names[j]; //Stores the original value
                    names[j] = names[j + 1]; //Swaps the value
                    names[j + 1] = tempName; //Restores the orignial value
        
                    //Swap ages
                    int tempAge = ages[j];
                    ages[j] = ages[j + 1];
                    ages[j + 1] = tempAge;

                    //Swap genders
                    String tempGender = genders[j];
                    genders[j] = genders[j + 1];
                    genders[j + 1] = tempGender;

                    //Swap hometowns
                    String tempHometown = hometowns[j];
                    hometowns[j] = hometowns[j + 1];
                    hometowns[j + 1] = tempHometown;

                    //Swap days
                    int tempDays = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = tempDays;

                    //Swap phone numbers
                    String tempNumber = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempNumber;
                }
            }
        }

        System.out.println("Students sorted by last name:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Gender: " + genders[i]);
            System.out.println("Hometown: " + hometowns[i]);
            System.out.println("Days Attending: " + days[i]);
            System.out.println("Phone Number: " + numbers[i]);
            System.out.println();
        }
    }
}