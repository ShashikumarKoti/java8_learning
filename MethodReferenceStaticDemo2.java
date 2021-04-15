package examples;

import java.util.function.Function;

public class MethodReferenceStaticDemo2 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func = MethodReferenceStaticDemo2::m2;
		System.out.println("calling m2() method: " + func.apply(6));
	}
	

	public static Integer m2(Integer i) {
		return i*i;
	}
}
