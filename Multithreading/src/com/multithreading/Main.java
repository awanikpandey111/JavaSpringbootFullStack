package com.multithreading;

public class Main {

	//Using Thread extension
	/*public static void main(String[] args) {
		System.out.println("Going Inside main thread"+Thread.currentThread().getName());
		ML myThread=new ML();
		myThread.start();
		System.out.println("Finish execution main method "+ Thread.currentThread().getName());
	}*/

	
	//Using Runnable Interface
	/*public static void main(String[] args) {
	System.out.println("Going Inside main thread"+Thread.currentThread().getName());
	ML runnableObj=new ML();
	Thread myThread=new Thread(runnableObj);
	myThread.start();
	System.out.println("Finish execution main method "+ Thread.currentThread().getName());
	}*/
	
	
	
	//Monitor Lock
	public static void main(String[] args) {
		ML obj=new ML();
		Thread t1=new Thread(()->{obj.task1();});
		Thread t2=new Thread(()->{obj.task2();});
		Thread t3=new Thread(()->{obj.task3();});
		t1.start();
		t2.start();
		t3.start();
	}
	
}
