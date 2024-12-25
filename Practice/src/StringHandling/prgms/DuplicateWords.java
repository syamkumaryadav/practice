package StringHandling.prgms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "This is a test string with test words and repeated words in this string";
        
        findDuplicateWords(input);
    }

    public static void findDuplicateWords(String input) {
        // Convert the string to lowercase and split it into words
        String[] words = input.toLowerCase().split("\\s+");
        
        // Create a map to store word counts
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Count the occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Print the duplicate words
        System.out.println("Duplicate words in the given string:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
