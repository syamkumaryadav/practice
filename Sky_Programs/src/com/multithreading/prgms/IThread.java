package com.multithreading.prgms;

public class IThread implements Runnable {

	public void run()
	{
		System.out.print("run method runnable by JVM by interface.");
	}
	public static void main(String[] args) {
		IThread it=new IThread();
		Thread t=new Thread(it);
		t.start();
	}

}
