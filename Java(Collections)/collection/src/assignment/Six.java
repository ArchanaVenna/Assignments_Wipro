package assignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.println("Enter 5 customer names:");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            if (name.length() % 2 == 0) {
                queue.addFirst(name); // even length → front
            } else {
                queue.addLast(name);  // odd length → end
            }
        }

        System.out.println("Serving order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }
        sc.close();
	}

}
