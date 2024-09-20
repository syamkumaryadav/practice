package com.multithreading.prgms;

public class ThreadStates {
	int amount=1000;
	
	public synchronized void withdrawl(int amount)
	{
		System.out.println("Going to withdrwal...");
		if(this.amount<amount)
		{
			System.out.println("Amount insufficient...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdrawl successful...");
	}
	public synchronized void debit(int amount)
	{
		System.out.println("Going to debit...");
		this.amount+=amount;
		System.out.println("deposit completed...");
		notify();
	}
	public static void main(String[] args) {
		ThreadStates ts=new ThreadStates();
		new Thread(){
			public void run()
			{
				ts.withdrawl(1200);
			}
		}.start();
		new Thread(){
			public void run()
			{
				ts.debit(1200);
			}
		}.start();
		
	}

}
