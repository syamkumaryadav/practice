package StringHandling.prgms;

import java.util.HashMap;

public class Word_Count {

	public static void main(String[] syam) {

		String paragraph = "This is a test. This test is only a test.";

		String cleanedParagraph = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "");
		
		String words[]=cleanedParagraph.split("\\s+");
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String c : words) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
			/*	countMap.getOrDefault(c, 0):
				Retrieves the value (count) associated with the key c in the map.
				If the key c does not exist, it returns the default value 0.*/
		}
		System.out.println(hashMap);
		
		
		 // Print word counts
        System.out.println("Word Counts:");
        for (String word : hashMap.keySet()) {
            System.out.println(word + ": " + hashMap.get(word));
        }
	}

}
