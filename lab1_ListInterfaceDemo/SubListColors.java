/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Full List: " + colors);

        // Extract 1st and 2nd elements (index 0 and 1)
        List<String> subColors = colors.subList(0, 2);

        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}
