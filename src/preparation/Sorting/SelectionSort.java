package preparation.Sorting;

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] unsorted = new int[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.nextInt();
        }
        int minIndex =0;

        for(int i=0;i<unsorted.length;i++){
            minIndex = i;
            for(int j=i+1;j<unsorted.length;j++){
                if(unsorted[j]<=unsorted[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = unsorted[i];
                unsorted[i] = unsorted[minIndex];
                unsorted[minIndex] = temp;
            }


        }

        System.out.println(Arrays.toString(unsorted));

    }
}

