package Java8.Features;


class MyRunnable implements Runnable{
	public void run() {
		for(int a=1;a<=4;a++) {
			System.out.println("Child thread..."+a);
		}
	}
}

public class RunnableWithoutLambda {

	public static void main(String[] args) {
		
		Runnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int a=1;a<=4;a++) {
			System.out.println("Paarent thread..."+a);
		}
	}

}
