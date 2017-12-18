/*
This sequence comes from a pattern of dots that form a triangle:
1, 3, 6, 10, 15, 21, 28, 36, 45, ...
xn = n(n+1)/2
 */
package preparation;

import java.util.Scanner;

public class IsTriangularNumber {

    private static void isTriangular(int num){
        int temp = (8*num)+1;
        int val = (int)Math.sqrt(temp);
        System.out.println(temp==val*val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            isTriangular(x);
        }
    }

}
