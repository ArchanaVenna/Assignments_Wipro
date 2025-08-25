package assignment;

import java.util.Scanner;
import java.util.Stack;

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Stack<String> commands = new Stack<>();

        System.out.println("Enter 3 commands:");
        for (int i = 0; i < 3; i++) {
            commands.push(sc.nextLine());
        }

        System.out.println("Stack after adding: " + commands);

        // Undo (remove last command)
        String undone = commands.pop();
        System.out.println("After undo: " + commands);

        // Redo (re-add in reverse)
        commands.push(undone);
        System.out.println("After redo: " + commands);
        sc.close();

	}

}
