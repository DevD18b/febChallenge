import java.util.*;
public class fruitsIntoBasket {
    public static int maximumFruitsPicked(int [] fruits , int  n){


        HashMap<Integer,Integer> map = new HashMap<>();


        int i  =0;
        int j  = 0;

        int maxPicked  = 0;
        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j], 0)+1);
            if(map.size()>2){
                map.put(fruits[i], map.getOrDefault(fruits[i], 0)-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            maxPicked = Math.max(j-i+1, maxPicked);
            j++;
        }
        return maxPicked;










    }
}
