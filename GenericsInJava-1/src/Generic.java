import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// IN JAVA 5.0
		// Not primitives, ONLY (MUST) reference types
		// Types are replaced by the compiler with concrete types on runtime
		// CAST no error during compile-time, but in Run-time
		// Generic - yes error during compile-time!!!
		// E - element, K - key, N -Number, T- Type, V - value... you can use any letters
		// A raw type is the name of a generic class without any type arguments
		// A nongeneric class or interface is NOT a raw type
		// Type parameter and type argument are not the same. (T1 is a type parameter)(argument concrete)
		// CLASS => class name<T1,T2,T3,..,Tn> {/*.........*/}
		// METHOD => public static <E> void print(E[] list){.....}
		// '> < =' operators don't work because they are for primitives
		// MUST use class Comparable(compareTo) for references types (EXAMPLE 5)
		// INTERFACE => interface genericInteface<T> {...}
	
		
		
	//EXAMLE 1
		//NO Generic => compile => but error during run-time
//		Comparable c = new Date();
//		System.out.println(c.compareTo("Monday"));
//		
//		//GENERIC => during compile-time gets error (error in eclipse)
//		Comparable<Date> c2 = new Date();
//		System.out.println(c2.compareTo("Monday"));
		
	//EXAMPLE 2
		//The same as first with ArrayList
		//No Generic => no error during compile-time, only during run-time
//		ArrayList a = new ArrayList();
//		a.add(15);
//		a.add("15");
//		Integer b = (Integer) a.get(1); //run-time error casting
		
		//Generic => error during compile-time
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(12);
//		a.add("12");
//		Integer b = a.get(1);
		
	//EXAMPLE 3 - two parameters, Class OrderPair, Interface Pair, static method print
//		Pair<Integer, String> p1 = new OrderedPair<>(1,"apple");
//		Pair<String, Integer> p2 = new OrderedPair<>("banana", 2);
//		print(p1.getKey(), p1.getValue());
//		print(p2.getKey(), p2.getValue());
//		print("Happy", "Birtday");
		
	//EXAMPLE 4 - generic class Person, class Contact, class Employee
//		Person<Employee> e1 = new Person<>();
//		Person<Contact> c1 = new Person<>();
//		Employee e  = new Employee("John", "Slatery", "12345");
//		Contact c = new Contact("Alex", "Nikolic", "SRB", "123-456-789");
//		e1.setPerson(e);
//		c1.setPerson(c);
//		
//		System.out.println(e1.getPerson().toString());
//		System.out.println(c1.getPerson().toString());
		
	//EXAMPLE 5 - static method printPrint(), static method countGreaterThan()
		Integer[] ints = {10,20,30,40,50};
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday"};
		printPrint(ints);
		printPrint(days);
		System.out.println(countGreaterThan(ints, 30));
		
	//EXAMPLE 6 => interface GenericIntereface, class GenericList
		GenericClass<String> myString = new GenericClass<>();
		myString.add("Good Niddght!!!");
		System.out.println(myString);
		
	}
	
	
	//STATIC METHODS
	//WITH EXAMPLE 3
	public static<K,V> void print(K key, V value){
		System.out.println("key:" + key);
		System.out.println("value:" + value);
	}
	
	//WITH EXAMPLE 4
	public static <E> void printPrint(E[] list){
		for(E element:list){
			System.out.print(element+" ");
		}
		System.out.println("");
	}
	public static<E extends Comparable<E>> int countGreaterThan(E[] list, E elem){
		int count = 0;
		for(E element:list){
			if(element.compareTo(elem)>0)
				count++;
		}
		return count;
	}

}
