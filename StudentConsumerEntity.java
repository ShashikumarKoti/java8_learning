package examples;

public class StudentConsumerEntity {

	
	private String name;
	private int marks;
	
	public StudentConsumerEntity() {
		super();
	}

	public StudentConsumerEntity(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentConsumerEntity [name=" + name + ", marks=" + marks + "]";
	}
	
}
