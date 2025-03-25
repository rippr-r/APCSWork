import java.util.*;
public class ReflectionJavaCode {
    static Scanner scanner = new Scanner(System.in);
    private final String michasUsername;
    private final int michasPincode;
    private String michasPassword;

    public ReflectionJavaCode(){
        michasUsername = "STC-Malachite";
        michasPincode = 1762;
        michasPassword = "17P@ssW()rd62";
    }

    public String getPassword(){
        return michasPassword;
    }

    public String getUser(){
        return michasUsername;
    }


    public void main_access_terminal(String user, String pass){
        if(user.equals(michasUsername) && pass.equals(michasPassword)){
            System.out.println("What is the PINCODE for this account?");
                int attempt = scanner.nextInt();
                scanner.nextLine();
                    if(attempt != michasPincode){
                        System.out.println("Wrong Pincode!");
                        private_info();
                    }
                    else{
                        System.out.println("You unlocked the account!");
                    }
        }
    }

    private static void private_info(){
        System.out.println("Michas SSN : 420-69-5656");
    }
}
