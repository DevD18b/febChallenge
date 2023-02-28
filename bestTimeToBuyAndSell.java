public class bestTimeToBuyAndSell {
    public static int maxProfit(int [] arr){
        int sp = Integer.MIN_VALUE;
        int cp = Integer.MAX_VALUE;
        for(int i : arr){
            cp = Math.min(i, cp);
            sp = Math.max(sp , i-cp);
        }
        return sp;
    }
    
}
