package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*

 */

public class WeightedUniformStrings {

    static HashSet<Integer> hs = new HashSet<>();
    public static void calculateWeight(String s){
        int i = 0;
        int count =0;
        while(i<s.length()){
            int val = Character.getNumericValue(s.charAt(i))-10+1;
            hs.add(val);
            i++;
            count++;
            while(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
                hs.add(count*val);
                i++;
            }
            count =0;
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        calculateWeight(s);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            if(hs.contains(x))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
