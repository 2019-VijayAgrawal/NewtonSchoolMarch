package DSA2.LinkList;

public class LinlLis {
    Node head;
    Node tail;
    Node size;
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
   public void addFirst(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
   }
   // 1-->2-->--3-->null
   public void addLast(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;

   }
   public void deleteFirst(){
       if (head == null){
           return;
       }
       Node curr = head.next;
       head = curr;

   }
   public void deleteLast(){
       if (head == null){
           return;
       }
       Node curr = head;
       Node prev = null;
       while (curr.next != null){
           prev = curr;
           curr = curr.next;
       }
       prev.next = null;
   }
   public  int sizeOfList(){
        int count = 0;
       if (head == null){
           return 0;
       }
       Node currNode = head;
       while (currNode != null){
           count++;
           currNode = currNode.next;
       }
     //  System.out.println(count+"s");
       return count;
   }
   public void reverseList(){
        Node temp = head;
       if (head == null){
           return;
       }
       if (head.next == null){
           return;
       }
       Node currNode = head;
       Node prevNode = null;
       while (currNode != null){
           Node currStore = currNode;
           //prevNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currStore;
       }
       head = prevNode;
   }
     public  Node inserNodeAt(Node head,int k,int pos){
        if (head == null){
            return  head;
        }
        int len = 1;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        if (k>len){
            return null;
        }
        curr = head;
        Node prev = null;
        Node newNode = new Node(pos);
         for (int i = 0; i < len; i++) {
             curr = curr.next;
             prev = prev.next;
         }
         curr.next = newNode;
         newNode.next = prev.next.next;

         return head;
     }
    // Function return number of nodes present in list
    static int Length(Node head)
    {
        Node current = head;
        int count = 0;

        // if list is empty simply return length zero
        if (head == null)
        {
            return 0;
        }

        // traverse first to last node
        else
        {
            do
            {
                current = current.next;
                count++;
            } while (current != head);
        }
        return count;
    }
    // Function to delete all even position nodes
    static Node DeleteAllEvenNode( Node head)
    {
    int len = Length(head);

    int count = 1;
    Node previous = head, next = head;

    // Check list is empty
    // if empty simply return
    if (head == null)
    {
        System.out.printf("\nList is empty\n");
        return null;
    }

    // if list have single node
    // then return
    if (len < 2)
    {
        return null;
    }

    // make first node is previous
    previous = head;

    // make second node is current
    next = previous.next;

    while (len > 0)
    {

        // check node number is even
        // if node is even then
        // delete that node
        if (count % 2 == 0)
        {
            previous.next = next.next;
            previous = next.next;
            next = previous.next;
        }

        len--;
        count++;
    }
    return head;
}

    public void printList(){
        if (head == null){
            System.out.print("Empty List");
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val+"-->");
            curr = curr.next;
        }
       System.out.print("null");
       System.out.println();
   }

    public static void main(String[] args) {
       LinlLis list = new LinlLis();
       Node head = null;
       list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.inserNodeAt(head,2,2);
        list.printList();
       // list.deleteEvenNode();
        // DeleteAllEvenNode(head);
        list.printList();
        list.addLast(4);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
       // list.sizeOfList();
        System.out.println(list.sizeOfList());

        list.reverseList();
       list.printList();


    }
}
