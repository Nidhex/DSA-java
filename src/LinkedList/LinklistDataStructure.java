package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Linkedlist {    // user-defined data structure

    Node head; // null
    Node tail; // null
    int size;

    int  search(int val)  {
        if(head==null) return  -1;
        Node temp = head;
        int idx =0;
        while (temp != null) {

            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    void deleteAthead() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    void addAttail(int val) {

        Node temp = new Node(val);

        if (tail == null) {
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    void display() {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void insert(int val, int idx) {
        if(idx<0 || idx>size){
            System.out.println("invalid index!");
            return;
        }
        if(idx == 0) addAtHead(val);
        else if(idx==size) addAttail(val);
        else{
            Node temp = head;
            for (int i = 1; i<idx;i++) {
                temp= temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }

    }
}

public class LinklistDataStructure {

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        ll.addAttail(10);
        ll.display();

        ll.addAttail(20);
        ll.display();

        ll.addAttail(30);
        ll.display();

        ll.addAttail(40);
        ll.display();

        ll.addAtHead(50);
        ll.display();

        ll.addAtHead(60);
        ll.display();

        ll.deleteAthead();
        ll.display();

        System.out.println(ll.size);

        System.out.println(ll.search(30));

        ll.insert(40,2);
    ll.display();

    }
}