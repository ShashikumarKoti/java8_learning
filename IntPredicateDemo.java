package examples;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;

public class IntPredicateDemo {

	public static void main(String[] args) {

		//If we use Predicate to take int as parameters, Here internal conversion happens from int-->Integer-->int and hence performance is SLOW
		Predicate<Integer> pred = num -> num%2==0;
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<=10000;i++) {
			if(pred.test(i)) {
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		//If we use IntPredicate to take int as parameters, Here NO conversion happens and hence performance is fast
		IntPredicate pred2 = num -> num%2==0;
		
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<=10000;i++) {
			if(pred2.test(i)) {
			}
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime2);
		
		
		DoubleToIntFunction doubleToIntFunc = num -> (int)num*5;
		System.out.println(doubleToIntFunc.applyAsInt(12.00));
		
		IntToDoubleFunction intToDoubleFunc = num -> num*5;
		System.out.println(intToDoubleFunc.applyAsDouble(50));
		
		ToIntFunction<Double> toIntFunc = num -> (int)(num*num);
		System.out.println(toIntFunc.applyAsInt(50.0));
		
		ToLongBiFunction<Integer, Double> toLongbiFunc = (num1, num2) -> (long)(num1*num2);
		System.out.println(toLongbiFunc.applyAsLong(200, 300.0));
	}

}
