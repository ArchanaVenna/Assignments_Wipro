package assignment;

//child can replace parents

class Bird{
	void fly(){
		System.out.println("Bird can fly");
	}
}
class Sparrow extends Bird{
	void fly() {
		System.out.println("These fly fast");
	}
}



public class Liskov_Substitution_P {
  public static void main(String[] args) {
		Bird b=new Sparrow();
		b.fly();
	}
}
