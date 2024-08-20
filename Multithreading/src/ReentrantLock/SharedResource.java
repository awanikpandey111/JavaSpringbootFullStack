package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
	boolean isAvailable=false;
	
//	ReentrantLock lock=new ReentrantLock();
	
	public void producer(ReentrantLock lck) {
		try {
			System.out.println(Thread.currentThread().getName()+" is trying to acqure the lock");
			lck.lock();
			System.out.println("Lock acquired by "+ Thread.currentThread().getName());
			isAvailable=true;
			Thread.sleep(4000);
		}catch (Exception e) {
			
		}
		finally {
			lck.unlock();
			System.out.println("Lock release by "+ Thread.currentThread().getName());
		}
	}
}
