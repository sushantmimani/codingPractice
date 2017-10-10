package preparation;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackMax {

    LinkedList stack;

    public StackMax(){
        stack = new LinkedList();
    }

    public int size() {
        return stack.size();
    }

    public void push(int n){
        stack.addFirst(n);
    }

    public int pop(){
        return (int) stack.removeFirst();
    }

    public int peek() {
        return (int) stack.getFirst();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackMax stack = new StackMax();
        StackMax maxSt = new StackMax();
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int val = sc.nextInt();
                stack.push(val);
                if (val >= max) {
                    max = val;
                    maxSt.push(val);
                }
            }
                else if (type == 2) {
                    if (stack.isEmpty()) {
                        max = Integer.MIN_VALUE;
                    } else {
                        int popped = stack.pop();
                        if (popped == max) {
                            maxSt.pop();
                            if(maxSt.isEmpty())
                                max = Integer.MIN_VALUE;
                            else
                                max = maxSt.peek();
                        }
                    }

                } else {
                    System.out.println(maxSt.peek());

                }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
    }
}