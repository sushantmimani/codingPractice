package preparation;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {

    static void cyclicRotate(int [] arr) {
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter number of elements in array: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }
        cyclicRotate(arr);
        System.out.println(Arrays.toString(arr));
    }

}

