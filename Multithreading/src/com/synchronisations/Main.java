package com.synchronisations;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Current Thread "+ Thread.currentThread().getName());
		SharedResource sharedResourceObj=new SharedResource();
		Thread producerThread=new Thread(()->{
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
				
			}
			sharedResourceObj.addItem(); 
		});
		
		Thread consumerThread=new Thread(()->{
			sharedResourceObj.consumeItem();
		});
		
		producerThread.start();
		consumerThread.start();
	}
}
