package preparation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SubSequence {
        public static TreeSet<String> hs = new TreeSet<>();

        public static String[] buildSubsequence(String s){

            combinations("",s);
             String[] result = hs.toArray(new String[hs.size()]);
             return result;
        }
    public static TreeSet<String> combinations(String suffix,String prefix){
        if(prefix.length()<0)
            return new TreeSet<String>();
        if(!suffix.equals(""))
            hs.add(suffix);
        for(int i=0;i<prefix.length();i++)
            combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
        return hs;
    }

    public static void main (String args[]){
        String [] test = buildSubsequence("abc");

        for(String s: test){
            System.out.println(s);
        }
    }
}


