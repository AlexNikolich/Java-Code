import java.awt.Button;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpressions {

	public static void main(String[] args) {
		//JAVA 8 two new packages java.util.function java.util.stream
		//functional inteface - an iterafce contains at most one abstract function
		/*
		 *	Predicate - takes one argument, returns a BOOLEAN
		 *	Consumer - accepts single argument with no return value
		 *	Function - accepts one argument an produces a result
		 *	Supplier - represents a supplier of results (not accept argument)
		 *	UnaryOperator - single argument with return value
		 *	BinaryOperators - takes two arguments and returns one
		 *
		 *  Lambda expression instead Anonymous inner class 
		 */
		
		
		Predicate<String> stringLen = (s)-> s.length() <10;
		System.out.println(stringLen.test("Apples") + " - Apples is less than 10");
		
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABCEFghijklOMNJahoOOOOO");
		
		Function<Integer, String> converter = (num) -> Integer.toString(num);
		System.out.println("length of 26: " + converter.apply(26).length());
		
		Supplier<String> s = ()-> "Java is fun";
		System.out.println(s.get());
		
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("This is my message in upper case"));
		
		BinaryOperator<Integer> add = (a,b) -> a + b;
		System.out.println("add 10 + 25: " + add.apply(10, 25));
		
		
		//You can define your own functional interface
		//Example 1 - Calculate(interface)
		
		Calculate add1 = (a,b) -> a+b;
		Calculate difference = (a,b) -> Math.abs(a-b);
		Calculate divide = (a,b) -> (b !=0 ? a/b : 0);
		Calculate multiply = (c,d) -> c*d ;
		
		System.out.println(add1.calc(2,3));
		System.out.println(difference.calc(5,10));
		System.out.println(divide.calc(12,3));
		System.out.println(multiply.calc(7,5));
		
		
	}

}
