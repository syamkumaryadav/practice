package StringHandling.prgms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter ur string : ");
		String str = s.nextLine();
		verifyPal(str);
	}

	private static void verifyPal(String str) {
		String ss = "";
		for (int a = 0; a <= str.length() - 1; a++) {
			ss = str.charAt(a) + ss;
		}

		if (str.equals(ss)) {
			System.out.println(str + " given string is palindrome");
		} else {
			System.out.println(str + " given string is not palindrome");
		}
	}
}
