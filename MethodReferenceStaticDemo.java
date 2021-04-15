package examples;

public class MethodReferenceStaticDemo {
	
	public static void main(String[] args) {

		Runnable r = MethodReferenceStaticDemo::m1;
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
			}
	}

	
	public static void m1() {
		for(int i=0;i<10;i++) {
		System.out.println("Child thread");
		}
	}
}
