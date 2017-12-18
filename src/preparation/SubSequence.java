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
    public static TreeSet<String> combinations(String prefix,String suffix){
        if(suffix.length()<0)
            return new TreeSet<String>();
        if(!prefix.equals(""))
            hs.add(prefix);
        for(int i=0;i<suffix.length();i++)
            combinations(prefix+suffix.charAt(i),suffix.substring(i+1,suffix.length()));
        return hs;
    }

    public static void main (String args[]){
        String [] test = buildSubsequence("abc");

        for(String s: test){
            System.out.println(s);
        }
    }
}


