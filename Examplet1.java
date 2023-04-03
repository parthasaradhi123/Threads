class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(":: Partha is not Running ::");
		}
	}
}


public class Examplet1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 MyThread1 my = new MyThread1();
		 
		 //my.run();
		 my.start();
		 
	//	 my.sleep(100);
		 
		 System.out.println();
		 
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("::Partha::");
			
			 
		 }
		 

	}

}
