package preparation;

import java.util.Scanner;

public class BinarySearch {

    public static int search(int v, int[] arr,int l, int r){
        if(r>=l) {
            int mid = (l + r-1) / 2;
            if (arr[mid] == v)
                return mid;
            else {
                if (v <= arr[mid])
                    return search(v, arr, l, mid);
                else
                    return search(v, arr, mid + 1, r);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int index = search(v,a,0,n-1);
        System.out.println(index);
    }
}
