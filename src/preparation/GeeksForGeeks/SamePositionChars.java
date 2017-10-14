package preparation.GeeksForGeeks;

public class SamePositionChars {

    public static int samePosition(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i==Character.getNumericValue(s.charAt(i))-10) {
                System.out.println(s.charAt(i));
                count++;
            }
        }
    return count;
    }

    public static void main(String args[])
    {
        String str = "ABcED";
        System.out.println(samePosition(str));
    }
}
