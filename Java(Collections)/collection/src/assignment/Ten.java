package assignment;

import java.util.concurrent.LinkedBlockingQueue;

public class Ten {
	 public static void main(String[] args) {
	        LinkedBlockingQueue<String> chatBuffer = new LinkedBlockingQueue<>(5);

	        // Producer thread
	        Thread producer = new Thread(() -> {
	            int count = 1;
	            try {
	                while (count <= 10) {
	                    String msg = "Message " + count;
	                    chatBuffer.put(msg);
	                    System.out.println("Added: " + msg);
	                    count++;
	                    Thread.sleep(200);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Consumer thread
	        Thread consumer = new Thread(() -> {
	            try {
	                while (true) {
	                    String msg = chatBuffer.take();
	                    System.out.println("Processed: " + msg);
	                    Thread.sleep(500);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producer.start();
	        consumer.start();
	    }

}
