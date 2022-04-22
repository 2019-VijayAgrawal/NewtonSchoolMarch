package MockDSA2;

public class SLL {
    Node head;
    int size = 0;
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }
        public Node addLast(int val){
            Node newNode = new Node(val);
            if (head == null){
                head = newNode;
                return head;
            }
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = null;
            return head;
        }
        public Node addFirst(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
        }
        public void print(){
            if (head == null){
                System.out.println("Link List is Empty");
                return;
            }
            Node curr = head;
            while (curr !=  null){
                System.out.print(curr.val+"-->");
                curr = curr.next;
            }
            System.out.print("null");
            System.out.println();
        }

    public static void main(String[] args) {
       SLL sll = new SLL();
       sll.addLast(50);
       sll.addLast(40);
       sll.addLast(20);
       sll.print();
       sll.addFirst(10);
       sll.print();

    }
}
