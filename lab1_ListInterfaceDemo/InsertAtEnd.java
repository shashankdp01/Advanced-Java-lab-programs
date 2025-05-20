/*3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package lab1;
import java.util.*;

public class InsertAtEnd{
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");
        l_listobj.add("Yellow");
        
        System.out.println("LinkedList before insertion: " + l_listobj);
        
        // Insert "Pink" at the end using offerLast
        l_listobj.offerLast("Pink");
        
        System.out.println("LinkedList after inserting Pink at end: " + l_listobj);
    }
}