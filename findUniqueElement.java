public class findUniqueElement {

    public static int findUnique(int [] arr ){
        // nums = [1,1,2,3,3,4,4,8,8]
        int low  = 0;
        int high=  arr.length-1;
        while(low<=high){
            int mid =  (low+high)/2;
            if(mid%2==0){
              if(arr[mid]!=arr[mid+1]){
                   high = mid-1;
              }
              else{
                      low = mid+1;
              }
            }
            else{
                 if(arr[mid]==arr[mid+1]){
                    high = mid-1;
                 }
                 else{
                    low = mid+1;
                 }
            }
         }

         return arr[low];
         








    }
}
