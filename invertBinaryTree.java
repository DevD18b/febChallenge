public class invertBinaryTree {

    public static Node invert(Node root){
        if(root==null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
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
