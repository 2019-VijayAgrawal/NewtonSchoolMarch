package MockDSA2;

public class SingleLinkedList {
    Node head;
    int size = 0;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
            size++;
        }
    }
    public Node addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public Node addLast(int val){
        Node newNode = new Node(val);
        Node curr = head;
        if (head == null){
            head = newNode;
            return newNode;
        }
        Node prev = null;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
        return head;
    }
    public Node delMid(){
       // Node newNode = new Node(pos);
        if (head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        size--;
        return head;
    }
    public int size(){

        return size;
    }
    public Node insertAtindex(int index,int val){
        Node newNode = new Node(val);
        Node curr = head;
        if (index < 1 || index >= size){
            System.out.println("Invalid Position");
        }
        if (index == 1){
            newNode.next = head;
            head = newNode;
        }
        for (int i = 1; i < index-1; i++) {
            while (curr != null) {
                curr = curr.next;
            }
        }
        if (curr != null){
            newNode.next = curr.next;
            curr.next = newNode;
        }

        return head;
    }

    public int getNodefromLast(int n){
        if (n > size){
            return -1;
        }
        Node curr = head;
        for (int i = 1; i < size-n+1; i++) {
             curr = curr.next;
        }
        return curr.val;
    }

    public  void print(){
        System.out.println();
        if (head == null){
            System.out.print("Linked List is Empty");
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val+"-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
         SingleLinkedList sll = new SingleLinkedList();
         sll.addFirst(10);
         sll.addFirst(20);
         sll.print();
        System.out.println();
         sll.addLast(50);
         sll.addLast(60);
         sll.addLast(75);
         sll.print();
        System.out.println();
         sll.delMid();
         sll.print();
         sll.insertAtindex(5,5);
         sll.print();
        System.out.println();
        System.out.println(sll.size());
       // sll.delMid();
        sll.print();
       // sll.delMid();
        sll.print();
        System.out.println();
        System.out.println(sll.getNodefromLast(3));
        System.out.println(sll.size());
    }
}
