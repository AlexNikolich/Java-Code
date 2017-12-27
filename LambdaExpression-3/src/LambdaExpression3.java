import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpression3 {

	public static void main(String[] args) {
		//stream operations(methods) for collection
		//stream uses lambda expression
		//stream operations are either intermediate or terminal
		//terminal operations are either void or return a type
		//intermediate operations return the stream itself
		//operations map, filter - intermediate, forEach - terminal, sorted - interm., collect - terminal
		//operations findFirst,ifPresent(System.out::println)
		//Elements in a stream cannot be changed
		
		//Example 1
		Arrays.asList("red", "green" ,"blue")
				.stream()
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
		
		//Example 2 - pay attention filter when find go to forEach, and then back to filter
		Stream.of("apple", "pear","banana","cherry","apricot")
				.filter(fruit -> {
					System.out.println("Filter: " + fruit);
					return fruit.startsWith("a");
				})
				.forEach(fruit -> System.out.println("Start with A: " + fruit));
		
		//Example 3 - map is returning another stream (itself)
		List<String> coll = Stream.of("Java", "Rocks")
					.map(string -> string.toUpperCase())
					.collect(Collectors.toList());
		System.out.println(coll);
		
		//Example 4 - primitives in lambda stream
		Arrays.stream(new int[] {1,2,3,4})
				.map(n -> n * n)
				.average()
				.ifPresent(System.out::println); // to work must get value or NULL (NOT STREAM)
		
		//Example 5  - map doublesto ints
		Stream.of(1.5,2.3,3.7)
				.mapToInt(Double::intValue)
				.forEach(System.out::println);

	}

}
