import java.util.*;
public class FindTheDuplicateSubTree {

    public List<Node> findDuplicate(Node root)
    {

        List<Node> list =  new ArrayList<>();
        helper(root, new HashMap<>(), list);
        return list;
    }

    public static String helper(Node root, HashMap<String,Integer> map , List<Node> list){
        
        if(root==null) return "$";
       
        String serial =  root.data+" ";
        serial+=helper(root.left, map, list);
        serial+=helper(root.right, map, list);

        map.put(serial, map.getOrDefault(serial, 0)+1);
        if(map.get(serial)==2) list.add(root);
        return serial;
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
