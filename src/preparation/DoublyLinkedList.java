package preparation;



public class DoublyLinkedList {

    public void displayList(dNode head) {
        dNode current = head.next;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    dNode SortedInsert(dNode head, int data) {

        dNode newNode = new dNode(data);
        dNode temp = head;
        Boolean inserted = false;
        newNode.prev = null;
        newNode.next = null;
        if(head.next==null){
            head.next = newNode;
            newNode.prev = head;
            return head;
        }
        else{
            dNode current = head.next;
            dNode prev = null;
            while(current!=null){
                if(current.data>=data){
                    newNode.prev=current.prev;
                    current.prev.next = newNode;
                    newNode.next = current;
                    current.prev = newNode;
                    inserted = true;
                    return temp;
                }
                else{
                    prev=current;
                    current = current.next;
                }
            }
            if(!inserted){
                prev.next = newNode;
                newNode.prev = prev;
            }
        }
        return temp;
    }



    public static void main(String args[]) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dNode head = new dNode(0);
        dl.SortedInsert(head,4);
        dl.SortedInsert(head,5);
        dl.SortedInsert(head,3);
        dl.SortedInsert(head,1);
        dl.SortedInsert(head,51);
        dl.displayList(head);


    }
}
