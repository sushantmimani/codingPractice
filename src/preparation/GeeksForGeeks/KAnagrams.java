package preparation.GeeksForGeeks;

import java.util.Arrays;

public class KAnagrams {

    public static boolean arekAnagrams(String s1, String s2, int k){
        int alphabets[] = new int[26];
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            alphabets[(int)s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            alphabets[(int)s2.charAt(i)-97]--;
        }
        int count =0;
        for(int i=0;i<26;i++){
            count+=alphabets[i];
        }
        return k>=count;
    }
    public static void main(String args[])
    {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        if (arekAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
