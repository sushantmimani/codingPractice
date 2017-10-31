package preparation;

import java.util.Arrays;

public class StringReverse {

    public static String reverseWords(String s) {
        s = s.trim();
        if(s.isEmpty())
            return "";
        String[] str = s.split(" ");
        if(str.length<=0)
            return "";
        int len = str.length-1;
        for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[len-i];
            str[len-i] = temp;

        }
        String a="";
        for(String x: str){
            a = a+x+" ";
        }
        return a;

    }

    public static void main(String[] args) {
        String s = reverseWords("   a   b ");
        System.out.println(s);
        String t = reverseWords("");
        System.out.println(t);

    }
}
