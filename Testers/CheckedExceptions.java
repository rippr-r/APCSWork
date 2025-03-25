import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions{
    public static void readFile(String filename){
        try{
            FileReader reader = new FileReader(filename);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File does not exist");
        }

    }
    
    // Both a try/catch or stating the throw in the method, with a try/catch later. 
    // Both will work

    /*public static void readFile1(String filename) throws FileNotFoundException{
        FileReader reader = new FileReader(filename);
    }   */ // Just would need a try/catch somewhere

    public static void main(String[] args){
        readFile("myFile.txt"); // This will display a error, before running the program.  It is a compile based error
                                        // This is a CHECKED error.
    }  
}
