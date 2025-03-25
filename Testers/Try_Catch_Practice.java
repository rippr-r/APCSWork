public class Try_Catch_Practice {
    public static void main(String[] args) {
        int[] nums = new int[3];
        try{
            System.out.println(nums[10]);
            //System.out.println(nums[1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds: " +e.getMessage()); // Gets the message related to the caught exception
        }
        finally{
            System.out.println("Finally part works regardless of the outcome of the try/catch");
        }

        System.out.println();

        try{
            getInt();
            System.out.println("What was the number"); // Wont run due to the method throwing a exception, but will if the method gets fixed
        }
        catch(NumberFormatException | NullPointerException e){ // EXCEPTIONS var. name, Exceptions can be split with a bar, '|' to denote many types of exceptions
            System.out.println("Can't make a int out of that parameter");
        }
        finally{ //Runs regardless of the try/catch
            System.out.println("End here in the finally block");
        }
        System.out.println("End here outside the finally block");

        System.out.println();

        System.out.println(printANumber()); // Returns a 5 due to the finally

    }

    public static void getInt(){
            int myint = Integer.parseInt("pants");
            //int myint = Integer.parseInt("1"); // This code works
    }

    private static int printANumber(){
        try{
            return 3;
        }
        catch(Exception e){
            return 4;
        }
        finally{
            return 5; // This will overide the Try/Catch statement, try to avoid finallys
        }
    }
}
