package DSA2.LinkList;
//https://my.newtonschool.co/playground/code/84g1o922m7lc/
public class DLL {
    Node head;
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private void inserAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }
    public static Node Reverse(Node head) {
//complete this function
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }
    public  void insertAtTail(int data){
        if (head == null){
            inserAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    void deleteAtPos(int pos){
        Node temp = head;
        int len = 0;
        while (temp != null && len != pos){
            len++;
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;


        temp = head;
        Node prev = null;
        if (pos>len){
            return;
        }
        else{
            for (int i = 0; i < len-pos+1; i++) {
                prev = temp;
                temp = temp.next;

            }
            prev.next.next = temp.next;
        }
    }
    void display(){
        Node temp = head;
        int count =  0;
        while (temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
            count++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     DLL list = new DLL();
     list.inserAtHead(1);
     list.inserAtHead(2);
     list.display();
     list.insertAtTail(5);
     list.display();
     list.insertAtTail(6);
     list.display();
     list.deleteAtPos(2);
        list.display();

    }
}
