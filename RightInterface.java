package examples.functionalinterface;

public interface RightInterface {

	default void m1() {
		System.out.println("Right interface called");
	}
}
