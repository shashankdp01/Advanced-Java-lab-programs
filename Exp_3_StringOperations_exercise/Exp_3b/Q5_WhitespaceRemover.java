/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/

package stringpackage;

public class Q5_WhitespaceRemover {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Hello   World  ";
        System.out.println("With Whitespace: '" + input + "'");
        System.out.println("Without Whitespace: '" + removeWhitespace(input) + "'");
    }
}
