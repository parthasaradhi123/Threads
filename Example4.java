class MyThread3 extends Thread
{
	@Override
	public void start() // it will be executed by main thread 
	{
		super.start(); // New thread will be created and it will call run method
		
		System.out.println("Start method called");
	}
	
	@Override
	public void run() // These method will be called by new thread or user defined thread not main thread.
	{
		System.out.println("::Run method::");
	}
}


public class Example4 {

	public static void main(String[] args) 
	{
		
		MyThread3 m = new MyThread3();
		
		m.start();
		
		 
			System.out.println(":::Main Thread:::");
		
	}

}
