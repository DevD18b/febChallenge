public class MinDistanceBetweenBst {
// brute force will be simply a inorder traversal and then simply 
// update the max diff variable by simply traversing the list and doing arr[i]-arr[i-1];
// takes o(n) extra space.



// so now what are we going to do is we simply.
// do inorder traversal
// maintain the prev variable and when it is not null 
//  we try to update max diffrence var by doing 
 //      int diff  =  (root.val - prev.val);
// and simply update the prev to root. and then do right subtree call.


 // same as min absolute difference
  static   Node  prev  = null;
    static  int ans  = Integer.MAX_VALUE;
    public static void helper(Node root){
        if(root==null) return;
        helper(root.left);
        if(prev  != null){
            ans  = Math.min(ans, root.data-prev.data);
        }        
        prev = root;
        
        helper(root.right);
    }
    public static int  driverFunction(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;

        helper(root);
        return ans;
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
