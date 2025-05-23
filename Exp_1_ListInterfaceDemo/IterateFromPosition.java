/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package lab1;

import java.util.*;

public class IterateFromPosition {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> listobj = new LinkedList<>();
        listobj.add("First");
        listobj.add("Second");
        listobj.add("Third");
        listobj.add("Fourth");
        listobj.add("Fifth");
        
        System.out.println("Original LinkedList: " + listobj);
        System.out.println("\nIterating from 2nd position (index 1):");
        
        // Using iterator starting from position 1 (2nd element)
        Iterator<String> iteratorobj = listobj.listIterator(1);
        
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}