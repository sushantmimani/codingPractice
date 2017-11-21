package preparation;

import java.util.Arrays;

public class NonRepeating {

    static String mergeStrings(String a, String b) {
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<a.length()&&j<b.length()){
            sb.append(a.charAt(i));
            i++;
            sb.append(b.charAt(j));
            j++;
        }
        if(i==a.length()){
            sb.append(b.substring(j, b.length()));
        }
        else{
            sb.append(a.substring(i, a.length()));
        }
        return sb.toString();
    }


        void increment(int[] i){
            i[i.length-1]++;

        }

    /* Driver program to test above functions */
    public static void main (String[] args)
    {
//        int arr[] = {8,5,11,4,6};
//
//        System.out.println(segregateEvenOdd(arr));
//
//        System.out.print("Array after segregation ");
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i]+" ");

//        double b = 10.0/-0;
//        if(b== Double.POSITIVE_INFINITY)
//            System.out.println("a");
//        else
//            System.out.println("b");
//        int[] a={1};
//        NonRepeating n = new NonRepeating();
//        n.increment(a);
//        System.out.println(a[a.length-1]);

        System.out.println(mergeStrings("ab", "zsd"));
    }
    }

