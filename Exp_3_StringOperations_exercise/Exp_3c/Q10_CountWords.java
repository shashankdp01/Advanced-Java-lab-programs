/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package string_package;

public class Q10_CountWords {
	   public static int countWords(String input) {
	        if (input == null || input.trim().isEmpty()) {
	            return 0;
	        }
	        String[] words = input.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "This is a sample sentence with seven words.";
	        int wordCount = countWords(input);
	        System.out.println("Input: " + input);
	        System.out.println("Word Count: " + wordCount);
	    }
}
