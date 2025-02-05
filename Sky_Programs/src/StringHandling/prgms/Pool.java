package StringHandling.prgms;

public class Pool {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3=new String("Hello");
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // true (if from String Pool)
		System.out.println(s1 == s3);		//false
		System.out.println(s1.compareTo(s2)); // 0

		
		
	}

}
