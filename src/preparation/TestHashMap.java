package preparation;

import java.util.*;

public class TestHashMap {

    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        Map result = new LinkedHashMap();
        hm.put(1,8);
        hm.put(2,9);
        hm.put(3,7);
        result = sortByValue(hm);
        Iterator<Integer> it = result.keySet().iterator();
        while (it.hasNext())
        {
            int key = it.next();
            int value = (int)result.get(key);
            System.out.println(key+" "+value);
        }

    }
}
