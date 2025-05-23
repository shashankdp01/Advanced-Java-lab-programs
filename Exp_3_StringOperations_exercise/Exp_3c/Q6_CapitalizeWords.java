/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package string_package;

public class Q6_CapitalizeWords {
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                          .append(word.substring(1).toLowerCase())
                          .append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "java is FUN and educational";
        String output = capitalizeWords(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + output);
    }
}
