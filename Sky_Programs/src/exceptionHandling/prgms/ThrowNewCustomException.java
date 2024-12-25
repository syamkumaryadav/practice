package exceptionHandling.prgms;

public class ThrowNewCustomException {
	public void checkAge(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("age must be grater than 18 years.");	//--> Perametrized Constructor
			//throw new CustomException();	//--> default Constructor

		} else {
			System.out.println("ur age is valid: " + age);
		}
	}

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		ThrowNewCustomException t = new ThrowNewCustomException();
		
		t.checkAge(25); // for this throws custom Exception
		
		/*try {
			t.checkAge(5);
		} catch (CustomException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}*/
	}

}
