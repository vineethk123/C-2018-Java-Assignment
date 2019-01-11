package incremental_assignments.assignment5;

import java.util.regex.Pattern;

public class Assignment5 {

    public static void main(String args[]) {
        String pattern = "^[A-Z].*\\.$";
        String text1 = "java.", text2 = "Class.", text3 = "Java Class.";
        System.out.println("'" + text1 + "'" + " matches pattern: " + Pattern.matches(pattern, text1));
        System.out.println("'" + text2 + "'" + " matches pattern: " + Pattern.matches(pattern, text2));
        System.out.println("'" + text3 + "'" + " matches pattern: " + Pattern.matches(pattern, text3));
    }
}
