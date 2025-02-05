package c.CoreCollectionsInterfaces.prgm;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 6, 7, 1);

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Iterate through the list
        for (Integer number : numbers) {
            // If the number is already in uniqueElements, it's a duplicate
            if (!uniqueElements.add(number)) {
                duplicates.add(number);
            }
        }

        // Output the duplicates
        System.out.println("Duplicates: " + duplicates);
    }
}
