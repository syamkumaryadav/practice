package Java8.Features;

public class VarArgs {
	static void syam(int... a) {
		System.out.println("length of a : "+a.length);
		
		for(int b:a) {
			System.out.println(b);
		}
	}
	

	public static void main(String... args) {
		syam(1);
		syam(1,2,4,3,5,7,9);
		syam(11,4,8);
		syam();
		
	}

}
