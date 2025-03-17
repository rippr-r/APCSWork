import java.util.*;
public class Array_Pract{
    public static void main(String[] args){
        String[] sent = new String[4];
        sent[0] = "Welcome";
        sent[1] = "to";
        sent[2] = "AP";
        sent[3] = "CSA";

        for(String word : sent){
            System.out.print(word + " ");
        }

        System.out.println();

        String[] fav_songs = {"Bohemian Rhapsody", "Stairway to Heaven", "Californication", "For Whom The Bell Tolls", "Sweet Child O' Mine"};
        System.out.println("My favorite songs are:");
        for(String song : fav_songs){
            System.out.println(song);
        }
    }
}