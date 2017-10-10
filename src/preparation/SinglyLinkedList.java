package preparation;

public class SinglyLinkedList {

    public  Node insert(Node head, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        else {
            while (head.next != null) {
                head = head.next;
            }
            head.next=newNode;
            return temp;
        }
    }

    public  void displayList(Node head) {
        if(head ==null)
            System.out.println("Empty List");
        else {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static Node reverseList(Node head){
        if (head == null)
            return head;
        else {
            Node prev = null;
            Node next = null;
            Node current = head;
            while(current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;

        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        SinglyLinkedList sl = new SinglyLinkedList();
        head = sl.insert(head, 1);
        head = sl.insert(head, 2);
        head = sl.insert(head, 3);
        head = sl.insert(head, 4);
        head = sl.insert(head, 5);
        sl.displayList(head);
        head = reverseList(head);
        sl.displayList(head);

    }
}
