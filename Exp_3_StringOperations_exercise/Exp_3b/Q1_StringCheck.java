/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/


package stringpackage;

public class Q1_StringCheck {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String test = "    ";
        System.out.println("Given String:"+"'"+test+"'");
        if (isNullOrEmpty(test)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and has non-whitespace characters.");
        }
    }
}
