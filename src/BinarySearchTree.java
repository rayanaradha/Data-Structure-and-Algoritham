import java.util.*;


//initilize the node class
class Node 
{ 
    int value; 
    Node left, right; 

    public Node(int item) 
    { 
        value = item; 
        left = right = null; 
    } 
}

// add Element Into Binary Tree
public class BinarySearchTree
{ 
    static Node root;

    //Recursive add the nodes;
    public static void add(int value) {
        root = addRecursive(root, value);
    }

    public static Node addRecursive(Node current, int value) {
        
        if (current == null) {
            return new Node(value);
        }
 
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } 
        else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } 

        return current;
    } 

    
    //find the particuler element
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public static boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
        return false;
    } 
    if (value == current.value) {
        return true;
    } 
    return value < current.value
      ? containsNodeRecursive(current.left, value)
      : containsNodeRecursive(current.right, value);
    }

    //Delete particuler element
    public static void delete(int value) {
        root = deleteRecursive(root, value);
    }

    
    public static Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
 
        if (value == current.value) {
        // Node to delete found
        // ... code to delete the node will go here
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children (replace the deleted node with smallest value in right subtree )
              int smallestValue = findSmallestValue(current.right);
              current.value = smallestValue;
              current.right = deleteRecursive(current.right, smallestValue);
              return current;
        } 

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
    
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    //smallest value of tree
    public static int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    //highest value of tree
    public static int findHighestValue(Node root) {
        return root.right == null ? root.value : findHighestValue(root.right);
    }

    //node count on tree
    public static int nodeCount(Node root){
        if(root==null){
            return 0;
        }
        else{
            return (nodeCount(root.left)+nodeCount(root.right)+1);
        }
    }


    //height of tree
    public static int height(Node root) {
        if(root ==null){
            return -1;
        }
        
        return (Math.max (height(root.left),height(root.right))+1);
      }

    //depth first serach
    public static void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.value+" ");
            inorder(node.right);
        }
    }

    public static void preorder(Node node){
        if(node != null){
            System.out.print(node.value+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value+" ");
        }
    }

    //Breadth-First Search
    public static void PrintLevelOrder(Node node){
        int height = height(node);
        for(int i=0; i< height+1 ;i++){
            LevelOrder(node,i);
        }    
    }

    public static void LevelOrder(Node node, int i){
        if(i==0){
            System.out.print(node.value+" ");
        }
        if(node.left!=null){
            LevelOrder(node.left,i-1);
        }
        if(node.right!=null){
            LevelOrder(node.right,i-1);
        }

    }


    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree(); 
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(99);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        print2D(root);
        PrintLevelOrder(root);
        System.out.println("Height of the tree :"+height(root));
        System.out.println("smallest Value on tree :"+findSmallestValue(root));
        System.out.println("Highest Value on tree :"+findHighestValue(root));
        System.out.println("Number of nodes on tree :"+nodeCount(root));

        System.out.println("Is 199 contain in tree : "+bt.containsNode(199));
        System.out.println("is 8 contain in tree : "+bt.containsNode(8));
        delete(99);
        print2D(root);
        System.out.println("Height of the tree :"+height(root));
        System.out.print("inorder travel : ");
        inorder(root);
        System.out.println();
        System.out.print("preorder travel : ");
        preorder(root);
        System.out.println();
        System.out.print("postrder travel : ");
        postorder(root);
        
   }

    //print the binary tree
    static void print2D(Node root)  {  
        print2DUtil(root, 0);  
    }  

    static void print2DUtil(Node root, int space)  {  
    final int COUNT = 10;    

    if (root == null)  
        return;  
  
    space += COUNT;  
  
    print2DUtil(root.right, space);  
  
    System.out.print("\n");  
    for (int i = COUNT; i < space; i++)  
        System.out.print(" ");  
    System.out.print(root.value + "\n");  
 
    print2DUtil(root.left, space);  
    }     
  

}
