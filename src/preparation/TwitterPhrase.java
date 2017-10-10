package preparation;

import java.util.*;

public class TwitterPhrase {

    static int maxPhrase(int[] a, int k){
        int max =0;
        for(int i=0;i<a.length;i++) {
            int j = i;
            int sum = 0;
            int numOfElements = 0;
            while (sum <= k) {
                if (j<a.length && sum + a[j] <= k) {
                    sum += a[j];
                    numOfElements++;
                    j++;
                } else {
                    if (numOfElements > max) {
                        max = numOfElements;
                    }
                        break;
                    }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println(maxPhrase(a,k));
    }
}
