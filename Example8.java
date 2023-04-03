

 class My2 extends Thread
 {
	 @Override
	 public void run()
	 {
		//Thread.yield();
		
		 try
		 {
			 Thread.sleep(2000);
		 }
		 catch(InterruptedException e)
		 {
			 
		 }
		 System.out.println("::Hello I am sitha::");
	 }
 }

public class Example8 {

	public static void main(String[] args) throws InterruptedException
	{
		My2 m = new My2();
		m.start();
		
		m.join(1000); //Main thread is waiting for child thread, and also it is saying that I will only wait for th
		              // these much time not more then that.
		
		for(int i=0;i<5;i++)
		{
			System.out.println("I am Rama");
		}
		
		
	}

}
