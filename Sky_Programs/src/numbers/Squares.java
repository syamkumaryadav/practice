package numbers;

import java.util.Scanner;

public class Squares {

	
	public static void main(String[] args) {
		/*for(int a=1;a<=10;a++) {
			System.out.println(a+" square --> "+a*a);
		}*/
		
			Scanner s=new Scanner(System.in);
			System.out.print("enter ur string : ");
			String str=s.nextLine();
			verifyPal(str);			
	}

	private static void verifyPal(String str) {
		String ss="";
		for(int a=0;a<=str.length()-1;a++) {
			ss=str.charAt(a)+ss;
		}
		
		if(str.equals(ss)) {
			System.out.println(str+" given string is palindrome");
		}else {
			System.out.println(str+" given string is not palindrome");
		}
	}

}
