package preparation.StacksAndQueues;

import java.util.*;

public class Stack {

    LinkedList stack;
    LinkedList minimum;
    int min ;

    public Stack(){
        stack = new LinkedList();
        minimum = new LinkedList();
        min = Integer.MAX_VALUE;
    }

    public void displayStack() {
        System.out.println(Arrays.toString(stack.toArray()));

    }
    public int getSize() {
        return stack.size();
    }
    public void push(int n){
        if(n<=min || stack.isEmpty()){
            minimum.push(n);
            this.min = n;
        }
        stack.addLast(n);
    }

    public  int getMin() {
        return !minimum.isEmpty()?(int)minimum.peek():(int)stack.peek();
    }

    public int pop(){
        int val =  (int)stack.removeLast();
        if(val == this.min){
            minimum.pop();
            if(!minimum.isEmpty()){
                this.min = (int)this.minimum.peek();
            }
            else{
                this.min = (int)this.stack.peek();
            }
        }
        return val;
    }

    public int peek()
    {
        return (int)stack.getLast();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());

    }
}
