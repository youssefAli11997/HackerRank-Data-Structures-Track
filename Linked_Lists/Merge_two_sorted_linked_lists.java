/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node headC = null;
    Node currC = null;
    boolean first = true;
    while(headA != null && headB != null){
        if(headA.data < headB.data){
            if(currC == null){
                currC = new Node();
                currC.data = headA.data;
                if(first){
                    headC = currC;
                    first = false;
                }
            }
            else{
                currC.next = new Node();
                currC.next.data = headA.data;
                currC = currC.next;
            }
            headA = headA.next;
        }
        else{
            if(currC == null){
                currC = new Node();
                currC.data = headB.data;
                if(first){
                    headC = currC;
                    first = false;
                }
            }
            else{
                currC.next = new Node();
                currC.next.data = headB.data;
                currC = currC.next;
            }
            headB = headB.next;
        }
    }
    if(headA == null){
        while(headB != null){
            if(currC == null){
                currC = new Node();
                currC.data = headB.data;
                headB = headB.next;
                continue;
            }
            currC.next = new Node();
            currC.next.data = headB.data;
            if(first){
                headC = currC;
                first = false;
            }
            currC = currC.next;
            headB = headB.next;
        }
    }
    
    if(headB == null){
        while(headA != null){
            if(currC == null){
                currC = new Node();
                currC.data = headA.data;
                headA = headA.next;
                continue;
            }
            currC.next = new Node();
            currC.next.data = headA.data;
            if(first){
                headC = currC;
                first = false;
            }
            currC = currC.next;
            headA = headA.next;
        }
    }
    return headC;
}
