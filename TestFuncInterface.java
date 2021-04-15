package examples.functionalinterface;

@FunctionalInterface
public interface TestFuncInterface {

	public boolean m1(int a, int b);
	
	default void m2() {
		
	}
	
	static void m3() {
		
	}
}
