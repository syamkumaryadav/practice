package com.StringHandling.prgms;

public class StringBufferExemple {					//StringBuffer is mutable.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1=new StringBuffer("syam");
		StringBuffer s2=new StringBuffer("kumar");
		StringBuffer s3=s1.append(s2);
		boolean b=s1==s3;
		System.out.println(s1);  //syamkumar
		System.out.println(s2);  //kumar
		System.out.println(s3);  //syamkumar
		System.out.println(b);   //true
	}

}
