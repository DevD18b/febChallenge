public class capacityToPackLuggageWithInDDays {
     public static boolean canLift(int [] arr , int days , int caps){
        int weightItCanLift = 0;
        int daysCount  =0 ;
        for(int i : arr){
            if(i+weightItCanLift<=caps){
                 weightItCanLift+=i;
            }
            else{
                weightItCanLift = i;
                daysCount++;
            }
        }
        return daysCount<days;
     }
    public static int findMinCount(int []  arr , int days){
        int minItcanLift = 0;
        int maxItCanLift  = 0;
        
        
        for(int i : arr){
            minItcanLift =  Math.min(i, minItcanLift);
            maxItCanLift +=i;
        }
           int ans  = 0;   
      while(minItcanLift<maxItCanLift){
        int mid  = (minItcanLift+maxItCanLift)/2;
        if(canLift(arr , mid , days)){
            ans  = mid;
            maxItCanLift = mid-1;
        }
        else{
            minItcanLift = mid+1;
        }
      }
      return ans;





    }
    
}
