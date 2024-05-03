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
public class MapDemo {
    public static void demonstrate() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map:");
        System.out.println("Size: " + map.size());
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Contains key 'Four': " + map.containsKey("Four"));
        System.out.println("Removing key 'Three': " + map.remove("Three"));
    }
}
