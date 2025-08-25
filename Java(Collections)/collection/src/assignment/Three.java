package assignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Three {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayDeque<String> searches = new ArrayDeque<>();
	System.out.println("Enter 5 search terms:");
    for (int i = 0; i < 5; i++) {
        String term = sc.nextLine();
        if (searches.size() == 3) {
            searches.removeFirst(); // drop oldest
        }
        searches.addLast(term);
    }

    System.out.println("Last 3 searches:");
    for (String s : searches) {
        System.out.println(s);
        
    }
    sc.close();
}
	

}
