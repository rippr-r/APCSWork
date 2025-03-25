public class CurrencyConverterMath {
        //FROM USD
        private double euro1 = 0.93;
        private double ausd1 = 1.59;
        private double gbp1 = .77;
    
        //FROM EURO
        private double usd1 = 1.08;
        private double ausd2 = 1.71;
        private double gbp2 = 0.84;
    
        //FROM AUSD
        private double usd2 = 0.63;
        private double euro2 = 0.58;
        private double gbp3 = 0.49;
    
        //FROM GBP
        private double usd3 = 1.30;
        private double euro3 = 1.20;
        private double ausd3 = 2.05;


        public void usdEuro(double USD){
                System.out.println("The ammount is approx. ");
                System.out.println("USD -> EURO: " + USD * euro1);
        }

        public void usdAUSD(double USD){
                System.out.println("The ammount is approx. ");
                System.out.println("USD -> AUSD: " + USD * ausd1);
        }

        public void usdGBP(double USD){
                System.out.println("The ammount is approx. ");
                System.out.println("USD -> GBP: " + USD * gbp1);
        }

        public void euroUSD(double EURO){
                System.out.println("The ammount is approx. ");
                System.out.println("EURO -> USD: " + EURO * usd1);
        }

        public void euroAUSD(double EURO){
                System.out.println("The ammount is approx. ");
                System.out.println("EURO -> AUSD: " + EURO * ausd2);
        }

        public void euroGBP(double EURO){
                System.out.println("The ammount is approx. ");
                System.out.println("EURO -> GBP: " + EURO * gbp2);
        }

        public void ausdUSD(double AUSD){
                System.out.println("The ammount is approx. ");
                System.out.println("AUSD -> USD: " + AUSD * usd2);
        }

        public void ausdEURO(double AUSD){
                System.out.println("The ammount is approx. ");
                System.out.println("AUSD -> EURO: " + AUSD * euro2);
        }

        public void ausdGBP(double AUSD){
                System.out.println("The ammount is approx. ");
                System.out.println("AUSD -> GBP: " + AUSD * gbp3);
        }

        public void gbpUSD(double GBP){
                System.out.println("The ammount is approx. ");
                System.out.println("GBP -> USD: " + GBP * usd3);
        }

        public void gbpEURO(double GBP){
                System.out.println("The ammount is approx. ");
                System.out.println("GBP -> EURO: " + GBP * euro3);
        }

        public void gbpAUSD(double GBP){
                System.out.println("The ammount is approx. ");
                System.out.println("GBP -> AUSD: " + GBP * ausd3);
        }
    
}
