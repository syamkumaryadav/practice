package NEgroupQuestions;

import java.util.ArrayList;
import java.util.List;

class parent{
	void m1() throws Exception{}
}
public class Questions extends parent {
	
	void m1() {
		// No Error..........
	}

	public static void main(String[] args) {
		
		
		
		/*int x=10;
		if(x=5) {
			System.out.println("x is 5");
		}*/

		
		
		/*for(int i=0;i<5;i++) {
			if(i==3)
			{
				System.out.println(i+" ");   //3
				break;				
			}
			System.out.println(i+" "); 		//	0 1 2 
		}*/
		
		/*	
			String str="Java";
			str=str.toLowerCase();
			System.out.println(str);   //java
			
			
			String str="Java";
			st=str.toLowerCase();
			System.out.println(st);		//compile time error
			*/
		
		/*int[] arr= {1,2,3};
		System.out.println(arr.length);   	//3
		System.out.println(arr[3]);
		System.out.println(arr.length());		//compile time error
		*/			
		
		
		/*int a=5.0;
		float b=5;
		double c=5;*/
		
		
		
		/*int[] arr= {1,2,3};
		System.out.println(arr[3]);  	// java.lang.ArrayIndexOutOfBoundsException
		*/		
		
		/*List<String> list=new ArrayList<>();
		list.add("A");
		list.add("b");
		System.out.println(list.get(2));*/		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
	
		/*int string =18;
		System.out.println(string);		//18
		int String =181;
		System.out.println(String);		//181
		int main=16;
		System.out.println(main);		//16
		int new=20;		// compile time error
		System.out.println(new);	*/
		
		/*int a=10,b=20;
		System.out.println(a + b+"hello..");	//30hello..
		System.out.println("hello.."+ a+b);		//hello..1020
		*/
		
		/*int a=5; 
		int b=++a;
		System.out.println(a); 	//6
		System.out.println(b);		//6
		*/
		
		
		/*int a=5;
		int b=a++;
		System.out.println(a); 	//6
		System.out.println(b);		//5
		*/
		
		/*Integer c=120;
		Integer d=120;
		System.out.println(c==d);	//true--->upto 127 is ture next false & int also true 
		
		Integer a=120;
		Integer b=120;
		System.out.println(a==b);	// false
		
		int y=200;
		int x=200;
		System.out.println(x==y);	//true
		
		Integer i=127;
		Integer j=127;
		System.out.println(i==j);	//true
		*/		
		
		/*String s1="Hello";
		String s2="Hello";
		String s3= new String("Hello");
		System.out.println(s1==s2);		//true
		System.out.println(s1==s3);		//false
		System.out.println(s1.equals(s3));		//true
		*/	
		
		/*String str="Hello";
		str.concat(" world");
		System.out.println(str);  	//Hello
		
		str=str.concat(" world");
		System.out.println(str);		// Hello world
		*/
		
		/*StringBuffer stringBuffer = new StringBuffer("java");
		stringBuffer.append(" is fun.");
		System.out.println(stringBuffer);  	//java is fun.
		System.out.println(stringBuffer.toString().toUpperCase());  	//JAVA IS FUN.
		*/
		
		/*int a=10;
		int b=0;
		int c=a/b;
		System.out.println(a/b);	//ArithmeticException
		System.out.println(c);		//ArithmeticException
		*/	
		
		System.out.println(56);  //56
	}

}
