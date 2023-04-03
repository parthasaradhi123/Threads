class Partha extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("child thread sleeping");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted because child thread is sleeping or waiting ");
		}
	}
}


public class ExampleInterupted {

	public static void main(String[] args)
	{
		Partha p = new Partha();
		
		p.start();
		
		p.interrupt();
		
		System.out.println("Main Thread ");
	}

}
