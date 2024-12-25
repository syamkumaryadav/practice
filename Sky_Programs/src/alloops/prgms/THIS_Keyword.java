package alloops.prgms;

/*			"this" keyword: 
			It is called as an object reference or reference variable because it refers an object. 
			It always refers current object. 
			It is implicitly present in instance method, initialization block & constructor. 
			It is explicitly required to access an instance variable whenever both instance 
			variable & local variable names are same. 
			Static method (class method) does not refer this keyword in anyway                      */



public class THIS_Keyword {

	/*int x = 10;
	
	void display() {
		int x = 20;
		System.out.println(x);		// 20
		System.out.println(this.x);		// 10
	}
	
	public static void main(String args[]) {
		THIS_Keyword d = new THIS_Keyword();
		d.display();
	
	}*/

	
	
	/*void show() {
		System.out.println("show() method");
	}
	
	void display() {
		System.out.println("display() method");
		show(); 		//implicitly this.show();
	}
	
	public static void main(String args[])
		{
			
			THIS_Keyword d=new THIS_Keyword(); 
			d.display();
		}*/
	
	
	
	int x=10; 
	 void display() 
	 { 
	  System.out.println(x); //here implicitly this.x 
	 } 
	 public static void main(String args[]) 
	          { 
		 THIS_Keyword d1=new THIS_Keyword(); 
		 THIS_Keyword d2=new THIS_Keyword(); 
	  d1.x=d1.x+2; 			
	  d1.display(); 			//12
	  d2.display(); 			//10
	 }

}
