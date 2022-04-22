package Assignment.LinkList;

public class AddTwoNumber {
    Node head;
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public Node push(int data){
        Node newNode = new Node(data);
        //if (head)
        return head;
    }
    Node head1, head2, result;
    int carry;
    public static void main(String[] args) {
       AddTwoNumber list = new AddTwoNumber();
       list.head1  = null;
       list.head2 = null;
       int[] arr1 = {1,5,8};
       int[] arr2 = {2,5,7};
        for (int i = arr1.length-1; i >= 0; i--) {
            //list
        }

    }
  public  Node addNumber(Node first, Node second){
// return the head of the modified linked list
        Node ans = new Node(0);
        Node p = first,q= second,curr = ans;
        int carry = 0;
        while(p != null || q != null){
            int x = (p!=null) ? p.data : 0;
            int y = (q!=null) ? q.data : 0;
            int sum = x + y + carry;
            carry = sum /10;
            curr.next = new Node(sum%10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0){
            curr.next = new Node(carry);
        }
        return ans.next;
    }
}
