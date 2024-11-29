package org.tns.capgemini.c2tc.multithreading;
class Eclipse3 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id" + "  " + Thread.currentThread().getId());
	}
}

class OneNote3 extends Thread
{
	public void run()
	{
		System.out.println("OneNote id" + "  " + Thread.currentThread().getId());
	}
}
class Chrome3 extends Thread
{
	public void run()
	{
		System.out.println("chrome id" + "  " + Thread.currentThread().getId());
	} 
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Eclipse3 obj=new Eclipse3();
				obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		
		
		OneNote3 obj1=new OneNote3();
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);
		
		
		Chrome3 obj2=new Chrome3();
		obj2.start();
		obj2.setPriority(Thread.NORM_PRIORITY);
		

	}

}
