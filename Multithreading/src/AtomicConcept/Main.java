package AtomicConcept;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource resource=new SharedResource();
		
		Thread th1=new Thread(()->{
			for(int i=0;i<400;i++) {
				resource.increment();
			}
		});
		
		Thread th2=new Thread(()->{
			for(int i=0;i<400;i++) {
				resource.increment();
			}
		});
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		}catch (Exception e) {
			
		}
		System.out.println(resource.getIncrement());
	}

}
