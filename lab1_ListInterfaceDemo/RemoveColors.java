/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList */
package lab1;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original List: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);  // index starts from 0
        }

        // Remove the color "Blue"
        colors.remove("Blue");

        System.out.println("Modified List: " + colors);
    }
}
