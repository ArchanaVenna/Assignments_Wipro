package assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> apps = new LinkedList<>();

        System.out.println("Enter 5 apps opened:");
        for (int i = 0; i < 5; i++) {
            String app = sc.nextLine();
            // If already opened → remove first, then add to front
            apps.remove(app);
            apps.addFirst(app);
        }

        System.out.println("Final recent apps list:");
        for (String app : apps) {
            System.out.println(app);
        }
        sc.close();
    }

}
