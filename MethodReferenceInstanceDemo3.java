package examples;

import java.util.function.BiFunction;

public class MethodReferenceInstanceDemo3 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFunc = Arithematic::add;
		System.out.println(biFunc.apply(5, 7));
		
		BiFunction<Double, Double, Double> biFuncDouble = new Arithematic()::multiply;
		System.out.println(biFuncDouble.apply(55.00, 77.00));
	}

}

class Arithematic {
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
}