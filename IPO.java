import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class IPO {
public static int maxProfit(int [] profit , int [] capital , int w , int  k){
    ArrayList<greedy> projects = new ArrayList<>(); 
       Collections.sort(projects);
       int index  = 0;
       int n = profit.length;
       int ans  = 0;
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int i =0; i<k; i++){
             while(index<n && projects.get(index).capital<=w){
                     maxHeap.offer(projects.get(index++).profit);
             }
             if(maxHeap.isEmpty()) break;
             else{
                w += maxHeap.poll();
             }
       }
       return w;


          }    
     }
class greedy implements Comparable<greedy>{
    int capital;
    int profit;
    greedy(int capital , int profit){
        this.capital = capital;
        this.profit = profit;
    }
    public int compareTo(greedy o){
        return this.capital-o.capital;
    }
}
