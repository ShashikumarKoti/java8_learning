package examples.functionalinterface;

public class LeftRightImpl implements LeftInterface, RightInterface {

	@Override
	public void m1() {
		
		System.out.println("Overrided m1() method called");
		LeftInterface.super.m1();
		RightInterface.super.m1();
	}
	
	public static void main(String[] args) {

		LeftRightImpl lri = new LeftRightImpl();
		lri.m1();
	}

}
