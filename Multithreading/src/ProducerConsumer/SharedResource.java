package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	
	public SharedResource(int bufferSize) {
		sharedBuffer=new LinkedList<>();
		this.bufferSize=bufferSize;
	}
	
	public synchronized void produce(int item) throws Exception{
		while(sharedBuffer.size()==bufferSize) {
			System.out.println("Buffer is full , producer is waiting for consumer");
			wait();
		}
		sharedBuffer.add(item);
		System.out.println("produced "+item);
		notify();
	}
	public synchronized int consume() throws Exception{
		while(sharedBuffer.isEmpty()) {
			System.out.println("Buffer is empty, consumer is waiting for producer");
			wait();
		}
		int item=sharedBuffer.poll();
		System.out.println("consumed item "+item);
		notify();
		return item;
	}
}
