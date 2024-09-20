package com.TypesOfMethods.prgms;

class Emp {
	int empNo; 
	 float salary; 
	 Emp(int empNo, float salary) 
	 { 
	  this.empNo=empNo; 
	  this.salary=salary; 
	  
	  System.out.println(empNo+"\t"+salary); 
	 
	 } 
	} 
	class ConstructorDemo 
	{ 
	 public static void main(String args[]) 
	          { 
		 Emp e1=new Emp(101, 5000.00f); 
		 Emp e2=new Emp(102, 5500.00f);
		 
		 Emp e4=new Emp(104, 5500.00f);
		 Emp e3=new Emp(103, 5500.00f);
	 // System.out.println(e1.empNo+"\t"+e1.salary); 
	 // System.out.println(e2.empNo+"\t"+e2.salary); 
	 } 
	

}
