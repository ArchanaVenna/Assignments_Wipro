package assignment;

@FunctionalInterface
interface Message{
	void print(String message);
}
public class Three {
	public static void greet(Message printer) {
		printer.print("Hello! Welcome...");
	}

	public static void main(String[] args) {
		greet(msg->System.out.println(msg));

	}

}
