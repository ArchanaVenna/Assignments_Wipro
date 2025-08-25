package assignment;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    String name;
    int severity; // lower = more urgent
    long time;    // timestamp

    Patient(String name, int severity, long time) {
        this.name = name;
        this.severity = severity;
        this.time = time;
    }
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
public class Twelve { public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity) // lower severity first
                      .thenComparingLong(p -> p.time)          // tie-breaker: older first
        );

        // Adding patients
        patientQueue.add(new Patient("Alice", 3, System.currentTimeMillis()));
        patientQueue.add(new Patient("Bob", 1, System.currentTimeMillis()));
        patientQueue.add(new Patient("Charlie", 2, System.currentTimeMillis()));
        patientQueue.add(new Patient("David", 1, System.currentTimeMillis() - 1000)); // older

        System.out.println("Treating patients in order:");
        while (!patientQueue.isEmpty()) {
            System.out.println("Treating: " + patientQueue.poll());
        }
    }
}