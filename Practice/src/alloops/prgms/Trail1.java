package alloops.prgms;


class AAA{
	static int a=10;
	static {
		System.out.println("A class static block......");
	}
}

class B extends AAA{
	static int b =20;
	static void m() {
		System.out.println("B class static block......");
	}
}
public class Trail1 {
	public static void main(String[] args) {
		System.out.println(B.a);  // A class static block......      10   here not getting b class static method because no main method there
		
		
	}

}
