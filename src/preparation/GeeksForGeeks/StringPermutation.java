package preparation.GeeksForGeeks;
import java.util.HashSet;


/*
 Generate all permutations of a string. Simple print for all non-distinct permutations.
 Uses a hashset to save distict permutations
 */

public  class StringPermutation {

    static HashSet hs = new HashSet();

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) hs.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    public static void main(String[] args) {
        permutation("aabc");
        for(Object s: hs)
            System.out.println(s);

    }
}

//import java.util.HashSet;
//
//class StringSubsequence{
//     static HashSet hs = new HashSet();
//    public static void combinations(String suffix,String prefix){
//        if(prefix.length()<0)return;
//        hs.add(suffix);
//        for(int i=0;i<prefix.length();i++)
//            combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
//    }
//
//    public static void main (String args[]){
//        combinations("","abc");
//        for(Object s: hs)
//            System.out.println(s);
//    }
//}