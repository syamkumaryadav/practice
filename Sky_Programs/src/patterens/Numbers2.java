package patterens;

public class Numbers2 {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			
			for(int b=1;b<=5;b++) {
				if(b<=a) {
					System.out.print(a+" ");
					}else {
						System.out.print(b+" ");
					}
				}
			System.out.println();
			}
	}

}
