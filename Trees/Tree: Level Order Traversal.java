   // BFS Solution
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       
        Queue<Node> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            Node currNode = q.poll();
            System.out.print(currNode.data + " ");
            if(currNode.left != null)
                q.add(currNode.left);
            if(currNode.right != null)
                q.add(currNode.right);
        }
      
    }
