class MyThread6 implements Runnable
{
	@Override 
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}



public class Example5 {

	public static void main(String[] args) 
	{
		 
		MyThread6 m = new MyThread6();
		
		Thread t = new Thread(m);
	    t.start();
	    
	    // 2 thread, main thread  and userdefined thread.
	    
	    
		
		
	    
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
