package LinkedList;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DisplayList {
        public  static void  display( Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
   public static void main(String[] args) {
        Node a = new Node(10);  // head node //a.val = 10;  //LinkedList.Node@8efb846
        Node b = new Node(20);   //b.val = 20;
        Node c=  new Node(30);   //c.val = 30;
        Node d=  new Node(40);   //d.val = 40;
        Node e=  new Node(50);
        Node f=  new Node(500);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        display(a);





    }
}

