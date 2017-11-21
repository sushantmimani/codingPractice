package preparation;

import java.util.Stack;
import java.util.TreeSet;

public class Zigzag {

    static int zigzag(int[] a) {
        int max = 0;
        int prevMax = 0;
        for(int i=1;i<a.length-1;i++){
            if((a[i-1]<a[i] && a[i+1]<a[i]) || (a[i-1]>a[i] && a[i+1]>a[i])){

                max++;

            }
            else{
                if(max > prevMax)
                    prevMax = max;
                max =0;
            }


        }
        if(max >= prevMax)
            prevMax = max;
        return prevMax+2;

    }

    public static void main(String[] args) {
//        int a[] = {5, 3, 5, 3};
        int a[] = {9, 8, 8, 5, 3, 5, 3, 2, 8, 6};
        System.out.println(zigzag(a));
        TreeSet s = new TreeSet();
        s.add("ABS");
        System.out.println(s.size());
        s.pollFirst();
        System.out.println(s.size());

        Stack<Character> st = new Stack<>();
        st.push('c');
        System.out.println(st.pop());

    }
}
