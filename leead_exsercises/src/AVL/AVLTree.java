package AVL;

public class AVLTree {

    class Node {
        private int key, height;
        private Node left, right, parent;
    
        public Node(int v){
            key = v;
            height = 0;
            left = right = parent = null;
        }
    }

    private Node root;

    public AVLTree(){
        root = null;
    }

//----------------------------------------------------------------
    /* insert a new key to the tree */
    public void insert(int key){
        if(root==null) this.root = new Node(key);
        else add(key, root);
    }
    private void add(int key, Node root){
        Node newNode = new Node(key);
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
        root.height++;
    }
}