package Assignment.LinkList;
/*Add 1 to a number represented as linked list
Problem Statement
A number (n) is represented in Linked List such that each digit corresponds to a node in linked list. Add 1 to it.

Note:- Linked list representation of a number is from left to right i.e if the number is 123 than in linked list it is represented as 3->2->1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addOne() that takes head node of the linked list as parameter.

Constraints:
1 <=length of n<= 1000
Output
Return the head of the modified linked list.
Example
Input 1:
456

Output 1:
457

Input 2:
999

Output 2:
1000*/
public class AddOne {
    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
     Node addOne(Node head){
// return the head of the modified linked list
        Node curr = head;
        Node prev = head;
        int carry = 0;
        int sum = curr.data+1;
        curr.data = sum%10;
        carry = sum / 10;
        curr = curr.next;
        while(curr != null){
            sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            prev = curr;
            curr = curr.next;

        }
        if(carry >0){
            prev.next = new Node(carry);
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
