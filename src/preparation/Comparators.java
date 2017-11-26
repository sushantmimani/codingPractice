package preparation;

import java.util.*;

public class Comparators {

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // You can use a lambda function like this

        // Collections.sort(list, (o1, o2) -> (o1.getValue()).compareTo(o2.getValue()));


        // Sort list with Collections.sort(), provide a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("third",3);
        hs.put("fourth",4);
        hs.put("second",2);
        hs.put("first",1);

        for (Map.Entry<String, Integer> m: hs.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Map<String, Integer> map = sortByValue(hs);

        for (Map.Entry<String, Integer> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
