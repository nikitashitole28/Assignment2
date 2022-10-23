package Assinment2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Employee implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
		return null;
	}
	
}
public class CallableFuture {

	public static void main(String[] args) {
		Employee e=new Employee();
		ExecutorService ex=Executors.newFixedThreadPool(5);
		ex.execute(e);
		
		
		
		
	}

}
