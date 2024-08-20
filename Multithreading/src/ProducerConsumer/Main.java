package ProducerConsumer;

public class Main {

	public static void main(String[] args) {
		
		SharedResource sharedBuffer=new SharedResource(3);
		// TODO Auto-generated method stub
		Thread producerThread=new Thread(()->{
			try {
//				Thread.sleep(5000);
				for(int i=1;i<=6;i++) {
					sharedBuffer.produce(i);
				}
			}catch (Exception e) {
				//handle exception herer
			}
		});
		
		Thread consumerThread=new Thread(()->{
			try {
//				Thread.sleep(8000);
				for(int i=1;i<=6;i++) {
					sharedBuffer.consume();
				}
			}catch (Exception e) {
				//handle exception here
			}
		});
		producerThread.start();
		consumerThread.start();

	}

}
