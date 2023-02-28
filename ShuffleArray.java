public class ShuffleArray {
    public static int[] shuffle(int [] nums , int n){

        int [] leftArray = new int[n];
        int [] rightArray = new int[n];
         int index=  0 ;
        for(int i = 0; i<n; i++){
            leftArray[index++] = nums[i];
        }
        index =0;
        for(int i = n; i<2*n;i++){
            rightArray[index++] = nums[i];
        }

        int [] globalArray = new int[2*n];

        int leftIndex  = 0;
        int rightIndex  = 0;
       index = 0;
        while(leftIndex<leftArray.length && rightIndex<rightArray.length ){

            if(index%2==0){
            globalArray[index++] = leftArray[leftIndex++];
            }
            else{
            globalArray[index++] = rightArray[rightIndex++];
            }
        }
        return globalArray;





    }
    
}
