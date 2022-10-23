package Assignment;

public class RunnableInterface implements Runnable {

	public void run() {
		System.out.println("thread class2"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		RunnableInterface ri = new RunnableInterface();
		Thread th = new Thread(ri);
		th.start();
		
		RunnableInterface ri1 = new RunnableInterface();
		Thread th1 = new Thread(ri1);
		th1.start();
		
		RunnableInterface ri2 = new RunnableInterface();
		Thread th2 = new Thread(ri2);
		th2.start();

	}

}
/*  thread class2Thread-1
thread class2Thread-2
thread class2Thread-0 */