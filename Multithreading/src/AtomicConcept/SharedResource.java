package AtomicConcept;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
	
	AtomicInteger cnt=new AtomicInteger(0);
	
	public  void  increment() {
		cnt.incrementAndGet();
	}
	
	public int getIncrement() {
		return cnt.get();
	}
}
