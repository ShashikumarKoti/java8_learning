package examples.functionalinterface;

public class InterfaceWithStaticMethodImpl implements InterfaceWithStaticMethod {

	public static void main(String[] args) {

		//By default interface static methods are not available to implementation class
		//The only way to call interface static method is as below
		InterfaceWithStaticMethod.getStat();
		
	}

}


//Even if class implement the interface, still the interface static methods can be called
//public class InterfaceWithStaticMethodImpl {
//
//	public static void main(String[] args) {
//
//		//By default interface static methods are not available to implementation class
//		//The only way to call interface static method is as below
//		InterfaceWithStaticMethod.getStat();
//		
//	}
//
//}