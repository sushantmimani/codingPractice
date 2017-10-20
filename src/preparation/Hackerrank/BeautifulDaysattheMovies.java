package preparation.Hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulDaysattheMovies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        while (m<=n){
            int rev = Integer.parseInt(new StringBuilder(Integer.toString(m)).reverse().toString());
            if(Math.abs((m-rev))%k==0)
                count++;
            m++;
        }
        System.out.println(count);

    }
}
