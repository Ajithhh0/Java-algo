public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double m, double n){
        m = (int)(m*1000);
        n = (int)(n*1000);

        if(m == n){
            return true;
        }else{
            return false;
        }
    }
    
}
