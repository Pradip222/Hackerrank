import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        Queue <Node> queue=new ArrayDeque<Node>();;
        queue.add(root);

        while(!queue.isEmpty()){
            Node n=queue.remove();
            System.out.print(n.data+" ");
            if(n.left!=null & n.right!=null){
                queue.add(n.left);
                queue.add(n.right);
            }
            else if(n.left!=null){
                queue.add(n.left);
            }
            else if(n.right!=null){
                queue.add(n.right);
            }
        }
      
      
    }

	public static Node insert(Node root, int data) {