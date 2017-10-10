package preparation;

import java.util.HashSet;
import java.util.Scanner;

public class Strings {

    static boolean isUnique(String str){
        char[] arr = str.toCharArray();
        boolean res = true;
        HashSet<Character> hs = new HashSet<Character>();
        for(char c: arr){
            if (hs.contains(c)){
                res = false;
                break;
            }
            else {
                hs.add(c);
            }
        }
        return res;
    }

    static boolean isPermutation (String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] ar = new int[128];
        char[] arr = s1.toCharArray();
        for(char c: arr){
            ar[(int)c] = ar[(int)c]+1;
        }
        for(int j =0;j<s2.length();j++){
            int val = (int)s2.charAt(j);
            if(ar[val]-1 <0){
                return false;
            }
            else{
                ar[val]= ar[val]-1;
            }
        }
        return true;
    }

    public static String urlify(String s, int length){
        char[] c = s.toCharArray();
        int space = 0;
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)==' '){
                space++;
            }
        }
        int newLength = length + space*2;
        for(int i = length-1;i>=0;i--){
            if(s.charAt(i)==' '){
                c[newLength-1] = '0';
                c[newLength-2] = '2';
                c[newLength-3] = '%';
                newLength = newLength -3;
            }
            else{
                c[newLength-1] = s.charAt(i);
                newLength = newLength -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: c){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean palindromePermutation(String s){
        System.out.println(Character.getNumericValue('z'));
        System.out.println(Character.getNumericValue('Z'));
        s = s.toLowerCase();
        int oddCount =0;
        int[] arr = new int[128];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                arr[(int)s.charAt(i)] = arr[(int)s.charAt(i)] +1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
            if(oddCount>=2){
                return false;
            }
        }
        return true;
    }

    public static boolean oneAway(String s1, String s2){
        if(s1.length()==s2.length()){
            return  replace(s1, s2);
        }
        else if(s1.length()-1==s2.length()){
            return  delete(s1, s2);
        }
        else if(s1.length()+1==s2.length()){
            return insert(s1, s2);
        }
        else return false;
    }

    public static String stringCompress(String s){
        char ch=s.charAt(0);
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                ch = s.charAt(i);
                count++;
            } else {
                sb.append(ch).append(count);
                ch = s.charAt(i+1);
                count =1;
            }
        }
        sb.append(ch).append(count);
        if(sb.toString().length()<s.length())
            return sb.toString();
        else
            return s;
    }

    public static boolean rotateString(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s1);
        return sb.toString().contains(s2);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println("Enter String for isUnique");
//        String str = in.next();
//        System.out.println(isUnique(str));
//        System.out.println("Enter Strings for isPermutation");
//        String str1 = in.next();
//        String str2 = in.next();
//        System.out.println(isPermutation(str1,str2));
//        System.out.println("Enter String for urlify");
//        String str = in.nextLine();
//        String result = urlify(str, 13);
//        System.out.println(result);
//        System.out.println(palindromePermutation("yalam mala "));
//        System.out.println(oneAway("pale", "pale"));
        String result = stringCompress("aaaaaaaxxxxbcd");
        System.out.println(result);
//        System.out.println(rotateString("waterbottle","erbottlewat"));
    }

    public static boolean replace(String s1, String s2){
        int diff =0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                diff++;
            if(diff>1)
                return false;
        }
        return true;
    }

    public static boolean delete(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i;
        for( i=0;i<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }
            else{
                sb.append(s1.substring(0,i)).append(s1.substring(i+1));
                return sb.toString().equals(s2);

            }
        }
        sb.append(s1.substring(0,i)).append(s1.substring(i+1));
        return sb.toString().equals(s2);
    }

    public static boolean insert(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i;
        for( i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }
            else{
                sb.append(s1.substring(0,i)).append(s1.charAt(i)).append(s1.substring(i+1));
                return sb.toString().equals(s2);

            }
        }
        sb.append(s1.substring(0,i)).append(s1.charAt(i)).append(s1.substring(i+1));

        return sb.toString().equals(s2);
    }

}
