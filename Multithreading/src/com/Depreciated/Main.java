package com.Depreciated;

public class Main {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resource=new SharedResource();
		System.out.println("Main thread started");
		
		Thread th1=new Thread(()->{
			System.out.println("Thread1 calling produce method");
			resource.produce();
		});
		
		Thread th2=new Thread(()->{
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				//Exception handling
			}
			System.out.println("Thread2 calling produce method");
			resource.produce();
		});

		th1.start();
		th2.start();
//		th1.setDaemon(true);
//		th2.setDaemon(true);
		
		try {
			//th1.join();//it stops previoulsy running thread to stop terminating before th1 gets terminated.
			//th2.join();
			//Thread.sleep(3000);
		}catch (Exception e) {
			
		}
		
		System.out.println("Thread1 is suspended");
		//th1.suspend();
		System.out.println("Main thread is finishing its work");
	}

}
