package preparation;

import java.util.regex.*;

public class RegexMatches {

    static String dept = "";
    static String year = "";
    static String course = "";
    static String sem = "";

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        String pattern1 ="^cs+\\d\\d\\d\\s+\\w\\s\\d\\d\\d\\d$";
        String pattern2 ="^cs+\\s\\d\\d\\d\\s+\\w\\s\\d\\d\\d\\d$";
        String pattern3 ="^cs:\\d{3}\\s+\\w+\\d{4}$";
        String pattern4 = "^c-\\d\\d\\d\\d\\d\\d\\d+\\s+\\w";
        String line = "CS111 2016 Fall";

        String baapPattern = "("+pattern1+")?"+"("+pattern2+")?"+"("+pattern3+")?"+"("+pattern4+")?";
        Pattern r = Pattern.compile(baapPattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            String[] rem = line.substring(2).trim().split(" ");
            if (m.group(1)!=null || m.group(2)!=null){
                System.out.println("g1 or 2");
                dept = "CS";
                course = rem[0];
                sem = rem[1].substring(0,1).toUpperCase()+rem[1].substring(1);
                year = rem[2];
            }
            else if(m.group(3)!=null){
                System.out.println("group3");
                dept="CS";
                course = rem[0].substring(1);
                year = rem[1].substring(1);
                sem = rem[1].substring(0,1);
            }
            else {
                System.out.println("g4");
                dept = "CS";
                course = rem[0].substring(0,3);
                year = rem[0].substring(3);
                sem = rem[1].substring(0,1).toUpperCase()+rem[1].substring(1);

            }
        }

        System.out.println("Dept:"+dept+"\nYear:"+year+"\nCourse:"+course+"\nSemester:"+sem);

    }
}