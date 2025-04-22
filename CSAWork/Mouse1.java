public class Mouse1 extends Mouse {
    String texture = "Matte";

    public static void setColor(String color){
        System.out.println(color);
    }

    public static void setColor(String color, int number){ //Overloaded method
        for(int i = 0; i < number; i++){
            System.out.println(color);
        }
    }

    public static void rightClick(){
        System.out.println("Clonked");
    }


}
