package javaslips;

public class slip14a extends Thread
{
	public void run()
	{
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
		System.out.println("Thread name:"+Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		slip14a s=new slip14a();
		s.start();
	}

}
