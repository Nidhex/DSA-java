package LinkedList;

import java.util.Scanner;








public class DisplayList {
    public static  void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val + " ");
        displayRec(head.next);

    }

        public  static void  display( Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;   //very importent
            }
//            for (Node temp =head; temp!=null; temp = temp.next) {
//                System.out.print(temp.val+" ");
//            }
            System.out.println();
        }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        Node a = new Node(sc.nextInt());  // head node //a.val = 10;  //LinkedList.Node@8efb846
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
//        display(a);
//        displayRec(a);

       System.out.println(get(a,2));


    }
    private  static  int get(Node head,int idx){
        Node temp =head;
        for(int i =0 ;i<=idx;i++){
            head = head.next;
        }
        return  head.val;
    }
}

