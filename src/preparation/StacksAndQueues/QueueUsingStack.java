package preparation.StacksAndQueues;


public class QueueUsingStack {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public void enqueue(int n){
        s1.push(n);
    }

    public int dequeue() {
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public static void main(String[] args) {
        QueueUsingStack qu = new QueueUsingStack();
        qu.enqueue(1);
        qu.enqueue(2);
//        qu.enqueue(3);
//        qu.enqueue(4);
//        qu.enqueue(5);
//        qu.enqueue(6);
        System.out.println(qu.peek());


    }
}
