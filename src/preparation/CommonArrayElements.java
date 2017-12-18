
/*
Q: You are given two arrays of size m and n. Find the common elements between those arrays.

Say, arr1 = {2, 5, 3} and arr2 = {5, 1, 2}. The common elements between those arrays are as follow:
ans = {2, 5}
*/
package preparation;
import java.util.*;

public class CommonArrayElements {

    private static Set<Integer> convertToSet(int []a){
        int len = a.length;
        Integer[] temp = new Integer[len];
        for (int i=0;i<len;i++){
            temp[i] = new Integer(a[i]);
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(temp));
        return set;
    }
    private static void findCommon(int[] a, int[] b){
        Set<Integer> set_1 = convertToSet(a);
        Set<Integer> set_2 = convertToSet(b);
        set_1.retainAll(set_2);
        for(Integer i : set_1)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {4,5,6,7,8};
        findCommon(a,b);
    }
}
