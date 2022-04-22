package DSA2.LinkList;

import java.util.Scanner;

public class DLLRohit {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    // null<-5->null

    //      null<-5->1<->2<->3->null
    //      head  -^
    public void push(int data)  // adding at front
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        Node ptr=head;
        System.out.print("null<-");
        while(ptr!=null){
            System.out.print(ptr.data + "<->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }


    //  null<-5->1<->2<->3<->4->null
    // last--------------^
    // null<-4->null
    public void addLast(int data) {
        Node newNode=new Node(data);
        Node last=head;
        newNode.next=null;

        if(head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.prev=last;
    }

    public void addSomewhere(int data,int k) {
        //
    }

    // null<-5<->4<->3<->2<->1<->78<->null
    //    bk -                    ^
    // count =4
    // null<-5<->4<->3<->1<->78<->null
// count<k-1 &&
    public void removeElementAtIndex(int k) { // k=3
        if(k<0){
            System.out.println("k cant be negative");
            return;
        }

        Node beforeKthNode=head;
        int count=0;

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        if(k==0){
            head=head.next;
            head.next.prev=null;
            return;
        }

        while( count<k-1 && beforeKthNode.next!=null){
            beforeKthNode=beforeKthNode.next;
            count++;
        }
        if(beforeKthNode.next==null){
            System.out.println("k is out of bound");
            return;
        }
        if(beforeKthNode.next.next!=null) {
            beforeKthNode.next.next.prev = beforeKthNode;
        }
        beforeKthNode.next=beforeKthNode.next.next;


        // 1<->89<->56->null
// 1<-59
        // 1->89->59
    }

    // null<-5<->4<->3<->1<->89<->null
    // null<-5<->4<->3<->1<->89<->null
    public static void main(String[] args) {
        DLLRohit dll=new DLLRohit();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            dll.push(data);
        }

        int a=sc.nextInt();
        dll.addLast(a);

        int data=54;
        int k=3;
//        dll.addSomewhere(data,k);
        dll.printList();


        // null<-5<->4<->3<->2<->1<->89<->null
        dll.removeElementAtIndex(k);
        dll.printList();
        // null<-5<->4<->3<->1<->89<->null
        dll.removeElementAtIndex(0);
        dll.printList();
        // null<-4<->3<->1<->89<->null
        dll.removeElementAtIndex(3);
        dll.printList();
        // null<-4<->3<->1<->null
        dll.removeElementAtIndex(-1);

        dll.removeElementAtIndex(3);

        dll.removeElementAtIndex(4);
        dll.printList();
    }
}