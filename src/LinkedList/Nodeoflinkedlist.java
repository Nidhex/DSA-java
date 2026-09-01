package LinkedList;




public class Nodeoflinkedlist {
    static void main(String[] args) {
        /// 10 20 30 40 50
        Node a = new Node(10);  // head node //a.val = 10;  //LinkedList.Node@8efb846
        Node b = new Node(20);   //b.val = 20;
        Node c=  new Node(30);   //c.val = 30;
        Node d=  new Node(40);   //d.val = 40;
        Node e=  new Node(50);   //e.val = 50;

        /// connect karege( link karege)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        System.out.println(a.next.next.next.val);


    }
}
