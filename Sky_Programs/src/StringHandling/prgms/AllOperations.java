package StringHandling.prgms;

public class AllOperations {

	public static void main(String[] args) {

		System.out.println("===========   Length()   =============");
		
		String str = "Java,Python,C++";		// 15
		System.out.println(str.length()); // Output: 4
		
		String s="java";
		System.out.println(s.length());
		
		
		
		System.out.println("===========   split()   =============");
		
		
		
		String st = "Java,Python,C++";
		String[] languages = st.split(",");		// according to give it decides
		for (String lang : languages) {
		    System.out.println(lang);
		}
		
		System.out.println("===========   convert to int    =============");
		
		
		
		String string = "123";
		int number = Integer.parseInt(string); // Converts to int
		System.out.println(number); // Output: 123
		
		
		System.out.println("===========   replace()   =============");
		
		String s1 = "Java is fun";
		System.out.println(s1.replace("fun", "powerful")); // Output: Java is powerful

		
		
	}

}
