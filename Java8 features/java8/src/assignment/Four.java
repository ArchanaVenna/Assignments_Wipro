package assignment;

interface Power{
	void turnOn();//abstract method
	default void turnOff() {
		System.out.println("PowerOff by default method");
	}
	
}
public class Four implements Power {
	public void turnOn() {
		System.out.println("Power On");
	}

	public static void main(String[] args) {
		
		Four f=new Four();
		f.turnOn();
		f.turnOff();
		
		
	}

}
