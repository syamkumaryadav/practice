package StringHandling.prgms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s1=new String("hello"); 
		  String s2=new String("hello"); 
		  String s3=s1;
		  	 System.out.println(s1.equals(s2));  // true
			 System.out.println(s1==s2);  //false
			 System.out.println(s1==s3);  //true
			 System.out.println(s1.equals(s3));   //true
			 
			 
			 String s11="Hello";
				String s22="Hello";
				String s33= new String("Hello");
				System.out.println(s11==s22);		//true
				System.out.println(s11==s33);		//false
				System.out.println(s11.equals(s33));		//true
				
				
				  String s4=s1.intern();
					 System.out.println("iiiiiiiiiiiiii"+s1==s4);//false
	}

}
