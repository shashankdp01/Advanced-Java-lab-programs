/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package lab1;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before Sorting: " + colors);

        Collections.sort(colors);

        System.out.println("After Sorting: " + colors);
    }
}
