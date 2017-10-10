package preparation;

import java.util.*;

public class Queue {

    LinkedList queue;

    public Queue(){
        queue = new LinkedList();
    }

    public void enqueue(int n){
        queue.addLast(n);
    }

    public int dequeue(){
        return (int)queue.removeFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int peek(){
        return (int)queue.getFirst();
    }


    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        qu.enqueue(5);
        System.out.println(qu.dequeue());
        System.out.println(qu.peek());
        System.out.println(qu.dequeue());

    }
}
