package preparation;

import java.util.Scanner;

public class Exponent {

    public static int iterativeExponent(int x, int y){
        int prod =1;
        for(int i =0;i<y;i++){
            prod*=x;
        }
        return prod;
    }

    public static int recursiveExponent(int x, int y){
        if(y==0)
            return 1;
        return x*recursiveExponent(x,y-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:");
        int x = sc.nextInt();
        System.out.print("enter y:");
        int y = sc.nextInt();
        System.out.println("x^y:"+(int)Math.pow(x,y));
        System.out.println("x^y:"+iterativeExponent(x,y));
        System.out.println("x^y:"+recursiveExponent(x,y));

    }
}
