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
public class ArrayListDemo {
    public static void demonstrate() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList:");
        System.out.println("Size: " + arrayList.size());
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Index of 'Orange': " + arrayList.indexOf("Orange"));
        System.out.println();
    }
}
