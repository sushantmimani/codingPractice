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

    private static void permutation(String prefix, String suffix) {
        int n = suffix.length();
        if (n == 0) hs.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, n));
        }
    }

    public static void main(String[] args) {
        permutation("abcc");
        for(Object s: hs)
            System.out.println(s);

    }
}
