class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("No Arg Method");
		run(5); //  calling these method through the MyThread
	}
	public void run(int i)
	{
		System.out.println("Okay okay");
	}
}

public class Example2 {

	public static void main(String[] args) 
	{
		
		MyThread2 m = new MyThread2();
		m.start();
		m.run(10); // explicity calling that run methos using main thread.
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
