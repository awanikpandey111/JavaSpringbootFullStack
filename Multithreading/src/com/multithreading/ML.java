package com.multithreading;

/*public class ML extends Thread{
//	@Override
  public void run() {
	  System.out.println("Thread executed by "+ Thread.currentThread().getName());
  }
}
*/

/*public class ML implements Runnable{
	@Override
	 public void run() {
		  System.out.println("Thread executed by "+ Thread.currentThread().getName());
	  }
}*/


//Monitor Lock

public class ML{
	public synchronized void task1(){
		try {
			System.out.println("Inside task1");
		}catch (Exception e) {
			
		}
	}
	public void task2() {
		System.out.println("task 2 but before synchronisation");
		synchronized(this){
			System.out.println("task 2 , inside synchronised");
		}
	}
	
	public void task3() {
		System.out.println("task 3");
	}
}