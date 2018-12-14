
public class AVLNode {
	/**The key stored in the node*/
	public int key;
	
	/**The data stored in the node*/
	public String data;
	
//	/**
//	 * The height of the node
//	 */
//	public int height;
	
	/**The node's parent*/
	public AVLNode parent;
	
	/**
	 * The node's left child 
	 */
	public AVLNode left;
	
	/**
	 * The node's right child
	 */
	public AVLNode right;
	
	/**
	 * The integer balance factor bf
	 */
	public int bf;
	
	
	/**
     * Node constructor that initializes the values of key and the data and
     * makes other pointers null. The Balance Factor is initialized to be 0. 
     */
	/**
	 * We have a single node which has initialized null values to the parent, left and right
	 * child and initialized balance factor as 0
	 * @param key
	 * @param data
	 */
	public AVLNode(int key, String data)
	{
		this.key = key;
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
		this.bf = 0;
//		this.height = 0;
	}
	
	/**
	 * Returns the node content as a string of the following form of: "key, data(bf)".
	 * @return
	 */
	@SuppressWarnings("unused")
	public String printNode()
	{
		if (this != null)
		{
			return key + "," + data + "(" + bf + ")";
		}
		else
		{
			return null;
		}
	}
}

