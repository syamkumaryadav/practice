package com.ContinueStmt.prgms;

public class ForLoop {

	public static void main(String[] args) {
		
		/*for (int i = 0; i < 10; i++) {
		    if (i > 5)
		    {
		    	//break;     //0 1 2 3 4 5
		    	//continue;   //0 1 2 3 4 5
		    }
		    System.out.println(i);
		}*/
		
		
		for (int i = 0; i < 10; i++) {
		    if (i < 5)
		    {
		    	//break;   //no output
		    	//continue;   //5 6 7 8 9
		    }
		    System.out.println(i);
		}
	}

}
