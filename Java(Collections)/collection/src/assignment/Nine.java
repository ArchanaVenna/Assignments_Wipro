package assignment;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Nine {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

	        System.out.println("Enter 5 print jobs:");
	        for (int i = 0; i < 5; i++) {
	            String job = sc.nextLine();
	            // if queue full → skip job
	            if (!printQueue.offer(job)) {
	                System.out.println("Queue full! Skipping job: " + job);
	            }
	        }

	        System.out.println("Printing jobs one by one:");
	        while (!printQueue.isEmpty()) {
	            System.out.println("Printing: " + printQueue.poll());
	        }
	        sc.close();
	    }

}
