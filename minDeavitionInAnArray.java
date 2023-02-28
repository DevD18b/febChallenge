import java.util.TreeSet;

public class minDeavitionInAnArray {

    public static int findDeaviation(int [] arr , int n){
             
        TreeSet<Integer> set  =  new TreeSet<>();

        for(int i : arr){
            if(i%2!=0){
                set.add(i*2);
            }
            else set.add(i);
        }
        int diff = Integer.MIN_VALUE;

        while(!set.isEmpty()){
            int min = set.first();
            int max = set.last();
            int currDiff = max-min;
            diff = Math.min(diff, currDiff);
            if(max%2==0){
              set.remove(max);
              set.add(max/2);
                
            }
        }
        return diff;





    }
}
