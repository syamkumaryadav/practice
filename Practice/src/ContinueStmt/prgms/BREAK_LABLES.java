package ContinueStmt.prgms;

public class BREAK_LABLES {

	public static void main(String[] args) {
		/*FIRST: for (int i = 1; i <= 3; i++) {
			SECOND: for (int j = 1; j <= 10; j++) {
				if (j == 5)
					break FIRST;
				System.out.println(j);		// 1 2 3 4
			}
		}*/
		
		FIRST: for (int i = 1; i <= 3; i++) {
			SECOND: for (int j = 1; j <= 10; j++) {
				if (j == 5)
					break SECOND;
				System.out.print(j);		// 1 2 3 4
			}
			System.out.println();  	// 1 2 3 4
									// 1 2 3 4
									// 1 2 3 4
		}

	}

}
