
class Display 
{
	public synchronized void wish(String name)
	{
		try
		{
			for(int i=0;i<5;i++)
			{
			
				System.out.print(" Name :: ");
				Thread.sleep(2000);
				System.out.println(name);
			}
			System.out.println("==============================");
		}
		catch(InterruptedException e)
		{
			System.out.println("There is an exception");
		}
		 
	}
}

class Partha2 extends Thread
{
	Display d;
	String name;
	
	public Partha2(Display d, String name)
	{
		this.d = d;
		this.name = name;
		
	}
//	  
	@Override
	public void run()
	{
		d.wish(name);
		
	}
}




public class ThreadMulti {

	public static void main(String[] args)
	{
		Display d = new Display();
		Display d1 = new Display();
		
		Partha2 p1 = new Partha2(d,"King");
		Partha2 p = new Partha2(d1,"Kohli");
		
		p.start();
		p1.start();
		
		System.out.println("=============================");
		System.out.println(":: hey I am main Thread ::");
		System.out.println("=============================");
	}

}
