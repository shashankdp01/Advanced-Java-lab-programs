/*5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Original List: " + colors);
        System.out.print("Enter the index of element to remove: ");
        int n = scanner.nextInt();

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("List after removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}

