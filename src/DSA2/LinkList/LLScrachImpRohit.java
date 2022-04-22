package DSA2.LinkList;
class LLScratchImplRohit {

    Node head;
    int size=0;
    public class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // LLScratchImpl () {
    //    size = 0;
    // }

// newNode=783456347------>   ["to",null]

    // Class Human-> height,weight
    // Human obj----> [object] of type Human
    // obj.height

    //  head=null



    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }

    // head->["to",addOfNextNode]->[Newton,null]
    //     ptr=null------------------------^
    public void printList() {

        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("null");

    }

    //head->Welcome->to->newton->school->null
    //head->to->newton->school->null

    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public int getSize() {
        return size;
    }

    public void removeFirst(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }

        head=head.next;
        size--;
    }

    // head=[1,345]->[2,3455]->[3,null]
// /ptr-------------^
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
    }

    public void addSomewhere(int index, String data) {

    }
    public static void main(String[] args) {
        LLScratchImplRohit list = new LLScratchImplRohit();

        list.addLast("to");
        list.addLast("Newton");
        list.addLast("School");
        list.printList();

        list.addFirst("Welcome");
        list.printList();

        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        list.addSomewhere(3,"School");
        list.printList();
    }
}