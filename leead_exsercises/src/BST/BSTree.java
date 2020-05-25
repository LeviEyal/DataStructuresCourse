package BST;

/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Binary search tree implementation  
******************************************************************************/
public class BSTree {

    class BSTNode {
        int key;
        BSTNode left;
        BSTNode right;
    
        public BSTNode(int key) {
            this.key = key;
            left = right = null;
        }
    }

    private BSTNode root;

    public BSTree() {
        root = null;
    }
//----------------------------------------------------------------
/* insert a new key to the tree */
    public void insert(int key){
        if(root==null) this.root = new BSTNode(key);
        else add(key, root);
    }
    private void add(int key, BSTNode root){
        BSTNode newNode = new BSTNode(key);
        if(key<root.key){
            if(root.left==null)
                root.left = newNode;
            else add(key, root.left);   
        } 
        if(key>=root.key){
            if(root.right==null)
                root.right = newNode;
            else add(key, root.right);
        }
    }
//----------------------------------------------------------------
/* Checks if the tree holds a given value */
    public boolean contains(int val){
        return contains(val, root);
    }
    private boolean contains(int val, BSTNode root) {
        if(root==null) return false;
        if(root.key == val) return true;
        if(val > root.key) return contains(val, root.right);
        else return contains(val, root.left);
    }

    // ___________________________________________________________
    public String inOrder(){
        return "["+inOrder(root)+"]";
    }
    private String inOrder(BSTNode root) {
        if(root==null) return "";
        String s = "";
        s += inOrder(root.left);
        s += root.key+", ";
        s += inOrder(root.right);
        return s;
    }
    	/* Printing the tree visualy */
	public void printBinaryTree(){
        System.out.println();
		System.out.println("================================");
		printBinaryTree(root, 0);
		System.out.println("================================");
	}
	public void printBinaryTree(BSTNode root, int level){
		if(root==null)
			 return;
		printBinaryTree(root.right, level+1);
		if(level!=0){
			for(int i=0;i<level-1;i++)
				System.out.print("|\t");
				System.out.println("|-------"+root.key);
		}
		else
			System.out.println(root.key);
		printBinaryTree(root.left, level+1);
    }
    


    public void printTree() {
		if( root != null) {
			printTree(root.right, true, "");
	                 System.out.println(root.key);
			printTree(root.left, false, "");

		}
	}
	private void printTree(BSTNode node, boolean isRight, String indent) {
		 if(node != null) {
		  printTree(node.right, true, indent + (isRight ? "        " : " |      "));
	          System.out.print(indent);
	          if (isRight) System.out.print(" /");
        	  else System.out.print(" \\");
		  System.out.print("----- ");
		  System.out.println(node.key);
         	 printTree(node.left, false, indent + (isRight ? " |      " : "        "));
		}
	}
    
}