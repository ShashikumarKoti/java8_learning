package examples.functionalinterface;

interface InterfaceWithStaticMethod {

	public static void getStat() {
		System.out.println("Static method in interface called");
	}
	
	
	//From java 1.8, we can main() inside interface
	public static void main(String [] args) {
		System.out.println("main method in interface called");
	}
}
