package assignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Eight {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayDeque<String> chat = new ArrayDeque<>();

	        System.out.println("Enter 6 chat messages:");
	        for (int i = 0; i < 6; i++) {
	            String msg = sc.nextLine();
	            if (chat.size() == 4) {
	                chat.removeFirst(); // remove oldest
	            }
	            chat.addLast(msg);
	        }

	        System.out.println("Last 4 chat messages:");
	        for (String m : chat) {
	            System.out.println(m);
	        }
	        sc.close();
	    }

}
