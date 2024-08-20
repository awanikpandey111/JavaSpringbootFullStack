package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(2, 4, 1, TimeUnit.MINUTES, 
				new ArrayBlockingQueue<>(2),new CustomThreadFactory(),new CustomRejectedHandler());
		
		poolExecutor.allowCoreThreadTimeOut(true);
		
		for(int i=0;i<7;i++) {
			poolExecutor.submit(()->{
				try {
					Thread.sleep(5000);
				}catch (Exception e) {
					//Handles exception
				}
				System.out.println("Thread name "+Thread.currentThread().getName());

			});
		}
		poolExecutor.shutdown();
		

	}

}
class CustomRejectedHandler implements RejectedExecutionHandler{
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task denied "+r.toString());
	}
}

class CustomThreadFactory implements ThreadFactory{
	
	@Override
	public Thread newThread(Runnable r) {
		Thread th=new Thread(r);
		th.setPriority(Thread.NORM_PRIORITY);
		th.setDaemon(false);
//		th.setName("First thread");
		return th;
	}
}
