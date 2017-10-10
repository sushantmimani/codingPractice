package preparation.StacksAndQueues;

public class SortStack {
    Stack sorted = new Stack();
    Stack temp = new Stack();

    public void sortStack(int val){
        if(sorted.isEmpty()){
            sorted.push(val);
        }
        else if(val<sorted.peek()){
            sorted.push(val);
        }
        else{
            int top = sorted.peek();
            while(top<=val){
                temp.push(sorted.pop());
                temp.displayStack();
                if(!sorted.isEmpty())
                    top = sorted.peek();
                else
                    break;
            }
            sorted.push(val);
            while(!temp.isEmpty()){
                sorted.push(temp.pop());
            }
        }
    }

    public static void main(String[] args) {
        SortStack ss = new SortStack();
        ss.sortStack(7);
        ss.sorted.displayStack();
        ss.sortStack(4);
        ss.sorted.displayStack();
        ss.sortStack(2);
        ss.sorted.displayStack();
        ss.sortStack(9);
        ss.sorted.displayStack();
        ss.sortStack(1);
        ss.sorted.displayStack();
        ss.sortStack(3);
        ss.sorted.displayStack();
    }
}
