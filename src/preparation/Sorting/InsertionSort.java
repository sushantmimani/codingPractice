package preparation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void sort(int[] arr){
        int shifts =0;
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                shifts++;
                i--;
            }
            arr[i+1]=key;

        }
        System.out.println("Shifts:"+shifts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
