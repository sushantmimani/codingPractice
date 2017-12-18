/* Implement a priority queue
 Implements a priority queue using a max heap. The heap is of fixed size and
 represented using an array.
*/

package preparation;

import java.util.Arrays;

public class PriorityQueue {
    int[] heap;
    int size;

    public PriorityQueue(int size){
        this.size = 0;
        this.heap = new int[size];
    }

    private void printHeap(){
        System.out.println(Arrays.toString(heap));
    }
    private void swapElements(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;

    }

    public void push(int val){
        if(heap.length==this.size) {
            throw new IllegalStateException();
        }
        heap[size] = val;
        int currentIndex = size;
        while(currentIndex >0){
            int parent = (currentIndex-1)/2;
            if(heap[currentIndex] > heap[parent]) {
                swapElements(currentIndex, parent);
            }
            currentIndex = parent;
        }
        size++;
    }

    public int pop(){
        if(size==0)
            throw new IllegalStateException();
        int returnVal = heap[0];
        heap[0] = heap[size-1];
        heap[size-1] = 0;
        size--;
        int currentIndex =0;
        while(currentIndex<size/2){
            int left = (2*currentIndex)+1;
            int right = (2*currentIndex)+2;
            if(right< size && heap[right]> heap[left]){
                if(heap[right]>heap[currentIndex]) {
                    swapElements(currentIndex, right);

                }
            }
            else if (heap[left]>= heap[currentIndex]) {
                swapElements(currentIndex, left);
            }
                currentIndex = left;
        }
        return returnVal;
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();
        queue.pop();
        queue.printHeap();

    }
}
