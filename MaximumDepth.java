public class MaximumDepth {

    public static int maxDepth(Node root){
        if(root==null) return 0;
        // if leaf
        if(root.left==null && root.right==null) return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        this.left = this.right =  null;
    }
}
