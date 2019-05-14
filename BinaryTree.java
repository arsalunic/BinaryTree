import java.util.*;

public class BinaryTree {
	private String data;
	private BinaryTree leftChild;
	private BinaryTree rightChild;


	//A default constructor with no data
	public BinaryTree() {
		data = null;
		leftChild = null;
		rightChild = null;
	}

	// A constructor that takes root data only and
	// makes a tree with no children (i.e., a leaf)
	public BinaryTree(String d) {
		data = d;
		leftChild = null;
		rightChild = null;
	}

	// A constructor that takes root data as well as two subtrees
	// which then become children to this new larger tree.
	public BinaryTree(String d, BinaryTree left, BinaryTree right) {
		data = d;
		leftChild = left;
		rightChild = right;
	}

	// Get methods
	public String getData() { return data; }
	public BinaryTree getLeftChild() { return leftChild; }
	public BinaryTree getRightChild() { return rightChild; }

	// Set methods
	public void setData(String d) { data = d; }
	public void setLeftChild(BinaryTree left) { leftChild = left; }
	public void setRightChild(BinaryTree right) { rightChild = right; }

	public final void add(String item) {
		if (data == null)
			data = item;

		else if (data.compareTo(item) > 0)
			if (rightChild != null)
				rightChild.add(item);

			else if (data.compareTo(item) < 0) 
				if (leftChild != null)
					leftChild.add(item);
	}

	public String display() {
		String out = data.toString();
		if (leftChild != null)
			out += String.format("%nLeft: { %s }", leftChild.toString());
		if (rightChild != null)
			out += String.format("%nRight: { %s }", rightChild.toString());
		return out;
	}  
}