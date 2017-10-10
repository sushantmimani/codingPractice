package preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Find out if a String contains a very simple pattern.
 */
public class PatternMatch
{
    public static void main(String[] args)
    {
        List<List<String>> codeList = new ArrayList<List<String>>();
        List list1 = new ArrayList();
        List l1 = new ArrayList();
        l1.add("orange");
        codeList.add(l1);
        list1.add("apple");
        list1.add("apple");
        codeList.add(list1);
        List list2 = new ArrayList();
        list2.add("banana");
        list2.add("orange");
        list2.add("apple");
        codeList.add(list2);
        List ll = new ArrayList();
        ll.add("banana");
        codeList.add(ll);
        System.out.println(codeList.toString());
        int outerIndex =0;
        StringBuilder sb = new StringBuilder();
        for(List innerList: codeList){
            outerIndex++;
            int index = 0;
            for( Object str: innerList){
                index++;
                if (str.toString().equals("anything"))
                    sb.append(".*.");
                else
                {
                    sb.append(str);
                    if(index != innerList.size()){
                        sb.append(" ");
                    }
                }
            }
            if(outerIndex!=codeList.size())
                sb.append(".*.");
        }
        String pattt =sb.toString().substring(0,sb.toString().length());
        System.out.println(pattt);


//        String stringToSearch = "apple apple  banana banana";
//        System.out.println(Pattern.compile("apple apple.*.banana.*.banana").matcher(stringToSearch).find());

        String stringToSearch = "orange apple apple banana orange apple banana";
        System.out.println(Pattern.compile(pattt).matcher(stringToSearch).find());
//        System.out.println(stringToSearch.matches("(?s).*\\apple\\b.*"));

    }
}

