package StringHandling.prgms;

import java.util.Arrays;

public class Anagram_inBuild {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silentg";
		
		if(areAnagram(s1,s2)) {
			System.out.println("those 2 strings are anagrams.");
		}else {
			System.out.println("those 2 strings are not anagrams.");
		}

	}

	private static boolean areAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
		
	}

}
