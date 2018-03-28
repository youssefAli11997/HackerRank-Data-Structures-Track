/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node rHead, curr;
Node Reverse(Node head) {
    RecursiveReverse(head);
    return rHead;
}

void RecursiveReverse(Node head) {
    if(head.next != null)
        RecursiveReverse(head.next);
    if(curr == null) {
        curr = new Node();
        curr.data = head.data;
        rHead = curr;
    }
    else {
        curr.next = new Node();
        curr.next.data = head.data;
        curr = curr.next;
    }
}
