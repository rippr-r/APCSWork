public class Mouse_Main {
    public static void main(String[] args) {
        Mouse2 mouse2 = new Mouse2();
        //Inherits everything from the generic mouse class
        //But will not override the rightClick method

        mouse2.rightClick(); //Not overwritten, outputs Click
 

        Mouse1 mouse1 = new Mouse1();
        //Inherits everything from the generic mouse class
        //But will override the rightClick method

        mouse1.rightClick(); //Overridden method, outputs Clonked

        mouse1.setColor("Red"); // Says the color once
        mouse1.setColor("Green", 3); // Overloaded method, Says the color 3 times



    }
}

