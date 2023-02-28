import java.util.*;
public class MinAmountOfFuelToReachTheCapital {
    static int fuel  = 0;

    public static int dfs(ArrayList<ArrayList<Integer>> graph , int seats , int source ,int parent){
        int people = 1;
        for(int neighbour : graph.get(source)){
            if(neighbour==parent) continue;
            else
            people += dfs(graph, seats, neighbour, source);
        }
        if(source!=0) fuel +=Math.ceil(people/seats);
        return people;
    }
    public static int driverFunction(int [][] tree , int seats){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
           for(int [] arr : tree){
            adjList.get(arr[0]).add(arr[1]);
            adjList.get(arr[1]).add(arr[1]);
           }
           dfs(adjList, seats , 0 ,-1);
           return fuel;

    }
}
