public class smallestLetterGreaterThenTarget {
    public static char find(char [] arr , char target){
        int low =0;
        int high = arr.length-1;
        // if the character array is already sorted.
        char ans  = ' ';
        if(arr[low]<=target) return  arr[low];
     
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
           ans  = arr[mid];
           high = mid-1;
            }
            else{
             low = mid+1;
            }
        }
        return ans;
    }
}
