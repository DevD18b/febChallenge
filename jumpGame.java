public class jumpGame{

    public static int jumpToReachEnd(int [] arr){
        int curFar  = 0;
        int curEnd  = 0;
        int count  = 0;
        for(int i =0; i<arr.length; i++){
            curFar=Math.max(curFar, i+arr[i]);
            if(i==curEnd){
                count++;
                curEnd=curFar;
               
            }
        }
        return count;
    }
    
}
