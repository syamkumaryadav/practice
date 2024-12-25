package c.CoreCollectionsInterfaces.prgm;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Dog");  // Duplicate allowed

        System.out.println("List contents:");
        for (String animal : animals) {
            System.out.println(animal);  // Maintains insertion order, duplicates allowed
        }
    }
}

