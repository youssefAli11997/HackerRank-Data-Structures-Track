/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    while(headA != null){
        Node b = headB;
        while(b != null){
            if(headA == b){
                return b.data;
            }
            b = b.next;
        }
        headA = headA.next;
    }
    return -1;
}
