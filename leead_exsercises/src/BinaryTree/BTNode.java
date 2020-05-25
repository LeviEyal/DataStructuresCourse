package BinaryTree;
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Binary Tree implementation
******************************************************************************/
public class BTNode {
	private int data;
	private BTNode Left,Right;

	public BTNode(int data){
		this.data=data;
		Left=Right=null;
	}

	/* get-set left */
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	/* get-set left */
	public BTNode getLeft() {
		return Left;
	}
	public void setLeft(BTNode left) {
		Left = left;
	}

	/* get-set left */
	public BTNode getRight() {
		return Right;
	}
	public void setRight(BTNode right) {
		Right = right;
	}

	/* toString */
	public String toString() {
		return "" + data;
	}
	
}
