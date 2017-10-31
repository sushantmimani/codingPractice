package preparation;

public class ComplexMultiplication {

        public static String complexNumberMultiply(String str1, String str2) {
            String[] arrA = str1.split("\\+");
            String[] arrB = str2.split("\\+");
            int a = Integer.parseInt(arrA[0]);
            int c = Integer.parseInt(arrB[0]);
            int b = Integer.parseInt(arrA[1].split("i")[0]);
            int d = Integer.parseInt(arrB[1].split("i")[0]);
            System.out.println(a+" "+b+" "+c+" "+d);
            int val = (a*c)-(b*d);
            int comp = (a*d)+(b*c);
            String res = String.valueOf(val)+"+"+String.valueOf(comp)+"i";
            return res;

        }

    public static void main(String[] args) {
        String a = "1+-1i";
        String b = "1+-1i";
        System.out.println(complexNumberMultiply(a,b));

    }
}
