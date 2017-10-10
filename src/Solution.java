import java.util.*;
class Solution{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");

        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        for(String s: queue){
            System.out.println(s);
        }

        while(!queue.isEmpty()){
            String s = queue.poll();
            System.out.println(s);
        }
    }
}