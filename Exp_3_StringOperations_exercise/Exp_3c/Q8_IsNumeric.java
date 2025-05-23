/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/

package string_package;

public class Q8_IsNumeric {
	 public static boolean isNumeric(String input) {
	        return input != null && input.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        String input1 = "123456";
	        String input2 = "12a34";

	        System.out.println("Is '" + input1 + "' numeric? " + isNumeric(input1));
	        System.out.println("Is '" + input2 + "' numeric? " + isNumeric(input2));
	    }
}
