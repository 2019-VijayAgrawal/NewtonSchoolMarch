package DSA2.LinkList;

/*Given two sorted linked lists consisting of N and M nodes
respectively. The task is to merge both of the list
(in-place) and return head of the merged list.*/

import java.util.*;

class Merge2LinkedList{

    /* Link list Node */
    static class Node {
        int key;
        Node next;
        Node(int key){
            this.key = key;
            next = null;
        }
    };

    // Function to reverse a given Linked List using Recursion
    static Node reverseList(Node head)
    {

        if (head.next == null)
            return head;

        Node rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    // Given two non-empty linked lists 'a' and 'b'
    static Node sortedMerge(Node a, Node b)
    {

        // Reverse Linked List 'a'
        a = reverseList(a);

        // Reverse Linked List 'b'
        b = reverseList(b);

        // Initialize head of resultant list
        Node head = null;

        Node temp;

        // Traverse both lists while both of them
        // have nodes.
        while (a != null && b != null) {

            // If a's current value is greater than or equal to
            // b's current value.
            if (a.key >= b.key) {

                // Store next of current Node in first list
                temp = a.next;

                // Add 'a' at the front of resultant list
                a.next = head;

                // Make 'a' - head of the result list
                head = a;

                // Move ahead in first list
                a = temp;
            }

            // If b's value is greater. Below steps are similar
            // to above (Only 'a' is replaced with 'b')
            else {

                temp = b.next;
                b.next = head;
                head = b;
                b = temp;
            }
        }

        // If second list reached end, but first list has
        // nodes. Add remaining nodes of first list at the
        // beginning of result list
        while (a != null) {

            temp = a.next;
            a.next = head;
            head = a;
            a = temp;
        }

        // If first list reached end, but second list has
        // nodes. Add remaining nodes of second list at the
        // beginning of result list
        while (b != null) {

            temp = b.next;
            b.next = head;
            head = b;
            b = temp;
        }

        // Return the head of the result list
        return head;
    }

 static   Node sortedMerge2(Node headA, Node headB)
    {

    /* a dummy first node to
       hang the result on */
        Node dummyNode = new Node(0);

    /* tail points to the
    last result node */
        Node tail = dummyNode;
        while(true)
        {

        /* if either list runs out,
        use the other list */
            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two
        lists whichever lists' data is
        smaller, append it into tail and
        advance the head to the next Node
        */
            if(headA.key <= headB.key)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;

}



    /* Function to print Nodes in a given linked list */
    static void printList(Node Node)
    {
        while (Node != null) {
            System.out.print(Node.key+ " ");
            Node = Node.next;
        }
    }

    /* Utility function to create a new node with
       given key */
    static Node newNode(int key)
    {
        Node temp = new Node(0);
        temp.key = key;
        temp.next = null;
        return temp;
    }

    /* Driver program to test above functions*/
    public static void main(String[] args)
    {
        /* Start with the empty list */
        Node res = null;
        Node res2 = null;

    /* Let us create two sorted linked lists to test
       the above functions. Created lists shall be
         a: 5.10.15.40
         b: 2.3.20  */
        Node a = newNode(5);
        a.next = newNode(10);
        a.next.next = newNode(15);
        a.next.next.next = newNode(40);

        Node b = newNode(2);
        b.next = newNode(3);
        b.next.next = newNode(20);

        System.out.print("List A before merge: \n");
        printList(a);

        System.out.print("\nList B before merge: \n");
        printList(b);

        /* merge 2 sorted Linked Lists */
       // res = sortedMerge(a, b);
        res2 = sortedMerge2(a,b);

        System.out.print("\nMerged Linked List is: \n");
        printList(res2);
    }
}

// This code is contributed by umadevi961