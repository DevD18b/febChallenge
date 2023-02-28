import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class AsFarFromLandAsPossible {

    public static int maxDistance(int [][] grid){
        if(grid==null || grid.length==0) return -1;
        int row = grid.length;
        int cols = grid[0].length;
     
     Queue<int [] > queue = new LinkedList<>();
       
  for(int i =0; i<row; i++){
    for(int j = 0; j<cols; j++){
        if(grid[i][j]==1){
            queue.offer(new int[]{i,j});
        }
    }
  }

     int [][] distance = new int[row][cols];
     for(int [] arr : distance){
        Arrays.fill(distance, -1);
     }

     int level = 0;
     
     int [][] directions  = {{0,-1},{0,1},{-1,0},{1,0}};

     while(!queue.isEmpty()){
        level++;
        int size  = queue.size();
        while(size-->0){
            int [] arr = queue.peek();
            queue.poll();
            for(int [] dir : directions){
                int newX = arr[0]+dir[0];
                int newY = arr[1]+dir[1];
                if(newX>=0 && newY>=0 && newX<row && newY<cols && grid[newX][newY]==0){
                  distance[newX][newY] = level;
                  queue.offer(new int[]{newX,newY});        
                }
            }
        }
     }
     int ans  =0;
     for(int i =0; i<distance.length; i++){
        for(int  j =0; j<distance[0].length; j++){
              ans = Math.max(ans, distance[i][j]);
        }
     }
     return ans;
    }
    
}
