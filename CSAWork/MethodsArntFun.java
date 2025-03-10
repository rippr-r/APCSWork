public class MethodsArntFun {


    public int sumRange(int n1, int n2){
        int range;

        return range = n2 - n1;
    }

    public boolean larger(double n1, double n2){
        boolean large;

        if(n1 > n2){
            return large = true;
        }
        else{
            return large = false;
        }
    }

    public int countA(String RAH){
        int num = 0;
        char[] chars = RAH.toCharArray();
        for(int x = 0; x < chars.length; x++){
            if(chars[x] == 'A' || chars[x] == 'a'){
                num++;
            }
        }
        return num;
    }  
    
    public boolean evenlyDivisble(int n1, int n2){
        boolean div;
        if(n1 % n2 == 0){
            return div = true;
        }
        else{
            return div = false;
        }
    }
}
