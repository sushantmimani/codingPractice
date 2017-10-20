package preparation.Hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class IceCreamParlor {

    public static void getIds(int money, int[] ids){
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        int id1 = 0;
        int id2 = 0;
        for (int i=0;i<ids.length;i++){
            if(hm.containsKey(money- ids[i])){
                id1 = hm.get(money- ids[i])+1;
                id2 = i+1;
                break;
            }
            else {
                hm.put(ids[i],i);
            }
        }
        if(id1>=id2)
            System.out.println(id1+" "+id2);
        else
            System.out.println(id2+" "+id1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int money = sc.nextInt();
            int flavors = sc.nextInt();
            int[] ids = new int[flavors];
            for(int j=0;j<flavors;j++)
                ids[j]=sc.nextInt();
            getIds(money, ids);
        }

    }
}
