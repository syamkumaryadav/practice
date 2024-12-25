package exceptionHandling.prgms;

public class ThrowNewInBuildException {
	static public void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("ur age is less.");
		} else {
			System.out.println("Age is valid: " + age);
		}
	}

	public static void main(String[] args) {

		//ThrowNewInBuildException t=new ThrowNewInBuildException();	//----> doesn't requiried because static method

		try {
			checkAge(17);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught exception here see difference : " + e);
			System.out.println("Caught exception: " + e.getMessage());
		}

		//checkAge(27);	// here doesn't throws exception on method decleration 

	}

}
