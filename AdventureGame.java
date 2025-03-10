

import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You were trapped in a scientists house.");
         System.out.println("before you are 2 choices.");
          System.out.println("A Portal and a door.");
           System.out.println("Enter 'P' for the portal or Enter 'D' for the door.");
            char portDor = scan.next().charAt(0);
        
        if(portDor == 'P'){
            System.out.println("You chose to go through the first portal. ");
             System.out.println("You have a choice of 3 portals.");
              System.out.println("Press 1, 2, 3 to go through a portal.");
               int ports = scan.nextInt();

                if(ports == 1){
                    System.out.println("You chose to go through the first portal you see. ");
                     System.out.println("You appear in a massive forest that is very quiet.");
                      System.out.println("You can either go to the LEFT ('L'), RIGHT ('R'), or FORWARD ('F') ");
                       char portTwo = scan.next().charAt(0);
                        

                        if(portTwo == 'L'){
                            System.out.println("As you walk into the forest, you are suddenly pounced on by a tiger.");
                             System.out.println("You die.");
                        }
                        else if(portTwo == 'F'){
                            System.out.println("As you walk into the forest, you soon find yourself in the middle of the forest.");
                             System.out.println("You can not find your way back to the portal.");
                              System.out.println("You are lost for eternity.");
                        }
                        else if(portTwo == 'R'){
                            System.out.println("As you walk into the forest, you find a small abandoned camp. You make that camp your new home.");
                             System.out.println("You live.");
                        }
                }
                else if(ports == 2){
                    System.out.println("You chose to go through the second portal you see. ");
                     System.out.println("You appear in a city on a human populated world far far away.");
                      System.out.println("You can either go to the LEFT ('L'), RIGHT ('R'), or FORWARD ('F') ");
                       char portTwo = scan.next().charAt(0);
                        

                        if(portTwo == 'L'){
                            System.out.println("As you walk into the city, you find yourself lost on the streets. Homeless. .");
                             System.out.println("You live, however you wish for death as you had it all in the orignal world.");
                        }
                        else if(portTwo == 'F'){
                            System.out.println("As you walk forward into the city, you are suddenly slammed into by a racing car.");
                             System.out.println("You die on impact.");
                        }
                        else if(portTwo == 'R'){
                            System.out.println("As you walk into the unknown city, a aspiring business man bumps into you.");
                             System.out.println("He invites you to work at his new business. You become a rich man.");
                              System.out.println("You live a new lavish life in this unknown world.");
                        }
                }
                else if(ports == 3){
                    System.out.println("You chose to go through the third portal you see. ");
                     System.out.println("You appear in a massive maze.");
                      System.out.println("You can either go to the LEFT ('L'), RIGHT ('R'), or FORWARD ('F') ");
                       char portTwo = scan.next().charAt(0);
                        

                        if(portTwo == 'L'){
                            System.out.println("As you walk into the maze, you are suddenly slammed to by a trap set by a previous occupant.");
                             System.out.println("You die.");
                    }
                    else if(portTwo == 'F'){
                        System.out.println("As you walk into the maze, you are suddenly trapped into a very sticky web.");
                         System.out.println("You are taken into the massive web by this huge half human half spider being.");
                          System.out.println("According to their traditions. You have been taken to become their spouse.");
                           System.out.println("You are now married to this being. You....won?");
                    }
                    else if(portTwo == 'R'){
                        System.out.println("As you take that right, you suddenly fall through the floor. clipping through.");
                         System.out.println("You suddenly land in your bed, under the blankets.");
                          System.out.println("You escape back to your world, back into your room. It was all a dream.");
                    }
                }
        }
        else if(portDor == 'D'){
            System.out.println("You chose to go through the first door. ");
             System.out.println("You have a choice of 3 doors.");
              System.out.println("Press 1, 2, 3 to go through a door.");
               int doors = scan.nextInt();
                if(doors == 1){
                    System.out.println("You chose to go through the first door you see you see. ");
                     System.out.println("You find yourself in another room with 3 doors.");
                      System.out.println("You can either go into door 1, 2, or 3");
                       int doorTwo = scan.nextInt();

                    if(doorTwo == 1){
                        System.out.println("You open door one and you are thrown into a bustling city. Its New York!");
                         System.out.println("You live as you managed to get into New York.");
                    }
                    else if(doorTwo == 2){
                        System.out.println("As you open door 2, you are pulled into a massive chamber.");
                         System.out.println("Suddenly a loud noise burst as it goes black for you. You are smashed into a paste by a hammer.");
                          System.out.println("You die.");
                    }
                    else if(doorTwo == 3){
                        System.out.println("You open door 3 and its your house! You walk through and the door slams behind you.");
                         System.out.println("You escape.");
                    }
            }
            else if(doors == 2){
                System.out.println("You chose to go through the second door you see you see. ");
                     System.out.println("You find yourself in another room with 3 doors.");
                      System.out.println("You can either go into door 1, 2, or 3");
                       int doorTwo = scan.nextInt();

                    if(doorTwo == 1){
                        System.out.println("You open door one and you are pulled into it. Its black and cold. All the air is sucked out of your lungs.");
                         System.out.println("You die.");
                    }
                    else if(doorTwo == 2){
                        System.out.println("As you open door 2, you are pulled into a massive house. It goes on for infinity. ");
                         System.out.println("You live. Though...The beds you sleep in for the rest of time are cold..");
                    }
                    else if(doorTwo == 3){
                        System.out.println("You open door 3 and its a massive super store that goes on for infinity.");
                         System.out.println("You live. However..Its quite lonely..");
                    }
            }
            else if(doors == 3){
                System.out.println("You chose to go through the third door you see you see. ");
                     System.out.println("You find yourself in another room with 3 doors.");
                      System.out.println("You can either go into door 1, 2, or 3");
                       int doorTwo = scan.nextInt();

                    if(doorTwo == 1){
                        System.out.println("You open door one and you are thrown into a bustling city. Its London!");
                         System.out.println("You live as you managed to get into London.");
                    }
                    else if(doorTwo == 2){
                        System.out.println("As you open door 2, you are pulled into a massive chamber.");
                         System.out.println("Suddenly a loud noise burst as it goes black for you.");
                          System.out.println("Your fate is unknown to all. but your bones are discovered in your bed.");
                           System.out.println("You die a fate unknown to all.");
                    }
                    else if(doorTwo == 3){
                        System.out.println("You open door 3 and you are sucked into the vaccum of space.");
                         System.out.println("You die almost instantly.");
                    }
            }
        }
    }
}
