package preparation;

import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter N: ");
        int num = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter elements");
        String n[] = new String[num];
        for (int i = 0; i < num; i++) {
            n[i] = reader.next();
        }

        System.out.println("Enter Q: ");
        int q = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter elements");
        String qu[] = new String[q];
        for (int i = 0; i < q; i++) {
            qu[i] = reader.next();
        }

        for(int i =0; i<qu.length;i++) {
            int count = 0;
            for (int j = 0; j < n.length; j++) {
                if(n[j].equals(qu[i])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
