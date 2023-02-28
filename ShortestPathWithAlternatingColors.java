import java.util.*;

public class ShortestPathWithAlternatingColors{

    public static int[] shortestPath( int n , int [][] redEdges , int [][] blueEdges){
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();
        for (int[] redEdge : redEdges) {
            adj.computeIfAbsent(redEdge[0], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(redEdge[1], 0));
        }

        for (int[] blueEdge : blueEdges) {
            adj.computeIfAbsent(blueEdge[0], k -> new ArrayList<List<Integer>>()).add(
                    Arrays.asList(blueEdge[1], 1));
        }

        int [] distance = new int[n];
        Arrays.fill(distance, -1);
        boolean [][] visit  =  new boolean[n][2];
        for(boolean [] arr : visit){
            Arrays.fill(arr, false);
        }
        Queue<int[]> queue= new LinkedList<>();
        // node , steps , prevColor.
        queue.offer(new int[]{0,0,-1});
         visit[0][0]= visit[0][1]= true;
         distance[0] = 1;

         while(!queue.isEmpty()){
            int [] arr = queue.peek();
            queue.poll();
            int node = arr[0];
            int steps = arr[1];
            int prevColor = arr[2];
            if(!adj.containsKey(node)) continue;

            for(List<Integer>neighbour : adj.get(node)){
                int adjNode = neighbour.get(0);
                int color = neighbour.get(1);
                if(!visit[adjNode][color] && color!=prevColor){
                    distance[adjNode] = steps+1;
                    visit[adjNode][color] = true;
                    queue.offer(new int[]{adjNode,steps+1 , color});
                }
            }
        }


    return distance;




    }
    
}
