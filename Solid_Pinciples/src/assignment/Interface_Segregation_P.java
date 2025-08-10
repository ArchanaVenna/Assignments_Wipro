package assignment;

interface Work{
	void work();
}
interface Eat{
	void eat();
}
class Humans implements Work,Eat{
	public void work() {
		System.out.println("Humans are working");
	}
	public void eat() {
		System.out.println("Humans are eating");
	}
}
class Animals implements Eat{
	public void eat() {
		System.out.println("Animals are eating");
	}
	
}

public class Interface_Segregation_P {
    public static void main(String[] args) {
		Humans h=new Humans();
		h.work();
		h.eat();
		
		Animals a=new Animals();
		a.eat();
		
	}

}
