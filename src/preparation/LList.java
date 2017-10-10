package preparation;

import preparation.StacksAndQueues.Stack;

import java.util.HashSet;

public class LList {

    Node head;

    /*
    Insert an element at the end of a singly linked list
     */
    public  Node insertAtTail(int data) {
        Node head = this.head;
        Node temp = head;
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        else {
            while (head.getNext() != null) {
                head = head.getNext();
            }
            head.setNext(newNode);
            return temp;
        }
    }

    /*
    Insert an element at the head of a singly linked list
     */
    public Node insertAtHead (int data) {
        Node head = this.head;
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        else{
            this.head = newNode;
            newNode.setNext(head);
        }
        return this.head;
    }


    /*
    Iterate through the list and display all elements
     */
    public  void displayList() {
        Node head = this.head;
        if(head ==null)
            System.out.println("Empty List");
        else {
            while (head != null) {
                System.out.print(head.getData() + " ");
                head = head.getNext();
            }
            System.out.println();
        }
    }

    /*
    Delete duplicate elements in an unsorted list
     */
    public  Node deleteDuplicate(){
        HashSet<Integer> hs = new HashSet<Integer>();
        if(head==null)
        {
            return head;
        }
        Node prev = null;
        Node current = head;
        while(current!=null){
            if(hs.contains(current.getData())){
                prev.setNext(current.getNext());

            }
            else{
                hs.add(current.getData());
                prev = current;
            }
            current = current.getNext();

        }
        return head;
    }

    /*
    Return the k to last element in a singly linked list
     */
    public  Node kToLast(int index){
        Node head = this.head;
        Node slowRunner = head;
        Node fastRunner = head;
        while(index!=0){
            fastRunner = fastRunner.getNext();
            index--;
        }
        while(fastRunner.getNext()!=null){
            slowRunner  = slowRunner.getNext();
            fastRunner = fastRunner.getNext();
        }
        return slowRunner;
    }

    /*
    Delete the middle element in a singly linked list
     */
    public Node deleteMiddle(){
        if(head==null){
            return head;
        }
        Node slowRunner = head;
        Node prev = null;
        Node fastRunner = head;
        while(fastRunner!=null && fastRunner.getNext()!=null){
            prev = slowRunner;
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext().getNext();
        }
        prev.setNext(slowRunner.getNext());
        return head;
    }

    /*
    Check if there is a loop in the linked list
     */
    public Boolean loop(){
        HashSet hs = new HashSet();
        if(head == null){
            return false;
        }
        while (head!=null){
            if(!hs.contains(head)){
                hs.add(head);
                head = head.getNext();
            }
            else{
                return true;
            }
        }
        return false;
    }

    /*
    Partition the elements on the linked list around a value x, such that all elements less than x come
    before all elements greater than or equal to x
     */
    public LList partition(int part) {
        LList newList = new LList();
        newList.head = newList.insertAtHead(this.head.getData());
        Node next = this.head.getNext();
        Node newHead = this.head;
        Node newTail = this.head;
        while(next!=null){
            if(next.getData()<part){
               newList.insertAtHead(next.getData());
            }
            else{
                newList.insertAtTail(next.getData());
            }
            next = next.getNext();
        }
        return newList;
    }

    /*
    Check if the items in the linked list form a palindrome
     */
    public Boolean palindrome() {
        if(head==null){
            return true;
        }
        Node slowRunner = head;
        Node fastRunner = head;
        Stack st = new Stack();
        while(fastRunner.getNext()!=null && fastRunner!=null ){
            st.push(slowRunner.getData());
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext().getNext();
        }
        if(fastRunner!=null){
            slowRunner = slowRunner.getNext();
        }
        while(slowRunner!=null){
            int val = st.pop();
            if(val ==slowRunner.getData()){
                slowRunner=slowRunner.getNext();
            }
            else
                return false;
        }
        return true;

    }


    /*
    Reverse a linked list
     */

    public Node reverse() {
        if(this.head==null){
            return head;
        }
        Node prev=null;
        Node next = null;
        Node current = this.head ;
        while (current!=null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    /*
    Main function
     */
    public static void main(String[] args) {
        LList sl = new LList();
        sl.head = sl.insertAtTail(1);
        sl.head = sl.insertAtTail(1);
        sl.head = sl.insertAtTail(2);
        sl.head = sl.insertAtTail(2);
        sl.head = sl.insertAtTail(1);
        sl.head = sl.insertAtTail(1);

//        sl.head = sl.insertAtTail(1);
//        sl.head = sl.insertAtTail(2);
//        sl.head = sl.insertAtTail(3);
//        sl.head = sl.insertAtTail(4);
//        sl.head = sl.insertAtHead(99);
//        sl.displayList();
//        sl = sl.partition(5);
//        sl.head = sl.partition1(5);
//        sl.deleteDuplicate();
//        sl.displayList();
//        System.out.println(sl.loop());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter K");
//        int index = sc.nextInt();
//        Node k = sl.kToLast(index);
//        System.out.println(k.getData());
//        sl.deleteMiddle();
//        sl.displayList();
        System.out.println(sl.palindrome());
//        sl.head = sl.reverse();
//        sl.displayList();


    }

}
