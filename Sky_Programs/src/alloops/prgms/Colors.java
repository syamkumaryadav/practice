package alloops.prgms;

import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int no = s.nextInt();
		if(no%4==0) {
			System.out.println("yellow color....");
		}else if(no%4==1) {
			System.out.println("Red color.....");
		}else if(no%4==2) {
			System.out.println("blue color.......");
		}else {
			System.out.println("green color.......");
		}

	}

}
