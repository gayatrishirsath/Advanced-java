package javaslips;

public class slip10a extends Thread
{
   public void run()
   {
	System.out.println(Thread.currentThread().getName());
   }
	public static void main(String[] args)
	{
	  slip10a s1=new slip10a();
	  s1.start();
	  slip10a s2=new slip10a();
	  s2.start();
	  slip10a s3=new slip10a();
	  s3.start();
	}

}
