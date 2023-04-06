
class Display1
{
	public void hi()
	{
		
	synchronized(this)
	{
		try 
		{
			for(int i=0;i<5;i++)
			{	
				System.out.print(":: HI ::");
				Thread.sleep(2000);
				System.out.println(" PARTHA ");
			}
			System.out.println("=============================");
		}
		catch(InterruptedException e)
		{
			System.out.println(" :: There is some Exception in HI ::");
		}
	}
	}
	
	public void hello()
	{
		 synchronized(this) {
		try 
		{
			for(int i=0;i<5;i++)
			{	
				System.out.print (":: HELLO ::");
				Thread.sleep(2000);
				System.out.println(" SHIVA ");
			}
			System.out.println("=========================");
		}
		catch(InterruptedException e)
		{
			System.out.println(" :: There is some Exception in HI ::");
		}
		 }
	}
	
	
}

class Myy extends Thread
{
	Display1 d;
	public Myy(Display1 d)
	{
		this.d = d;
	}
	
	@Override
	public void run()
	{
		d.hi();
	}
}

class Mee extends Thread
{
	Display1 d;
	public Mee(Display1 d)
	{
		this.d = d;
	}
	
	@Override
	public void run()
	{
		d.hello();
	}
}







public class ThreadSync {

	public static void main(String[] args) 
	{
		Display1 d = new Display1();
		
		Myy m = new Myy(d);
		
		Mee m1 = new Mee(d);
		
		m.start();
		m1.start();
		
		System.out.println("=====================");
		System.out.println(":: I am Main Thread :: ");
		System.out.println("=====================");
		
		
	}

}
