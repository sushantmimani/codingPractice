package preparation;

class dNode {
    int data;
    dNode next;
    dNode prev;


    public dNode(int data) {
        this.data = data;
    }


    dNode Reverse(dNode head) {
        dNode temp = head;
        dNode newHead = head;
        while (temp != null) {
            dNode prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            newHead = temp;
            temp = temp.prev;
        }
        return newHead;

    }
}