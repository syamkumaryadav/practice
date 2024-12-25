package alloops.prgms;

public class ConstructorExample {
	int a,b;
	
	public ConstructorExample(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(a);	//18,  //100
		System.out.println(b);	//63	//13
	}
	public ConstructorExample(ConstructorExample ce) {
		super();
		this.a = ce.a;
		this.b = ce.b;
		System.out.println(a);	//18
		System.out.println(b);	//63
	}

	public static void main(String[] args) {
		
		ConstructorExample obj =new ConstructorExample(18,63);
		ConstructorExample obj2 =new ConstructorExample(obj);
		ConstructorExample obj3 =new ConstructorExample(100,13);
	}

}
