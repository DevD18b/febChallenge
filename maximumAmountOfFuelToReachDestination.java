import java.util.*;
public class maximumAmountOfFuelToReachDestination{
static int fuel = 0;
static int totalSeats;
    public static int maximumAmountOfFuel(int [][] cities , int seats){
        totalSeats = seats;
        List<List<Integer>>  graph = new  ArrayList<>();
        for(int i =0; i<cities.length; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] arr : cities){
             graph.get(arr[0]).add(arr[1]);
             graph.get(arr[1]).add(arr[0]);
        }
        dfs(graph , 0 , -1);

        return fuel;
    }
    public static int dfs(List<List<Integer>>graph , int source , int parent){

        int people = 1;
        for(int neighbouringCity : graph.get(source)){
             if(neighbouringCity==parent) continue;
             people = dfs(graph, neighbouringCity, source);
        }

        if(source!=0)
        fuel += (int) Math.ceil(people/totalSeats);
         
        return people;
    }
}