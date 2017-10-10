package preparation;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        int max=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for (int i = a; i <= b; i++) {
                if (hm.containsKey(i)) {
                    hm.put(i, hm.get(i) + k);
                } else {
                    hm.put(i, k);
                }
            }

        }

        for (Map.Entry entry : hm.entrySet()) {
            if(Integer.parseInt(entry.getValue().toString())>=max)
                max = Integer.parseInt(entry.getValue().toString());
        }
        System.out.println(max);
            in.close();
        }
    }

