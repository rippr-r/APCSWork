import java.util.*;;
public class LoopPractice {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = 0;
        int attempts = 0;
        System.out.println("Enter a number to loop up to");
        int v = scan.nextInt();
                if(v == x || v > 100){
                    for(int z = 0; z < 4; z++){
                        attempts++;
                        if(attempts == 3){
                            System.out.println("Exiting program...");
                            System.exit(10);
                        }
                        System.out.println("Enter a number to loop up to");
                        v = scan.nextInt();
                    }
                }
               
        
        while(x < v) {
            int c = rand.nextInt(8)+1;

            System.out.print(c + " ");

            if(c == 6){
                System.out.println();
                x++;
            }
        }
    }
}
