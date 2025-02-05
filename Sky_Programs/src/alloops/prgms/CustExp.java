package alloops.prgms;

class MyCustomException extends Exception{

	
	public MyCustomException(String msg) {
		super(msg);
	}
	public MyCustomException() {
		
	}
	
}


public class CustExp {
	
	static void m1(int n) throws MyCustomException{
		
			if(n<10) {
				throw new  MyCustomException("this is my custom exception");
			}else {
				System.out.println("no chance to exception occur");
			}
		
	}

	public static void main(String[] args) throws MyCustomException {
		
		m1(5);
	}

}
