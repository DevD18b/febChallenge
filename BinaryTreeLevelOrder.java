import java.util.*;
public class BinaryTreeLevelOrder {
    public static List<List<Integer>> levelOrder(Node root){

        if(root==null) return new ArrayList<>(); 
        List<List<Integer>> ans = new ArrayList<>();
        
        Queue<Node> queue  =  new LinkedList<>();
        int level = 1;
        queue.offer(root);
        while(!queue.isEmpty()){
            level++;
            List<Integer> list =  new ArrayList<>();
          int size=  queue.size();
          while(size-->0){
            Node temp = queue.peek();
            list.add(temp.data);
            queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }     
            if(temp.right!=null){
                queue.offer(temp.right);
            }
          }
          if(level%2==0){
            List<Integer> evenLevel =  new ArrayList<>();
            for(int i  =list.size()-1; i>=0; i--){
                evenLevel.add(list.get(i));
            }
            ans.add(evenLevel);
          }
          else{
            ans.add(list);
          }
        }
        return ans;
    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        this.left = this.right = null;

    }
}
