package preparation.GeeksForGeeks;

public class IsAnagram {

    public static boolean areAnagram(String s1, String s2){
        int[] arr = new int[26];
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            arr[(int)s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            arr[(int)s2.charAt(i)-97]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[1]!=0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        String str1 = "sushi";
        String str2 = "ihuss";
        if (areAnagram(str1.toLowerCase(), str2.toLowerCase()))
            System.out.println("The two strings are"+
                    " anagram of each other");
        else
            System.out.println("The two strings are not"+
                    " anagram of each other");
    }
}
