package MockInterview;

public class AddTwoNum {
    Node  head;
    int size= 0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return  head;
            }
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = null;
            return head;
        }
    }

    public Node addTwoNum(Node l1,Node l2){
         Node n1 = reverse(l1);
         Node n2 = reverse(l2);
         Node head = n1;
         Node curr = n1;
         Node curr2 = n2;
         int carry = 0,sum;
         Node dummyNode = new Node(-1);
         while (n1 != null || n2 != null ){
             int n1Val = n1 != null? curr.data : 0;
             int n2val = n2 != null ? curr2.data:0;

             sum = n1Val+n2val+carry;
             carry = sum/10;
             int lastDigit = sum%10;
               dummyNode.next = new Node(lastDigit);
               if (n1 != null){
                   curr = curr.next;
               }
               if (n2 != null){
                   curr2 = curr2.next;
               }
         }
          if (carry == 1){
              dummyNode.next = new Node(carry);
          }

        return dummyNode.next;
    }
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node temp;
        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
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
    public static void main(String[] args) {
        Node head1 = null;
        Node head2 = null;
        AddTwoNum list = new AddTwoNum();
        head1.addLast(4);
        head1.addLast(5);
        head1.addLast(6);
        list.print();
        AddTwoNum list2 = new AddTwoNum();
        head2.addLast(1);
        head2.addLast(2);
        head2.addLast(0);
        head2.addLast(5);
        list2.print();

        list.addTwoNum(head1,head2);


        //list2.reverse();
      //  list2.print();
    }
}
/*
* Given two linked list represent numbers. Return linkedlist which is sum of those two linked list.
Example:
List1:   4 -> 5 -> 6 -> null;
List2:   1 -> 2 -> 0 -> 5 -> null;
Output:  1 -> 6 -> 6 -> 1 ->null;
* */