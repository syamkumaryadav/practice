package com.multithreading.prgms;

public class DemoThread extends Thread {
	public void run()
	{
		System.out.print("run method runnable by JVM.");
	}
	public static void main(String[] args) {
		DemoThread dt=new DemoThread();
		Thread t=new Thread(dt);
		t.start();

	}

}
