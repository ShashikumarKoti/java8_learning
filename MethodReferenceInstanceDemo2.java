package examples;

import java.util.function.Function;

public class MethodReferenceInstanceDemo2 {

	public static void main(String[] args) {
			
		MethodReferenceInstanceDemo2 mrid2 = new MethodReferenceInstanceDemo2();
			Function<Integer, Integer> func = mrid2::m2;
			System.out.println("calling m2() method: " + func.apply(6));
		}
		

		public Integer m2(Integer i) {
			return i*i;
		}

}
