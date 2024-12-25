package TypesOfMethods.prgms;

public class ExecutionPriority {

		 { 
		  System.out.println("Block1"); 
		 } 
		 ExecutionPriority() 
		 { 
		  System.out.println("Constructor.."); 
		 } 
		 public static void main(String args[]) 
		          { 
		  new ExecutionPriority(); 
		  System.out.println("Main Method"); 
		 } 
		 { 
		  System.out.println("Block2"); 
		 }
															/*Block1
															Block2
															Constructor..
															Main Method*/
}
