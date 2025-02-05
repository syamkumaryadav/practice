package StringHandling.prgms;

public class ToCharArray {

	public static void main(String[] args) {
		
		String str = "Java";
		char[] chars = str.toCharArray();
		System.out.println(chars);
		
		System.out.println("=================================");

		
		for(var s: chars) {
			System.out.println(s);	// for each loop using VAR
		}
		System.out.println("=================================");
		
		
		for(char s: chars) {
			System.out.println(s);	// normal for each loop 
		}
	
		System.out.println("=================================");
		
		
		for(int s: chars) {
			System.out.println(s);	// converting char to int
		}
							/*  		74
										97
										118
										97			*/
		
		
		String s = "";
		if (str == null || str.isEmpty()) {
		    System.out.println("String is null or empty.");
		}

	}

}
