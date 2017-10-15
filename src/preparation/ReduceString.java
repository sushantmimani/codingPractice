package preparation;


import java.util.Scanner;

/*
Given a string, replace all even number of occurrences with blank and odd occurrences with a single occurence
of the character

Example:

    Input: aabbbccccd
    Output: bd
 */
public class ReduceString {

    public static void reduceString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i;
        for(i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) {
                count++;
            }
            else {
                if(count%2==0){
                    count =1;
                    continue;
                }
                else {
                    sb.append(s.charAt(i-1));
                    count=1;
                }
            }
        }
        if(count%2!=0)
            sb.append(s.charAt(i-1));
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            reduceString(s);
        }
    }
}
