class My4 extends Thread
{
	static Thread mt;
	
	@Override
	public void run()
	{
		try 
		{
			mt.join(); // child thread is waiting for the main thread to complete its execution.
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("::Child Thread::");
		}
	}
}
public class Example9 {

	public static void main(String[] args)  throws InterruptedException
	{
		My4.mt = Thread.currentThread();
		
		My4 m = new My4();
		
		m.start();

		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("I am main thread");
		}
	
	}

}
