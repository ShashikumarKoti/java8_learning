package examples;

public class ConstructorReferenceDemo2 {

	//We should use Constructor reference when interface method returns an Object<T>
	
	public static void main(String[] args) {

		
		//Using Constructor ref
		IStudent iStud = Student::new;
		iStud.getStudent(33, "Shwetha", 88);
		
		//Using lambda expression
		IStudent iStud2 = (roll, name, marks) -> new Student(roll, name, marks);
		iStud2.getStudent(22, "Shashi", 99);
	}

}


interface IStudent {
	
	
	public Student getStudent(int roll, String name, int marks);
}

class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	System.out.println("Studnet: "+ roll + " " + name  + " "+  marks);
	}
}