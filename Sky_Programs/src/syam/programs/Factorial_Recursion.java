package syam.programs;

public class Factorial_Recursion {

	public static void main(String[] args) {
		int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

						/*For factorial(5):
						
						The function is called with n = 5.
						5 * factorial(4) is calculated.
						
						factorial(4) is called:
						4 * factorial(3) is calculated.
						
						factorial(3) is called:
						3 * factorial(2) is calculated.
						
						factorial(2) is called:
						2 * factorial(1) is calculated.
						
						factorial(1) is called:
						The base case is reached, and 1 is returned.
						
						The recursion unwinds:
						2 * 1 = 2
						3 * 2 = 6
						4 * 6 = 24
						5 * 24 = 120
						The result of factorial(5) is 120.*/