package syam.programs;

import java.util.Scanner;

public class GivenRangePrimeNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");//371
		int no=s.nextInt();
		for(int i=1;i<no;i++) {
			 boolean flag=true;
			for(int a=2;a<=i/2;a++)
			{
				if(i%a==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag) System.out.print(i+ " ");
		}
		s.close();
	}
}
