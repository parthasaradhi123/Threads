
public class ThreadWithLambda
{

	public static void main(String[] args) 
	{
		Runnable r = ()->
						{
							for(int i=0;i<5;i++)
							{
								System.out.println("::I am child::");
							}
						};
						
	 Thread t = new Thread(r);
	 
	 t.start();
	 System.out.println("::uMain Thread::");
	 
	}

}
