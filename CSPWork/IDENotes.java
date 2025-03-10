
public class IDENotes {
    public static void main(String[] args) {
        
        //Note1

        int num = 0;

        while(num <= 22){
            if(num % 2 == 0){
                System.out.println(num+ " is even.");
            }
            else{
                System.out.println(num+ " is odd");
            }
            num ++;
        }

        System.out.println(" ");
        System.out.println(" ");
        //Notes2
        int time = 10;

        while(time > 0){
            System.out.println(time);
            time --;
            if(time == 0){
                System.out.println("Blast-off!");
            }
        }
    }
}
