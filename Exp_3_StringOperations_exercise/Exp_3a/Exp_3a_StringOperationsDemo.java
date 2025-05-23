/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/


package string_package;

import java.util.Arrays;

public class Exp_3a_StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println();
        // 2. Length and Character Access
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Character at index 1 in String 1: " + str1.charAt(1));
        System.out.println();
        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println();
        // 4. String Searching
        String sentence = "Java programming is fun";
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'fun'? " + sentence.contains("fun"));
        System.out.println();
        // 5. Substring Operations
        System.out.println("Substring from index 5 to 16: " + sentence.substring(5, 16));
        System.out.println();
        // 6. String Modification
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("Replace 'fun' with 'awesome': " + sentence.replace("fun", "awesome"));
        System.out.println();
        // 7. Whitespace Handling
        String messy = "   Trim me!   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");
        System.out.println();
        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);
        System.out.println();
        // 9. String Splitting
        String csv = "Java,Python,C++,JavaScript";
        String[] langs = csv.split(",");
        System.out.println("Languages: " + Arrays.toString(langs));
        System.out.println();
        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> Middle");
        sb.insert(6, "Inserted ");
        sb.replace(0, 5, "Begin");
        sb.delete(6, 15);
        System.out.println("StringBuilder result: " + sb);
        System.out.println();
        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s | Age: %d", name, age));
        System.out.println();
        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "example@domain.com";
        boolean valid = email.contains("@") && email.endsWith(".com") && !email.startsWith("@");
        System.out.println("Email: " + email);
        System.out.println("Is valid? " + valid);
    }
}
