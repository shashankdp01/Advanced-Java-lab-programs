/*4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package lab1;

import java.util.*;

public class DisplayWithPositions {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Monday");
        l_listobj.add("Tuesday");
        l_listobj.add("Wednesday");
        l_listobj.add("Thursday");
        l_listobj.add("Friday");
        
        System.out.println("Elements and their positions:");
        
        // Display each element with its position using get(p)
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + ": " + l_listobj.get(p));
        }
    }
}