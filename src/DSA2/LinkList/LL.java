package DSA2.LinkList;
//Insert
//Delete
//add - first , last
public class LL {
    Node head;
    Node tail;
    Node size;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node reverseList(Node node) {
        Node curr = node;
        Node prev = null;

        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        //  Node last
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }
        head = prev;
    return head;
    }
 public  int sizeOfList(){
        int count = 0;
       // Node  head;
     Node curr = head;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        return count;
 }
    //add- first,last
    public void addFirst(String data){
        Node temp = new Node(data);    //creating new node
        if (head == null){
            head = temp;
            return;
        }
      temp.next = head;
       head = temp;
    }
    //add Last
    public void addLast(String data){
        Node tempNode = new Node(data);
        if (head == null){
            head = tempNode;
            return;
        }
        //Terverse
        Node currentNode = head;   // for Traverse LinkList we create Node
        while (currentNode.next != null){
              currentNode = currentNode.next; //updae currentNode
        }
        currentNode.next = tempNode;
    }
    //DeleteFirst
    public void deleteFirst(String data){
        Node tempNode = new Node(data);
        if (head == null);
        {
            System.out.println("List is Empty");
        }
        head = tempNode.next;
    }

  // Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list
  public  Node deleteElement(int k) {
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
//// Single Linked List - In Class - Insert node at the given position
//public  Node addElement(Node head, int k ,int pos ) {
////enter your code here
////k==pos
//
//    Node newNode = new Node(k);
//    // System.out.println(len);
//    if(pos == 1){
//        newNode.next = head;
//        head = newNode;
//        return head;
//    }
//    else{
//        Node curr = head;
//        for(int i = 1; i < pos-1 && curr != null;i++){
//            curr = curr.next;
//        }
//        Node pre = curr.next;
//        curr.next = newNode;
//        newNode.next = pre;
//    }
//    return head;
    //Print List
    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LL list = new LL();
       // list.head = new Node(85);
        Node head = null;
        list.addFirst("is");
         list.addFirst("This");
        // This-->Is
        list.printList();
        list.addLast("a");
        list.addLast("List");
       // list.reverseList("L");
        list.reverseList(head);
        list.printList();
       // list.printList(sizeOfList());
        //sizeOfList()
        System.out.println(list. sizeOfList());

        list.deleteElement(2);
        list.printList();

    }
}
