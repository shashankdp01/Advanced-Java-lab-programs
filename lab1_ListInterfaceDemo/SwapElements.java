/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package lab1;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Zero");
        l_list.add("One");
        l_list.add("Two");
        l_list.add("Three");
        l_list.add("Four");
        
        System.out.println("LinkedList before swapping: " + l_list);
        
        // Swap first (index 0) and third (index 2) elements
        Collections.swap(l_list, 0, 2);
        
        System.out.println("LinkedList after swapping first and third elements: " + l_list);
    }
}