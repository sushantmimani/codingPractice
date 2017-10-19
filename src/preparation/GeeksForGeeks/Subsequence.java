package preparation.GeeksForGeeks;
import java.util.HashSet;


/*
 Generate all permutations of a string. Simple print for all non-distinct permutations.
 Uses a hashset to save distict permutations
 */

public  class Subsequence {

    static HashSet hs = new HashSet();

    public static void combinations(String prefix,String str){

        int n = str.length();
        if(!prefix.equals(""))
            hs.add(prefix);
        for(int i=0;i<n;i++)
            combinations(prefix+str.charAt(i),str.substring(i+1,n));
    }

    public static void main (String args[]){
        combinations("","abc");
        for(Object s: hs)
            System.out.println(s);
    }
}