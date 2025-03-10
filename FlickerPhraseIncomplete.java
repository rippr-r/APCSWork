

import java.util.Random;

public class FlickerPhraseIncomplete{
	public static void main( String[] args )
    throws InterruptedException
    {
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ ){
			r = 1 + rng.nextInt(5);
			// Write five if statements here, the first one is done for you
            Thread.sleep(1000);
         if(r == 1){
            first();
         }
         else if(r == 2){
            second();
         }
         else if(r == 3){
            third();
         }
         else if(r == 4){
            fourth();
         }
         else if(r == 5){
            fifth();
         }

      }

		System.out.println("April showers bring May flowers.");
		
	}

	public static void first(){
		System.out.print("April                               \r");
      
	}

	public static void second(){
		System.out.print("      showers                       \r");
	}

	public static void third(){
		System.out.print("             bring             \r");
	}

	public static void fourth(){
		System.out.print("                    May      \r");
	}

	public static void fifth(){
		System.out.print("                           flowers\r");
	}
}
