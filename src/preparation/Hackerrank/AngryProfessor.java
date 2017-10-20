package preparation.Hackerrank;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++) {
            int count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (temp <=    0)
                    count++;
            }
            if (count >=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
