 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    
       if(root == null){
           root = new Node();
           root.data = value;
       }

       if(root.data < value){
           if(root.right == null){
               root.right = new Node();
               root.right.data = value;
           }
           else{
               root.right = Insert(root.right, value);
           }
       }
       else if(root.data > value){
           if(root.left == null){
               root.left = new Node();
               root.left.data = value;
           }
           else{
               root.left = Insert(root.left, value);
           }
       }
       return root;
}
