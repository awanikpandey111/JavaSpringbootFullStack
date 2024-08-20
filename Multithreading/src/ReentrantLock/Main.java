package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String args[]) {
		
		ReentrantLock lck=new ReentrantLock();
		
		SharedResource resource1=new SharedResource();
		Thread th1=new Thread(()->{
			resource1.producer(lck);
		});
		
		SharedResource resource2=new SharedResource();
		Thread th2=new Thread(()->{
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
			resource2.producer(lck);
		});
		
		th1.start();
		th2.start();
	}
}
