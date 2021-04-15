package examples;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgrammingDemo  {


     public static void main(String[] args) {  
    	
    	 Function<Integer, Integer>  func = i -> i*i;
    	 System.out.println(func.apply(5));
    	 
    	 BiFunction<Integer,Integer,Integer> biFunc = (i,j)-> i*j;
    	 System.out.println(biFunc.apply(4, 20));
    	 
    	 Predicate<Integer> pred = i-> i%2==0;
    	 System.out.println(pred.test(4));
    	 System.out.println(pred.negate().test(9));
    	 
    	 BiPredicate<Integer, Integer> biPred = (i,k)-> i+k==10;
    	 System.out.println(biPred.test(5, 6));
    	 
    	 
    	 Function<Integer,Integer> func1 = i-> i+i;
    	 Function<Integer,Integer> func2 = j-> j*2;
    	 System.out.println(func1.andThen(func2).apply(7));
    	 System.out.println(func1.compose(func2).apply(9));
    	 
    	 BiConsumer<Employees, Double> biConsumer = (emp, salaryIncr) -> emp.salary = emp.salary+salaryIncr;
    	 ArrayList<Employees> empList = new ArrayList<Employees>();
    	 empList.add(new Employees("Shashi", 1000.00));
    	 empList.add(new Employees("Shwetha", 2000.00));
    	 
    	 for(Employees emps : empList) {
    		 biConsumer.accept(emps, 500.00);
    	 }
    	 for(Employees emps1 : empList) {
    		 System.out.println("Employee name: "+ emps1.name);
    		 System.out.println("Employee salary: "+ emps1.salary);
    		 System.out.println("========================");
    	 }
    }
     
}



class Employees{
	
	String name;
	double salary;
	
	Employees(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}