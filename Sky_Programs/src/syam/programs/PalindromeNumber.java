package syam.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.print("Enter ur Number : ");
		int no=s.nextInt();
		int rev=0,reminder,noo=no;
		while(no>0)
		{
			reminder=no%10;
			rev=reminder+(rev*10);
			no/=10;
		}
		if(noo==rev)System.out.println(noo+" is Palindrome Number..");
		else System.out.println(noo+" is not Palindrome Number..");*/
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter ur number : ");
		int number=s.nextInt();
		int no=number,reminder,result=0;
		while(no>0) {
			reminder=no%10;
			result=reminder+(result*10);
			no/=10;
		}
		if(number==result)System.out.println(number+" is Palindrome Number..");
		else System.out.println(number+" is not Palindrome Number..");
	}

}
