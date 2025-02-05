package StringHandling.prgms;

import java.util.HashMap;

public class Character_Count {

	public static void main(String[] syam) {
		String str="balayyaaaa";
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(char c: str.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
			/*	countMap.getOrDefault(c, 0):
				Retrieves the value (count) associated with the key c in the map.
				If the key c does not exist, it returns the default value 0.*/
		}
		System.out.println(hashMap);
	}

}
