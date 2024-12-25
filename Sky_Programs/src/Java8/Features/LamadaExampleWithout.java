package Java8.Features;

@FunctionalInterface
interface IinterF2 {
	public void myAbstractMethod();
}

public class LamadaExampleWithout implements IinterF2 {

	public static void main(String[] args) {
		IinterF2 obj = new LamadaExampleWithout();
		obj.myAbstractMethod();
	}

	@Override
	public void myAbstractMethod() {
		System.out.println("My without LAMBDA EXPRESSION example...");

	}

}
