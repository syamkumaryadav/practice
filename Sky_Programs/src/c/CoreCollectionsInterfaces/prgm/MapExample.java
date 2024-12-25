package c.CoreCollectionsInterfaces.prgm;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        System.out.println("Map contents:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Check if a key exists
        if (ageMap.containsKey("syam")) {
            System.out.println("Alice's age: " + ageMap.get("Alice"));
        }
        else {
        	System.out.println("not there...");
        }
    }
}

