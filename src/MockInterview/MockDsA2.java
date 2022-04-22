package MockInterview;

public class MockDsA2 {
    Node head;
   class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public Node addFirst(int data){
       Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           return  head;
       }
       newNode.next = head;
       head = newNode;
       return head;
    }
    public void print(){
       if (head == null){
           System.out.println("Empty");
       }
       Node curr = head;
       while (curr != null){
           System.out.print(curr.data+"-->");
           curr = curr.next;
       }
        System.out.println("null");
        System.out.println();
    }
    public Node addOneToList(){
          Node curr = head;
          Node temp = head;
         //Node x = reverse(head);
        // int data
          while (curr.next != null){
              curr = curr.next;
          }
          curr.data = curr.data+1;
       return head;
    }
    public Node addOneToList2(){
       Node curr = reverse(head);
       Node temp = curr;
       Node temp2 = curr;
       Node prev = null;
       int carry = 0;
       int sum;
       while (temp != null){
           if (prev == null){
               sum = temp.data + 1;
           }
           else {
               sum = temp.data + carry;
           }
           carry = sum/10;
           temp.data = sum%10;

           prev = temp;
           temp = temp.next;
       }
       if (carry == 1){
           Node newNode = new Node(1);
           prev.next = newNode;
       }
        return reverse(temp2);
    }

    public Node reverse(Node head){
       //1 2 3
       Node curr = head;
       Node prev = null;
       while (curr != null){
           Node temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       head = prev;
       return head;
    }
    public static void main(String[] args) {
       Node head = null;
        MockDsA2 list = new MockDsA2();
        list.addFirst(9);
        list.addFirst(9);
        list.addFirst(9);

        list.print();
        list.addOneToList2();
        list.print();
       // list.addOneToList();
       // list.print();



    }
}
