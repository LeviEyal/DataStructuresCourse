package BinaryTree;

import Exercises.BinaryTree;
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Binary Tree implementation
******************************************************************************/
public class TestBT {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.Add(1);
		bt.Add(2);
		bt.Add(3);
		bt.Add(4);
		bt.Add(1);
		bt.Add(6);
		bt.Add(7);
		// bt.Add(8);
		// bt.Add(9);
		// bt.Add(10);
		// bt.Add(11);
		// bt.Add(1);
		// bt.Add(13);
		// bt.Add(14);
		// bt.Add(15);
		// bt.Add(16);
		// bt.Add(17);
		// bt.Add(18);
		// bt.Add(19);
		// bt.Add(20);
		bt.PrintInOrder();
		System.out.println();

		System.out.println("Tree Height: "+ bt.height());
		int n = 1;
		System.out.println("Number of nodes holding the value "+n+" is: "+bt.countContent(n));
		System.out.println("Number of total tree nodes: "+bt.countTotalNodes());
		System.out.println("Number of outside nodes: "+bt.countOutsidesNodes());
		System.out.println("Number of inner nodes: "+bt.countInnerNodes());
		bt.printBinaryTree();
		bt.printLevel(3);
		System.out.println("\n"+bt.contains(20));
		// System.out.println(bt.oneChildParents());
		// System.out.println(bt.areCousins(18, 20));
		// System.out.println(bt.maxSumPath());	
		// System.out.println(bt.isPathContains(new int[]{2,3}));
		// System.out.println(Arrays.toString(bt.longestPath()));
		// bt.printTree();
		System.out.println(bt.isLightning());
		System.out.println(bt.zeroOrTwoChildes());

	}

}
