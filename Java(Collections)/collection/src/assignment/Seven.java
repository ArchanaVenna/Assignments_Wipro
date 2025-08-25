package assignment;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Job {
    String name;
    int urgency; // 1 = highest priority

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return name + " (Urgency: " + urgency + ")";
    }
}
public class Seven {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PriorityQueue with custom comparator
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(
            Comparator.comparingInt((Job j) -> j.urgency) // lower urgency first
                      .thenComparing(j -> j.name.length()) // tie-breaker: shorter name
        );

        System.out.println("Enter 5 jobs (name urgency):");
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int urgency = sc.nextInt();
            jobQueue.add(new Job(name, urgency));
        }

        System.out.println("Jobs picked in order:");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }
        sc.close();
    }

}
