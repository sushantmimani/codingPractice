package preparation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class KeyboardRow {

    static String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    static public String[] findWords(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            String word = words[i].toLowerCase();
            int row = getRow(word.charAt(0));
            for (int j = 0; j < word.length(); j++) {
                if (rows[row].indexOf(word.charAt(j)) == -1) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                al.add(word);
        }
        System.out.println(al);

        return al.toArray(new String[0]);
    }

    static public int getRow(char c) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].indexOf(c) != -1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] res = findWords(words);
        for(String s: res)
            System.out.println(s);
    }
}



