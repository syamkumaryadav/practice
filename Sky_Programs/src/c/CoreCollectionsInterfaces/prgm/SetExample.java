package c.CoreCollectionsInterfaces.prgm;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate element

        System.out.println("Set contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);  // Duplicates will be ignored
        }
    }
}

