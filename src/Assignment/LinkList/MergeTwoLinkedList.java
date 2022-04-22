package Assignment.LinkList;

public class MergeTwoLinkedList {
    Node head;
    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public void pushLast(Node node){
       // Node newNode = new Node(data);
        if (head == null){
           head = node;
         //  return head;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
       // newNode.next = null;
       // return head;
    }
    public void print(){
        if (head == null){
            System.out.println("Empty List");
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
       MergeTwoLinkedList list = new MergeTwoLinkedList();
       Node head1 = null;
       Node head2 = null;
       int[] arr = {1,4,5,7};
       int[] arr2 = {2,3,6};
       list.pushLast(new Node(5));
      list.pushLast(new Node(10));
      list.pushLast(new Node(15));
     list.print();

     MergeTwoLinkedList list1 = new MergeTwoLinkedList();
     MergeTwoLinkedList list2 = new MergeTwoLinkedList();
     list1.pushLast(new Node(1));
     list1.print();
        for (int i = 0; i < arr.length; i++) {
            list1.pushLast(new Node(arr[i]));
        }
        for (int i = 0; i < arr2.length; i++) {
            list2.pushLast(new Node(arr[i]));
        }
        list1.print();
        list2.print();
    }
}
