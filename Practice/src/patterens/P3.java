package patterens;

public class P3 {

	public static void main(String[] args) {
		int n = 5; // Determines the size of the pattern

		// Upper half of the pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int a = n - 1; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				if ((a + b) % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}

}
