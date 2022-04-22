package DSA2.LinkList;

import java.util.Stack;

public class AddTwoNumbers {
   static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head1,head2,result;
   public static void pushHead1(int newdata){
       Node newNode = new Node(0);
       newNode.data = newdata;
       newNode.next = head1;
       head1 = newNode;
   }
   public static void pushHead2(int newdata){
       Node newNode = new Node(0);
       newNode.data = newdata;
       newNode.next = head2;
       head2 = newNode;
   }
   public static Node addTwoNumber(){
       Stack<Integer> stack1 = new Stack<>();
       Stack<Integer> stack2 = new Stack<>();
       while (head1 != null){
           stack1.push(head1.data);
           head1 = head1.next;
       }
       while (head2 != null){
           stack2.push(head2.data);
           head2 = head2.next;
       }
       int carry = 0;
       Node result = null;
       while (!stack1.isEmpty() || !stack2.isEmpty()){
           int a =0 ;
           int b = 0;
           if (!stack1.isEmpty()){
               a = stack1.pop();
           }
           if (!stack2.isEmpty()){
               b = stack2.pop();
           }
           int total = a + b + carry;
           carry = total/10;
           Node temp = new Node(total%10);
           if (result == null){
               result = temp;
           }
           else {
               temp.next = result;
               result = temp;
           }
       }
       if (carry != 0){
           Node temp = new Node(carry);
           temp.next = result;
           result = temp;
       }
       return result;
   }
   public static void print(){
       while (result != null){
           System.out.print(result.data+" ");
           result = result.next;
       }
       System.out.println();
   }
    public static void main(String[] args) {
         int[] arr1 = {5,6,7};
         int n1 = arr1.length;
        System.out.println(n1);
         int[] arr2 = {999};
         int n2 = arr2.length;
        for (int i = n1-1; i >= 0; --i) {
            pushHead1(arr1[i]);
        }
        for(int i = n2-1; i >= 0;--i){
            pushHead2(arr2[i]);
        }
        result = addTwoNumber();
        print();
    }
}
