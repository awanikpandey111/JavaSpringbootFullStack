package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
	boolean isAvailable=false;
	public void producer(ReadWriteLock lck) {
		try {
			lck.readLock().lock();
			System.out.println("Read lock acquired by "+ Thread.currentThread().getName());
//			isAvailable=true;
			Thread.sleep(3000);
		}catch (Exception e) {
			
		}
		finally {
			lck.readLock().unlock();
			System.out.println("Read lock release by "+Thread.currentThread().getName());
		}
	}
	public void consume(ReadWriteLock lck) {
		try {
			lck.writeLock().lock();
			System.out.println("write lock acquired by "+Thread.currentThread().getName());
			isAvailable=true;
		}catch (Exception e) {
			
		}
		finally {
			lck.writeLock().unlock();
			System.out.println("write lock released by "+Thread.currentThread().getName());
		}
	}
}
