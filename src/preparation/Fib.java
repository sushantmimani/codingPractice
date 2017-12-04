package preparation;

import java.util.Arrays;

public class Fib {

    public static void fibonacci(int n){
        int i=2;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int c;
        while(i<n){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            i++;
        }
        System.out.println();
    }

    public static int fib_recursion(int n){
        if(n==0 || n==1)
            return 0;
        if(n==2)
            return 1;
        return fib_recursion(n-1)+fib_recursion(n-2);

    }

    public static int fibonacci_recursion(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci_recursion(n-1)+fibonacci_recursion(n-2);

    }

    public static void fib_memoization(int n) {
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fib[i] = i;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        System.out.println(Arrays.toString(fib));
    }

    public static void main(String[] args) {
        fibonacci(10);
        System.out.println(fib_recursion(10));
        fib_memoization(10);
        for(int i=0;i<10;i++){
            System.out.print(fibonacci_recursion(i)+" ");
        }
    }
}
