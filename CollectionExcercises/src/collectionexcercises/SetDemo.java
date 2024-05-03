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
public class SetDemo {
    public static void demonstrate() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);

        System.out.println("Set:");
        System.out.println("Size: " + set.size());
        System.out.println("Contains 10: " + set.contains(10));
        System.out.println("Adding 20: " + set.add(20));
        System.out.println("Removing 5: " + set.remove(5));
        System.out.println();
    }
}
