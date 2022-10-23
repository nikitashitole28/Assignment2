package Assignment;

public class ThreadClass extends Thread{
	
	public void run()
	{
		System.out.println("thread class"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadClass tc=new ThreadClass();
		tc.start();
		
		ThreadClass tc1=new ThreadClass();
		tc1.start();
		
		
		ThreadClass tc2=new ThreadClass();
		tc2.start();
		
		
	}

}
/* thread classThread-1
thread classThread-2
thread classThread-0 */
