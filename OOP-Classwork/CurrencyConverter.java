import java.util.*;
public class CurrencyConverter {
    static Scanner scan = new Scanner(System.in);
    static CurrencyConverterMath cc = new CurrencyConverterMath();

    public void converter_questions(){
        System.out.println("What currency do you want to start with?");
        System.out.println("Enter the currency.");
        System.out.println("1) USD");
        System.out.println("2) EURO");
        System.out.println("3) AUSD");
        System.out.println("4) GBP");
            String choice = scan.nextLine();
        switching1(choice);
    }

    public void switching1(String choice){
        switch(choice){
            case "USD":
                usd_questions();
                break;
            case "EURO":
                euro_questions();
                break;
            case "AUSD":
                ausd_questions();
                break;
            case "GBP":
                gbp_questions();
                break;
            default:
                usd_questions();
                break;
        }
    }

    public void usd_questions(){
        System.out.println("What currency do you want to convert to?");
        System.out.println("Enter the currency.");
        System.out.println("1) EURO");
        System.out.println("2) AUSD");
        System.out.println("3) GBP");
            String choice = scan.nextLine();
        System.out.println("How much do you want to convert?");
            double ammount = scan.nextDouble();
            scan.nextLine();
        switchingUSD(choice, ammount);
        
    }

    public void euro_questions(){
        System.out.println("What currency do you want to convert to?");
        System.out.println("Enter the currency.");
        System.out.println("1) USD");
        System.out.println("2) AUSD");
        System.out.println("3) GBP");
            String choice = scan.nextLine();
        System.out.println("How much do you want to convert?");
            double ammount = scan.nextDouble();
            scan.nextLine();
        switchingEURO(choice, ammount);;
        
    }

    public void ausd_questions(){
        System.out.println("What currency do you want to convert to?");
        System.out.println("Enter the currency.");
        System.out.println("1) USD");
        System.out.println("2) EURO");
        System.out.println("3) GBP");
            String choice = scan.nextLine();
        System.out.println("How much do you want to convert?");
            double ammount = scan.nextDouble();
            scan.nextLine();
        switchingAUSD(choice, ammount);
        
    }

    public void gbp_questions(){
        System.out.println("What currency do you want to convert to?");
        System.out.println("Enter the currency.");
        System.out.println("1) USD");
        System.out.println("2) EURO");
        System.out.println("3) AUSD");
            String choice = scan.nextLine();
        System.out.println("How much do you want to convert?");
            double ammount = scan.nextDouble();
            scan.nextLine();
        switchingGBP(choice, ammount);
        
    }

    public void switchingUSD(String choice, double ammount){
        switch(choice){
            case "EURO":
                cc.usdEuro(ammount);
                break;
            case "AUSD":
                cc.usdAUSD(ammount);
                break;
            case "GBP":
                cc.usdGBP(ammount);
                break;

            default:
                cc.usdEuro(ammount);
                break;
        }
    }

    public void switchingEURO(String choice, double ammount){
        switch(choice){
            case "USD":
                cc.euroUSD(ammount);
                break;
            case "AUSD":
                cc.euroAUSD(ammount);
                break;
            case "GBP":
                cc.euroGBP(ammount);
                break;

            default:
                cc.euroUSD(ammount);
                break;
        }
    }

    public void switchingAUSD(String choice, double ammount){
        switch(choice){
            case "USD":
                cc.ausdUSD(ammount);
                break;
            case "EURO":
                cc.ausdEURO(ammount);
                break;
            case "GBP":
                cc.ausdGBP(ammount);
                break;

            default:
                cc.ausdUSD(ammount);
                break;
        }
    }

    public void switchingGBP(String choice, double ammount){
        switch(choice){
            case "USD":
                cc.gbpUSD(ammount);
                break;
            case "EURO":
                cc.gbpEURO(ammount);
                break;
            case "AUSD":
                cc.gbpAUSD(ammount);
                break;

            default:
                cc.gbpUSD(ammount);
                break;
        }
    }

}
