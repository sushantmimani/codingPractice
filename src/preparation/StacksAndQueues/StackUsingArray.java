package preparation.StacksAndQueues;

import java.util.Scanner;

public class StackUsingArray {

    public static void main(String[] args) {
        int numStack = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of stack 1:");
        int size1 = sc.nextInt();
        System.out.print("Size of stack 2:");
        int size2 = sc.nextInt();
        System.out.print("Size of stack 3:");
        int size3 = sc.nextInt();
        int[] values = new int[size1+size2+size3];
        int[] filled = new int[numStack];
    }
}
