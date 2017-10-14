package preparation.GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class KthNonRepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        String s = sc.next();
        int ascii[] = new int[256];
        for(int i=0;i<s.length();i++){
            ascii[(int)s.charAt(i)]++;
        }
        int count =0;
        int i;
        for(i=0;i<ascii.length;i++){
            if(count==k)
                break;
            if (ascii[i]==1){
                count++;
            }
        }
        if(count==k)
            System.out.println((char)(i-1));
        else
            System.out.println("k is beyond range");
    }
}
