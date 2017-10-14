package preparation.GeeksForGeeks;

import java.util.Scanner;

public class KthDecrypted{

    public static char encodedChar(String s, int k){
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for(int i=0;i<s.length();){
            StringBuilder temp = new StringBuilder();
            while(i<s.length()&& !Character.isDigit(s.charAt(i))){
                temp.append(s.charAt(i));
                i++;
            }
            while(i<s.length()&& Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
                i++;
            }
            int val = Integer.parseInt(num.toString());
            num = new StringBuilder();
            for(int j=0;j<val;j++)
                sb.append(temp);


        }
        return sb.toString().charAt(k-1);
    }

    public static void main(String args[])
    {
        String str = "ab4c12ed3";
        int k = 21;
        System.out.println(encodedChar(str, k));
    }
}
