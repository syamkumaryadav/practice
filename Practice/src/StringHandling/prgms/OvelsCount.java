package StringHandling.prgms;

import java.util.Scanner;

public class OvelsCount {

	public static void main(String[] args) {
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter ur String : ");  		//syam  kumar  spaces not considered her 
			String str=s.nextLine();
			str=str.toLowerCase();
			int ovelsCount=0,consonantCount=0;
			for(int a=0;a<str.length();a++)
			{
				if(str.charAt(a)=='a'||str.charAt(a)=='e'||str.charAt(a)=='i'||str.charAt(a)=='o'||str.charAt(a)=='u') {
					ovelsCount++;
				}
				else if(str.charAt(a)>='a'&&str.charAt(a)<='z')
				{
					consonantCount++;
				}
			}
		System.out.println(" OvelsCount : "+ovelsCount);
		System.out.println("ConsonantCount : "+consonantCount);

	}
	catch (Exception e) {
		e.printStackTrace();
	}	
	
	
	}
	

}
