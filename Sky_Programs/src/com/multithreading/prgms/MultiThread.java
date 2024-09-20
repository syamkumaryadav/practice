package com.multithreading.prgms;

public class MultiThread implements Runnable {
	String name;
	MultiThread(String name1)
	{
		name=name1;
	}
	public void run()
	{
		for(int a=1;a<=10;a++)
		{
			System.out.println(name +" : " +a);
		}
	}
	public static void main(String[] args) {
		MultiThread mt1=new MultiThread("Thread.......... 1");
		MultiThread mt2=new MultiThread("Thread 2");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
		//Thread t= Thread.currentThread();
		System.out.println(t1);
	}

}
