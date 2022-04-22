package MockInterview;
//construct a linked list
//reverse linked list
public class LinkedListt {
    Node head ;
    class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public Node reverse(){
        Node curr = head;
        Node prev = null;
        Node temp;
        while (curr != null){
           temp = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }
    public void print(){
        if (head == null){
            System.out.println("List is Empty");
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(9);
        list.addFirst(3);
        list.print();
        list.reverse();
        list.print();
    }
}
