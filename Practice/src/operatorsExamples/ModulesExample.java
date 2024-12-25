package operatorsExamples;

import java.util.Scanner;

public class ModulesExample {

	public static void main(String[] syam) {
		Scanner s=new Scanner(System.in);
		System.out.print(" enter number:");
		int a=s.nextInt();
		
		int b=10,result;
		result=a%b;
			System.out.print("here we get quotient value : "+result);
			
		s.close();
	}

}
