package com.syam.programs;

import java.io.FileInputStream;
import java.io.IOException;




	import java.io.*; 
	class Emp implements Serializable 
	{ 
	     int empNo=101; 
	          float salary=5000.00f;  
	} 
	class Main 
	{ 
	          public static void main(String args[]) 
	          { 
	                  try{ 
	                  Emp e1=new Emp(); 
	                  FileOutputStream fos=new FileOutputStream("emp.txt"); 
	                  ObjectOutputStream oos=new ObjectOutputStream(fos); 
	                  oos.writeObject(e1); 
	                  oos.close(); 
	                  fos.close(); 
	                  FileInputStream fis=new FileInputStream("emp.txt"); 
	                  ObjectInputStream ois=new ObjectInputStream(fis); 
	                  Emp e2=(Emp)ois.readObject(); 
	                  System.out.println(e2.empNo+"\t"+e2.salary); 
	                  ois.close(); 
	                  fis.close(); 
	                  }catch(Exception e) 
	                  { 
	                           System.err.println(e); 
	                  } 
	          } 
	} 


