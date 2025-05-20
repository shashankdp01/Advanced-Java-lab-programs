/*2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())*/

package lab1;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> objlist = new LinkedList<>();
        objlist.add("Apple");
        objlist.add("Banana");
        objlist.add("Cherry");
        objlist.add("Mango");
        objlist.add("Blueberry");
        
        System.out.println("Original LinkedList: " + objlist);
        System.out.println("\nIterating in reverse order:");
        
        // Using descendingIterator for reverse iteration
        Iterator<String> reverseIterator = objlist.descendingIterator();
        
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

