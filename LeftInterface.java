package examples.functionalinterface;

public interface LeftInterface {

	default void m1() {
		System.out.println("Left interface called");
	}
}
