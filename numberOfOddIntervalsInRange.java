public class numberOfOddIntervalsInRange{
    public static int find(int low , int high){
        // if low is even make it odd.
        if(low%2==0) low++;

        return low>high?0:(high-low)/2 +1;
    }  
    
}
