package com.Depreciated;

public class SharedResource {
	boolean isAvailable=false;
	
	public synchronized void produce() {
		System.out.println("Lock acquired");
		isAvailable=true;
		
		try {
			Thread.sleep(8000);
		}catch (Exception e) {
			//handle some exception
		}
		System.out.println("lock released");
	}
}
