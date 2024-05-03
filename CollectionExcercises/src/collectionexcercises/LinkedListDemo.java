/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionexcercises;
import java.util.*;
/**
 *
 * @author Vinit Rao
 */
public class LinkedListDemo {
    public static void demonstrate() {
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.718);
        linkedList.add(1.618);

        System.out.println("LinkedList:");
        System.out.println("Size: " + linkedList.size());
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Removing first element: " + linkedList.removeFirst());
        System.out.println();
    }
}
