	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

    static int maxHeight = 0;

	static int height(Node root) {
      	// Write your code here.
        calcHeight(root, 0);
        return maxHeight;
    }

    static void calcHeight(Node root, int heightSoFar){
        if(root.left == null && root.right == null && maxHeight < heightSoFar)
            maxHeight = heightSoFar;
        
        if(root.left != null)
            calcHeight(root.left, heightSoFar + 1);
        if(root.right != null)
            calcHeight(root.right, heightSoFar + 1);
    }
