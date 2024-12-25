package alloops.prgms;

public class AutoWiring {
	static void mmm(int d ,int...oo) {
		System.out.println(d);
		for(int s:oo) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		int a=229;
		Integer b=a;	// Auto boxing
		System.out.println(b);
		
		Integer c=229;
		int k=c;	// UN Boxing
		
		System.out.println(k);
		
		mmm(12,12,12,33);
	}

}
