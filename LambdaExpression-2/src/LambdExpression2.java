import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdExpression2 {

	public static void main(String[] args) {
		// Collection and Lambda Expression
		
		
		//Example 1
		List<String> names = Arrays.asList("x","Paul", "Jane", "Michaela", "Sam", "x");
		
		//without lambda expression
//		Collections.sort(names, new Comparator<String>(){
//			@Override
//			public int compare(String a, String b) {
//				return b.compareTo(a);
//			}			
//		});
		
		// with Lambda
//		Collections.sort(names,(String a, String b)->{
//			return b.compareTo(a);
//		});
		
		//with Lambda - shortest version
		Collections.sort(names,(a, b)-> b.compareTo(a));
		
		System.out.println(names);
		

		//Example 2 - Book(Class)
		Book book1 = new Book("First book", "Alex", "Nik", 382);
		Book book2 = new Book("Second book", "Diana", "Lar", 482);
		Book book3 = new Book("Third book", "Vlad", "Vod", 582);
		
		List<Book> books = Arrays.asList(book1,book2, book3);
		
		//use collect to aggregate values
		int total = books.stream()
					.collect(Collectors.summingInt(Book::getPages));
		System.out.println(total);
		
		// .collect - from object Book get Strings -> getAuthorLName
		// .map - to get last name of author
		List<String> list = books.stream()
							.map(Book::getAuthorLName)
							.collect(Collectors.toList());
		System.out.println(list);
		
	}

}
