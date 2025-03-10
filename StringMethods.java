public class StringMethods {
    public boolean prefixAgain(String str){
        String prefix = str.substring(0, 2);
        for(int i = 2; i <= str.length()-2; i++){
            if(str.substring(i, i+2).equals(prefix)){
                return true;
            }
        }
        return false;
    }
    
    public String getSandwich(String sandwich){
        String bread = "";
        int num = 0;
        for(int i = 0; i <= sandwich.length()-5; i++){
            if(sandwich.substring(i, i+5).equals("bread")){
                num++;
            }
        }
        if(num > 1){
            int first = sandwich.indexOf("bread");
            int last = sandwich.lastIndexOf("bread");
            return bread = sandwich.substring(first+5, last);
        }
        else{
            return bread;
        }
    }
    
    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        System.out.println(sm.prefixAgain("abXYabc"));
        System.out.println(sm.getSandwich("breadjambread"));
    }
}
