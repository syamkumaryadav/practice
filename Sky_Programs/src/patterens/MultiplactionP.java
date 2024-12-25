package patterens;

public class MultiplactionP {

	public static void main(String[] args) {
		int s=1;
		for(int a=1;a<=5;a++) {
	
			for(int b=1;b<=a;b++) {
				System.out.print(s*b+" ");
			}
			s++;
			System.out.println();
		}
	}

}
