import java.util.*;
public class MoodArtistGenerator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the artist generator.");
        String mood = feelings();
        String question = questions();
        artists(mood, question);
    }
    
    public static String feelings(){
        String feels = " ";

        System.out.println("How do you feel? Happy or Sad?");
        feels = scan.nextLine();
            
        return feels;
    }

    public static String questions(){
        int Happy = 0;
        int Sad = 0;
        String mood = " ";

        String[] quests = {
            "Do you like brighter colors? (yes / no)",
            "Do you like light pastel colors? (yes / no)",
            "Asked if you liked a ligher color (Yellow, Green, Pink, etc) was your favourite color, what would you say? (yes / no)",
            "Summer and Spring are your favourite times of year? (yes / no)",
            "Do you like the day (As in day or night)? (yes / no)",
            "A nice warm day is prefered over a cold one. (yes / no)",
            "You feel like you are glowing with warmth and love. (yes / no)",
            "When asked how you are, you are doing great! (yes / no)",
        };

        System.out.println("These are just some baselining questions for suggesting an artist!");
        System.out.println("Just answer these based on your mood.");
        System.out.println("Your opinions can sway the result, be careful!");
            for(int i = 0; i < quests.length; i++){
                System.out.println(quests[i]);
                String answers = scan.nextLine();
                if(answers.equalsIgnoreCase("Yes")){
                    Happy++;
                }
                else if(answers.equalsIgnoreCase("No")){
                    Sad++;
                }
            }
            
        if(Happy >= Sad){
            mood = "Happy";
            return mood; 
        }
        else{
            mood = "Sad";
            return mood;
        }
    }

     public static void artists(String s1, String s2){
        String[] happyArts = {
            "Henri Matisse",
            "David Hockney",
            "Yayoi Kusama",
            "Wayne Thiebaud"
        };

        String[] sadArts = {
            "Francisco Goya",
            "Caravaggio",
            "Käthe Kollwitz",
            "Hieronymus Bosch",
        };

        if(s1.equalsIgnoreCase("Happy") && s2.equalsIgnoreCase("Happy")){
            System.out.println("Artists that match your happy mood are!");
            for(String artist : happyArts){
                System.out.println(artist+ " ");
            }
        }
        else if(s1.equalsIgnoreCase("Sad") && s2.equalsIgnoreCase("Sad")){
            System.out.println("Artists that match your sad mood are!");
            for(String artist : sadArts){
                System.out.println(artist+ " ");
        }
    }
}

}