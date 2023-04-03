
class MyThread4 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("User defined Thread");
	}
}
public class Example3 {

	public static void main(String[] args) 
	{
		MyThread4 m = new MyThread4();
		
		m.start();
		
		m.start(); // Once we start the thread, then we are not supposed to start the thread again IllegalStateException
		
		System.out.println("Main Thread");
		  
	}

}
