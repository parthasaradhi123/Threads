class MyThread extends Thread
{
		@Override
		public void run() 
		{
			for(int i =0;i<=10;i++)
			{
				System.out.println("::Child Thread::");
		
			}
		}
	
}


public class Examplet {

	public static void main(String[] args) 
	{
		 MyThread t = new MyThread();
		 t.start();
		 // -->At these line two thread will be present 
		 for(int i =0; i<=10;i++)
		 {
			 System.out.println("::Parent Thread::");
		 }
		 
		 

	}

}
