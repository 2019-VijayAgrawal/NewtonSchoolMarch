package DSA2.LinkList;

import java.util.Stack;

// Java implementation to delete all
// even nodes from the singly linked list
class LL2{

    // head of list
    static Node head;

    // Linked list Node
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Function to insert a node at
// the beginning of the singly
// Linked List
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Function to delete a node in a
// singly Linked List.
   static void deleteNode(int key)
    {

        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the
        // key to be deleted
        if (temp != null && temp.data == key)
        {

            // Changed head
            head = temp.next;
            return;
        }

        // Search for the key to be deleted,
        // keep track of the previous node
        // as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Function to delete all the nodes
// from linked list containing
// even numbers.
 static    void deleteEvenNodes()
    {
        Node ptr = head;

        // loop to iterate the linked list
        while(ptr != null)
        {

            // If containing element is even
            if(ptr.data % 2 == 0)
            {

                // Delete the node
                deleteNodee(ptr.data);
            }
            ptr = ptr.next;
        }
    }
  /*Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is palindrome or not.

A palindrome is a string/number that mirrors itself, for example, 21312 reverse is also 21312.*/
    public static boolean IsPalindrome(Node head) {
//enter your code here
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {

            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

// reverse List
    public  static Node reverse(){
        Node curr = head;
        Node prev = null;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
          head = prev;
        return  head;
    }
    //Or
    public static Node ReverseLinkedList(Node head) {
        // return the head of the modified linked list
        if(head == null || head.next == null){
            return head;
        }
        Node rev = ReverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
    private static void deleteNodee(int data) {
    }

    // This function prints contents of linked
// list starting from the given node
    public void printList()
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + "-> ");
            ptr = ptr.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        LL2 head = new LL2();
          Node curr = null;
        head.push(19);
        head.push(18);
        head.push(3);
        head.push(4);
        head.push(1);

        System.out.print("\nInitial List: ");
        head.printList();

        head.deleteEvenNodes();

        System.out.print("\nFinal List: ");
        head.printList();
        System.out.println();
        reverse();
        head.printList();
    }
}

// This code is contributed by Amit Mangal
