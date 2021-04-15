package examples;

import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		
		//UnaryOperator<> is child of Function<>
		//If i/p and o/p type is always same, then go for Unary Operator
		UnaryOperator<Integer> uo = num -> num * num;
		System.out.println(uo.apply(7));
		
		
	//	If i/p and o/p is always double, then use below
		DoubleUnaryOperator duo = num -> num * num;
		System.out.println(duo.applyAsDouble(50.0));
		
		
		BinaryOperator<Integer> bo = (num1, num2) -> num1*num2;
		System.out.println(bo.apply(2, 3));
		
		LongBinaryOperator lbo = (num1, num2) -> num1 + num2;
		System.out.println(lbo.applyAsLong(60000, 70000));
	}

}
