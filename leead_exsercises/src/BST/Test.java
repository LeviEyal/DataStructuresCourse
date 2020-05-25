package BST;

/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Binary search tree implementation 
******************************************************************************/
public class Test {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.insert(2);
        bst.insert(6);
        bst.insert(4);
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(8);
        bst.insert(14);
        System.out.println(bst.inOrder());
        bst.printBinaryTree();
        System.out.println("1: "+bst.contains(1));
        System.out.println("2: "+bst.contains(2));
        System.out.println("3: "+bst.contains(3));
        System.out.println("4: "+bst.contains(4));
        System.out.println("5: "+bst.contains(5));
        System.out.println("6: "+bst.contains(6));
        System.out.println("7: "+bst.contains(7));
        System.out.println("8: "+bst.contains(8));
        System.out.println("9: "+bst.contains(9));
    }
}