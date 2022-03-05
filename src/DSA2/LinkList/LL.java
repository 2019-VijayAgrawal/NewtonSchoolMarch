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
        list.addFirst("is");
         list.addFirst("This");
        // This-->Is
        list.printList();
        list.addLast("a");
        list.addLast("List");
        list.printList();
    }
}
