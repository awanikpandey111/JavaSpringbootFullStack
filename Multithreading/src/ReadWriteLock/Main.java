package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resource=new SharedResource();
		ReadWriteLock lck=new ReentrantReadWriteLock();
		
		Thread th1=new Thread(()->{
			resource.producer(lck);
		});
		Thread th2=new Thread(()->{
			resource.producer(lck);
		});
		
		SharedResource resource1=new SharedResource();
		Thread th3=new Thread(()->{
			resource1.consume(lck);
		});
		th1.start();
		th2.start();
		th3.start();

	}

}
