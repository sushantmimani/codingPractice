package preparation.GeeksForGeeks;

import java.util.Scanner;

/*
Given a string, the task is to find maximum consecutive repeating character in string.

Note : We do not need to consider overall count, but the count of repeating that appear at one place.

Examples:

Input : str = "geeekk"
Output : e

Input : str = "aaaabbcbbb"
Output : a

 */

public class maxRepeatingCharacter {

    public static void geMaxRepeatingCharacter(String s){
        int count =1;
        int max =1;
        char maxChar = ' ';
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count>max){
                    max = count;
                    maxChar = s.charAt(i);
                    ;
                }
            }
            else{
                count =1;
            }
        }
        System.out.println("Maximum occurring character is:"+maxChar+"\nOccurs "+max+" times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            geMaxRepeatingCharacter(s);
        }
    }
}
