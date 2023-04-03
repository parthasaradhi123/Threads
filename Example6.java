class My implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("::I am second thread::");
		System.out.println("SEcond Thread name before changing :: "+Thread.currentThread().getName());
		
		  Thread.currentThread().setName("Partha");
		  
	   System.out.println("Second Thread Name after changing :: "+Thread.currentThread().getName());  
		  
	}
}
public class Example6 {

	public static void main(String[] args) 
	{
		System.out.println("**I am main Thread**");
		
		My m = new My();
		
		Thread t = new Thread(m);
		t.start();
		
		String n = Thread.currentThread().getName();
		
		System.out.println("Main thread name before changing :: "+n);
		
		Thread.currentThread().setName("Reddy");
		
		System.out.println("Main thread name after changing :: "+Thread.currentThread().getName());
		System.out.println("=======================================================================");
	}

}
