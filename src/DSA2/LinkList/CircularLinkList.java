package DSA2.LinkList;

public class CircularLinkList {
    Node head = null;
    Node tail = null;
    int size = 0;
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Single Linked List, Circular Linked LIst - Post Class - Delete even nodes from the list
    static Node delete(Node head,Node del){
        Node temp = head;

        if (head == del)
            head = del.next;
        while (temp.next != del) {
            temp = temp.next;
        }
        temp.next = del.next;

        return head;
    }
    static Node deleteEven(Node head){
//Enter your code here
        Node ptr = head;
        Node next;
        do {
            if (ptr.data % 2 == 0)
                delete(head, ptr);
            next = ptr.next;
            ptr = next;
        } while (ptr != head);

        return head;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
         }
        else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }


}
    public void addLast(int val){
        Node newNode = new Node(val);
        Node temp = head;
        if (head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public void print(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        //System.out.print("null"+"-->");
        do {
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        while (curr != head );
        System.out.println();
    }
    public static void main(String[] args) {
       CircularLinkList cList = new CircularLinkList();
       cList.addFirst(1);
        cList.print();
       cList.addFirst(2);
        cList.print();
       cList.addFirst(3);
       cList.print();
      cList.addLast(1);
       cList.addLast(2);
       cList.print();
    }
}
