package preparation.StacksAndQueues;

import java.util.ArrayList;

public class StackOfPlates {
    int sizeOfStack ;
    ArrayList<Stack> arrayList;
    int items;

    public StackOfPlates(){
        this.sizeOfStack = 3;
        this.arrayList = new ArrayList<Stack>();
        this.items = 0;

    }
    public void displayStacks() {
        for(Stack st: arrayList){
            st.displayStack();
        }
    }
    public void push(int n){
        if(arrayList.size()==0){
            Stack newStack = new Stack();
            newStack.push(n);
            arrayList.add(newStack);
        }
        else {
            Stack last = arrayList.get(arrayList.size() - 1);
            if (last.getSize() == this.sizeOfStack) {
                Stack newStack = new Stack();
                newStack.push(n);
                arrayList.add(newStack);
            } else {
                last.push(n);
            }
        }
        this.items++;
    }

    public int pop(){
        try {
            Stack last = arrayList.get(arrayList.size() - 1);
            int val = last.pop();
            if (last.getSize() == 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            return val;
        }
        catch (Exception e){
            System.out.println("Stack underflow error");
            return Integer.MIN_VALUE;
        }
    }

    /*
    This function pops the specific sub-stack based on index. It does not shift items
     */
    public int popAt(int index){
        if(index > this.items){
            System.out.println("Index out of bounds");
            return Integer.MIN_VALUE;
        } else {
            int st = (index - 1) / this.sizeOfStack;
            Stack stack = arrayList.get(st);
            int val= stack.pop();
            if(stack.isEmpty()){
                arrayList.remove(st);
            }
            return val;
        }
    }


    public static void main(String[] args) {
        StackOfPlates stackOfPlates = new StackOfPlates();
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);
        stackOfPlates.push(4);
        stackOfPlates.push(5);
        stackOfPlates.push(6);
        stackOfPlates.push(7);
        stackOfPlates.push(8);
        stackOfPlates.push(9);
        stackOfPlates.push(10);
//        System.out.println(stackOfPlates.pop());
//        System.out.println(stackOfPlates.pop());
//        System.out.println(stackOfPlates.pop());
//        System.out.println(stackOfPlates.pop());
//        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.popAt(10));
        System.out.println(stackOfPlates.popAt(1));
        stackOfPlates.displayStacks();
        stackOfPlates.push(11);
        stackOfPlates.displayStacks();


    }
}
