package syam.programs;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] syam) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int lastNo=s.nextInt();
		int total=0;
		for(int a=1;a<=lastNo;a++)
		{
			total+=a;
		}
		System.out.println(total);
		s.close();
	}
	

}
