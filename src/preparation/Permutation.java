package preparation;
import java.util.*;

class Permutation {
    public static void main(String[] args) {
        final ArrayList<ArrayList<String>> strings = new ArrayList<ArrayList<String>>();

        final ArrayList<String> str1 = new ArrayList<String>();
        str1.add("quick");
        str1.add("lazy");
        str1.add("fat");

        final ArrayList<String> str2 = new ArrayList<String>();
        str2.add("brown");
        str2.add("black");
        str2.add("grey");

        final ArrayList<String> str3 = new ArrayList<String>();

        str3.add("dog");
        str3.add("fox");

        strings.add(str1);
        strings.add(str2);
        strings.add(str3);

        final int[] indices = new int[strings.size()];
        while (indices[0] < strings.get(0).size()) {

            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < indices.length; ++i) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(strings.get(i).get(indices[i]));
            }
            System.out.println(sb.toString());
            for (int i = indices.length - 1; i >= 0; --i) {
                if (++indices[i] < strings.get(i).size()) {
                    break;
                }
                if (i != 0) {
                    indices[i] = 0;
                }
                System.out.println(Arrays.toString(indices));

            }
        }
    }
}