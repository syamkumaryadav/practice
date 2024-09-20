package com.multithreading.prgms;

public class SyamThread implements Runnable {
	String name;
	
	public SyamThread(String name) {
		//super();
		this.name = name;
	}
	public void run()
	{
		for(int a=1;a<=10;a++)
		{
			System.out.println(name +"  :  "+a);
		}
	}


	public static void main(String[] args) {
		SyamThread s=new SyamThread("thread..");
		Thread t=new Thread(s);
		SyamThread s1=new SyamThread("thread....");
		Thread t1=new Thread(s1);
		t.start();
		t1.start();

	}

}
