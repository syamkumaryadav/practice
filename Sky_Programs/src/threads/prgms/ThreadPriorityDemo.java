package threads.prgms;

class ThreadPriorityDemo extends Thread
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority()+"  "+Thread.currentThread().getName());//5
		Thread.currentThread().setName("balayya");
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority()+"  "+Thread.currentThread().getName());//5
		ThreadPriorityDemo t=new ThreadPriorityDemo();
		System.out.println(t.getPriority()+" bbbbbbbbbbbbbbbbbbbbbbbb");//9
		System.out.println(t.getName()+" nnnnnnnnnnnnnnnnnnn");//9
	}
}

// 	1: The thread has the lowest priority (least likely to get CPU time).
//	10: The thread has the highest priority (most likely to get CPU time).
//	5: This is the default priority for threads (denoted by Thread.NORM_PRIORITY).