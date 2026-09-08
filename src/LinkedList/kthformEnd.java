//```java
//package LinkedList;
//

//
//public class kthformEnd {
//
//    Node head;
//
//    public Node kthFromEnd(int k) {
//
//        Node slow = head;
//        Node fast = head;
//
//        // Move fast k steps ahead
//        for (int i = 0; i < k; i++) {
//
//            if (fast == null) {
//                return null;
//            }
//
//            fast = fast.next;
//        }
//
//        // Move both pointers
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }
//}
//```
