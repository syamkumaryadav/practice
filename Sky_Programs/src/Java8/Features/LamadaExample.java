package Java8.Features;

/*@FunctionalInterface
interface IinterF {
	public void myAbstractMethod();
}

public class LamadaExample {

	public static void main(String[] args) {

		IinterF i = () -> System.out.println("My LAMBDA EXPRESSION first example...");
		i.myAbstractMethod();
	}

}*/

interface IinterF {
	public void myAbstractMethod(int a,int b);
}

public class LamadaExample {

	public static void main(String[] args) {

		IinterF i = (a,b) -> System.out.println("My LAMBDA EXPRESSION first example ADDITION... : "+(a+b));
		i.myAbstractMethod(18,45);
	}

}
