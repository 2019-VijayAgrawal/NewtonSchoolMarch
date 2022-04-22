package DSA2.LinkList;

public class DLLPractice {
    Node head;
    public class Node{
        Node prev;
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
     public  Node pushInHead(int data){
        Node temp = new Node(data);

         temp.next = head;
        temp.prev = null;
        head = temp;
        return head;
     }
     public Node pushInLast(int data){
        if (head == null){
            head = pushInHead(data);
            return  head;
        }
        Node curr = head;
        //Node previous = null;
        Node temp = new Node(data);
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
     }
     public int sizeOfList(){
        if (head == null){
            return 0;
        }
        Node curr = head;
        int len = 1;
        while (curr.next != null){
            curr = curr.next;
            len++;
        }
        return len;
     }
     //null-->1-->2-->3-->4-->5-->null
     public  Node deleteNode(Node del){
        Node curr = head;
        if (head == null || del == null){
            head = null;
            return head;
        }
        if (head == del){
           head = del.next;
            return head;
        }
        if (del.next != null){
            del.next.prev = del.prev;
        }
        if (del.prev != null){
            del.prev.next = del.next;
        }
        del = null;
      return head;
     }
     public void deleteNodeAtPos(int k){
        if (head == null || k<=0){
            return ;
        }
        Node current = head;
        int i;
         for (i = 1; current != null && i < k-1; i++) {
                 current = current.next;
         }
         current = current.next;
           if (current == null){
               return;
            }
            deleteNode(current);
        //return head;
     }
    public Node deleteElement(int k) {
//enter your code here
        int length = 0;
        Node prev = head;
        Node curr = head;
        int count = 0;
        while(count < k){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            head = head.next;
            return head;
        }
        while(curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
    //Double Linked List - In Class - Deletion in Doubly Linked List
    public static Node deleteElement(Node head,int k) {
//enter your code here
        int length = 0;
        Node prev = head;
        Node curr = head;
        int count = 0;
        while(count < k){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            head = head.next;
            return head;
        }
        while(curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;


    }
//Insertion node at kth postition in doubly linked list
    public  Node insertnew(Node head,int K, int P) {
        // k = element
        // p = position

        Node newNode = new Node(K);
        Node curr = head;
        if(P == 1 ){
            newNode.next = head;
            head = newNode;
            return head;
        }
        else{
            curr = head;
            for(int i = 1; i<P-1 && curr != null;i++){
                curr = curr.next;
            }
            Node pre = curr.next;
            curr.next = newNode;
            newNode.prev = curr;
            newNode.next = pre;
        }
        return head;
    }
     public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val+"-->");
            curr = curr.next;
        }
         System.out.println("null");
     }
    public static void main(String[] args) {
      DLLPractice list = new DLLPractice();
      //Node head = null;
     // list.printList(head);
      list.pushInHead(3);
        list.pushInHead(4);
        list.pushInHead(5);
        list.pushInHead(6);
        list.printList();

        list.pushInLast(55);
        list.printList();

        System.out.println(list.sizeOfList());

        list.deleteNode(list.head);
       list.printList();
     int k = 2;
        list.deleteNodeAtPos(k);
        list.printList();

        list.deleteElement(2);
        list.printList();

        //list.in(head,3);
        list.printList();
    }
}
