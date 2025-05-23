/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

package string_package;

public class Q7_TruncateString {
    public static String truncate(String input, int maxLength) {
        if (input.length() <= maxLength) {
            return input;
        }
        return input.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a long string that needs truncating.";
        int maxLength = 20;
        String output = truncate(input, maxLength);
        System.out.println("Original: " + input);
        System.out.println("Truncated: " + output);
    }
}