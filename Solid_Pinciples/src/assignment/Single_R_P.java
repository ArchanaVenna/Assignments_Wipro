package assignment;

//one class=one job
class Student{
	String name;
	
	Student(String name){
		this.name=name;
	}
}

class Print{
	void print(Student s) {
		System.out.println("Name is : "+s.name);
	}
}

public class Single_R_P {

	public static void main(String[] args) {
		
		Student s=new Student("Archana");
		Print p=new Print();
		p.print(s);
		
	}

}