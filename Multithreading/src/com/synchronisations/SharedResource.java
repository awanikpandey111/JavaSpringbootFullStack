package com.synchronisations;

public class SharedResource {
	boolean isItemPresent=false;
	
	public synchronized void addItem() {
		isItemPresent=true;
		System.out.println("producer thread calling the notify method");
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		System.out.println("consumer thread inside consumeItemMethod");
		if(!isItemPresent) {
			try {
				System.out.println("consumer thead is waiting");
				wait();
			}catch (Exception e) {
				
			}
		}
		System.out.println("consumer thead consumed the item");
		isItemPresent=false;
	}
}
