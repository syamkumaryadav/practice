package patterens;

import java.util.Scanner;

public class Numbers3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int no = s.nextInt();
		System.out.print("Enter ur size : ");
		int size = s.nextInt();
		
		int term=0,total=0;
		for(int a=1;a<=size;a++) {
			term=term*10+no;
			total+=term;
			System.out.print(term);
			if(a<size) {
				System.out.print(" + ");
			}
			
			
		}
		System.out.println("= "+total);

	}

}
