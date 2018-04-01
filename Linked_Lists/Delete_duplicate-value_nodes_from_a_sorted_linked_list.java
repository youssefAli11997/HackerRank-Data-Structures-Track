/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node a = head, b, c;
    while(a != null){
        c = a;
        b = a.next;
        while(b != null){
            if(b.data == a.data){
                b = b.next;
                c.next = b;
            }
            else{
                b = b.next;
                c = c.next;
            }
        }
        a = a.next;
    }
    return head;
    
}
