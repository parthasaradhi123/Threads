class My1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("priority of child thread ::: "+Thread.currentThread().getPriority());
	}
}



/*
 * public static final int MIN_PRIORITY =1;
 * public static final int NORM_PRIORITY=5;
 * public static final int MAX_PRIORITY=10;
 */

public class Example7 {

	public static void main(String[] args) 
	{
		System.out.println("Priority of main thread is :: "+Thread.currentThread().getPriority());
		
		My1 m = new My1();
		
		Thread t = new Thread(m);
		
		t.setPriority(6);
		
		t.start();
		
		
		 
	}

}
