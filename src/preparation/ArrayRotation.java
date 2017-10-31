package preparation;

import java.util.*;

public class ArrayRotation {
    int arr[];

    static void  simpleLeftRotate(int arr[], int n, int d){
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        int j =0;
        for (int k = d; k < n; k++) {
            arr[j++] = arr[k];
        }
        int x=0;
        for(int k = j;k<n;k++) {
            arr[k] = temp[x++];
        }
    }

    static void betterRotation(int arr1[], int n, int d){
        for (int i =0; i<d; i++) {
            betterRotationHelper(arr1,n);
        }

    }

    static void betterRotationHelper(int[] arr1, int n ) {
        int temp = arr1[0];
        for(int i = 1; i< n ;i++) {
            arr1[i-1] = arr1[i];
        }
        arr1[n-1] = temp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter number of elements in array: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter elements");
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
            arr1[i] = arr[i];
        }

        System.out.println("Enter left rotation degree");
        int d = reader.nextInt(); // Scans the next token of the input as an int.
        simpleLeftRotate(arr, n, d);
        System.out.println("After simple rotation"+ Arrays.toString(arr));
        betterRotation(arr1, n, d);
        System.out.println("After better rotation"+ Arrays.toString(arr1));

        int c = 'S';
        System.out.println(c);
    }

}
