package assignment;

import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    Task(int id) { this.id = id; }
    @Override
    public String toString() { return "Task-" + id; }
}

public class Eleven {
	  public static void main(String[] args) throws InterruptedException {
	        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
	        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

	        // Add 6 tasks
	        for (int i = 1; i <= 6; i++) {
	            stage1.put(new Task(i));
	        }

	        // Process stage1 → stage2
	        while (!stage1.isEmpty()) {
	            Task t = stage1.take();
	            System.out.println("Stage1 processed: " + t);
	            if (t.id % 2 == 0) { // only even go to stage2
	                stage2.put(t);
	            }
	        }

	        // Process stage2
	        while (!stage2.isEmpty()) {
	            Task t = stage2.take();
	            System.out.println("Stage2 processed: " + t);
	        }
	    }
	

}
