public class UnCheckedExceptions{
    public static void printLength(String myString){
        try{ // This Try/Catch allows the program to run and not break.
            System.out.println(myString.length());
        }
        catch(NullPointerException npe){
            System.out.println("String can not be null");
        }
    }
    public static void main(String[] args){
        String name = "John";
        printLength(name);

        String name2 = null;
        printLength(name2); // This will not output a error, until you run the program.
                            // Resulting in a UNCHECKED exception
    }
}
