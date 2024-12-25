package exceptionHandling.prgms;

public class CustomException extends Exception {

	public CustomException(String string) {
		
		super(string);	//---> this is derectlt throwing exception from default....
	}

	public CustomException() {
		
	}
}
