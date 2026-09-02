package LinkedList;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;

    }
}
class Linkedlist{    //user defind data structure
     Node head; //null
     Node tail; //null


    void addAttail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        tail.next =temp;
        tail =temp;
    }
    void display(){
        if(head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }
    void addAtHead(int val){
        Node temp =new Node(val) ;
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head =temp;

        }
        temp.next =head;
        head = temp;

    }
}
public class LinklistDataStructure {
    static void main() {
        Linkedlist ll = new Linkedlist();
        ll.addAttail(10);
        ll.addAttail(20);
        ll.addAttail(30);
        ll.addAttail(40 );
        ll.display();
        ll.addAtHead(100);
    }
}

