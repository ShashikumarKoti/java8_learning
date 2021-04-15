package examples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ComsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("SHASHI");
		
		Function<StudentConsumerEntity, String> studFunc = studFuc -> {
			String grade = "";
			if(studFuc.getMarks()>70 && studFuc.getMarks()<80) grade="[B] Grade";
			else if(studFuc.getMarks()>80) grade = "[A] Grade";
			else grade="Study more";
			return grade;
		};
		
		Predicate<StudentConsumerEntity> studPred = studPre -> studPre.getMarks()>70;
		
		Consumer<StudentConsumerEntity> conStud = stud -> {
			System.out.println("Student name: " + stud.getName());
			System.out.println("Student marks: " + stud.getMarks());
			System.out.println("Student grade: " + studFunc.apply(stud));
			System.out.println("--------------------------------");
		};
		
		StudentConsumerEntity[] studArr = {
					new StudentConsumerEntity("Shashi", 60),
					new StudentConsumerEntity("Shwetha", 88),
					new StudentConsumerEntity("Ved", 77),
					
		};
		
		for(StudentConsumerEntity stud : studArr) {
			if(studPred.test(stud))
			conStud.accept(stud);
		}
		
		
		//Chaining of Consumers
		Consumer<Movie> consumer1 = movie -> System.out.println(movie.name + " going to release");
		Consumer<Movie> consumer2 = movie -> System.out.println(movie.name + " finally released");
		Consumer<Movie> consumer3 = movie -> System.out.println(movie.name + " is Super duper FLOP!!!");
		Consumer<Movie> chainedConsumer = consumer1.andThen(consumer2).andThen(consumer3);
		
		Movie m = new Movie("Spider-Man");
		chainedConsumer.accept(m);
	}

}


class Movie {
	String name;
	
	Movie(String name) {
		this.name = name;
	}
}