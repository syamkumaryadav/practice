package com.syam.programs;

import java.util.Scanner;

public class SquareNumbersBetween {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur first no : ");
		int No1 = s.nextInt();
		System.out.print("Enter ur second no : ");
		int No2 = s.nextInt();
		int smallNo=0,bigNo=0,a=1,sqr;
		if(No1<No2)
		{
			smallNo=No1;
			bigNo=No2;
		}
		else
		{
			smallNo=No2;
			bigNo=No1;
		}
		System.out.println("Squares between "+smallNo+" to "+bigNo+" : ");
		
		while(true)
		{
			sqr=a*a;
			if(sqr>bigNo) {
				break;
			}
			if(sqr>=smallNo) {
				System.out.println(sqr);
			}
			a++;
		}
		s.close();
	}

}


/*public class SquareNumbersBetween {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers (lower and upper bounds)
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Ensure firstNumber is the smaller number and secondNumber is the larger number
        int lowerBound = Math.min(firstNumber, secondNumber);
        int upperBound = Math.max(firstNumber, secondNumber);

        System.out.println("Square numbers between " + lowerBound + " and " + upperBound + ":");

        // Find square numbers by manually calculating squares
        int i = 1;
        while (true) {
            int square = i * i;
            // Break the loop if the square exceeds the upperBound
            if (square > upperBound) {
                break;
            }
            // Print the square if it is within the range
            if (square >= lowerBound) {
                System.out.println(square);
            }
            i++; // Increment i for the next square
        }

        scanner.close();
    }
}
*/