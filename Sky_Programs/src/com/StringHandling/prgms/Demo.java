package com.StringHandling.prgms;

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
	}

}
