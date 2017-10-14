package preparation;

import java.util.*;

public class Pangram {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean flag = true;
        int[] a = new int[26];
        for(int i=0; i<s.length();i++){
            if(Character.getNumericValue(s.charAt(i))>=10 && Character.getNumericValue(s.charAt(i))<=36){
                int temp = Character.getNumericValue(s.charAt(i))-10;
                a[temp] = a[temp]+1;
            }
        }
        for(int j=0;j<26;j++){
            if(a[j]==0){
                flag = false;
                System.out.println("not pangram");
                break;
            }
        }
        if(flag){
            System.out.println("pangram");
        }
    }
}

