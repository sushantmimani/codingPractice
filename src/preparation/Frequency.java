package preparation;
import java.util.*;

public class Frequency {

    static String isValid(String s){
        // Complete this function
        HashSet hs = new HashSet();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)-97]++;
        }

        System.out.println(Arrays.toString(arr));
        int freq = 0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0) {
                freq = arr[i];
                break;
            }
        }

        int count =0;
        int freq2=0;
        for(int i=0;i<26;i++){
            if (arr[i]!=0 && arr[i]!=freq){
                count++;
                freq2 = arr[i];
            }
        }

        System.out.println(freq2);
        if(count==0)
            return "YES";

        if(count==1){
            if(freq2-freq==1 || freq2==1)
                return "YES";
        }

        return "NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}

