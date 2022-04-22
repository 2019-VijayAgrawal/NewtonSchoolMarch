package MockDSA2;

public class LinkedListt {
    Node head;
    int size = 0;
   class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public Node addFirst(int data){
       Node newNode =  new Node(data);
       if (head == null){
           head = newNode;
           return head;
       }
       newNode.next = head;
       head = newNode;
       return head;
    }
    public Node addLast(int data){
        Node newNode =  new Node(data);
        if (head == null){
            return newNode;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
        return  head;
    }
    public Node delMid(){
       if (head == null ){
           return null;
       }
       Node fast = head;
       Node slow = head;
       Node prev = null;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           prev = slow;
           slow = slow.next;
       }
       prev.next = slow.next;
       size--;
      //  System.out.println(size);
       return head;
    }
    public Node addAtPos(int data,int pos){
        Node newNode =  new Node(data);
        if (pos < 0 && pos > size){
           return null;
        }
        Node curr = head;
        Node prev = null;
        for (int i = 0; i < pos-1; i++) {
            prev  = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;
        return head;
    }
    public Node addfromEndPos(int data,int pos){

       return head;
    }
    public void print(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println(size);

    }
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(5);
        ll.addLast(50);

        ll.print();
        ll.delMid();
        ll.print();
        ll.addLast(55);
        ll.addLast(60);
        ll.addLast(65);
        ll.print();
        ll.delMid();
        ll.print();
        System.out.println("jjj");
        ll.addAtPos(25,3);
        ll.print();
    }
}
