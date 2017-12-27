import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionJava {
	
	public static void main(String[] args) {
		
	/*
	 ArrayList	- store objects
	 			- access using indexing
	 			- elements are store in sequence order
	 			- CONS add element in the middle or delete in the middle
	 			- CONS waste space if is not full
	 			- CONS need to be resized when they reach capacity
	 			
	 LinkedList	- uses pointers to keep tracks of elements
	 			- easily insert or delete element
	 			- CONS elements must be read sequentially
	 			- CONS elements are not stored sequentially in memory
	 			- CONS read 50 element, you need to red first 49
	 			- CONS slower iterations an extra memory overhead are required
	 			
	 Vector		- Very similar as ArrayList
	 			- automatically provides synchronization, which causes its performance to suffer
	 			
	 Stack		- last in , first out. Plates for meal
	 			- push() -> to add
	 			- pop() -> to remove
	 			
	 			
	 COLECTION INTERFACE ->
	 		SET->
	 			ThreeSet
	 			SortedSet
	 			HashSet
	 		List->
	 			Vector->Stack
	 			ArrayList
	 			LinkedList
	 		Queue
	 			PriorityQueue
	 			Dequeue
	 
	 
	- To return an array use toArray() method
 	- To convert from an array to a list use Arrays.toLIst() method
 	
 	ITERABLE INTERFACE
 		iterator() method
 			hasNext() -> checkis there another element
 			next() -> retrieve element
 			remove() -> remove element
 		foreach() method
 		
 	-I addition to the Iterable interface, there ia a ListIterator traverse the list backward (LinkedList)
 		previous(), hasPrevoious(), previuosIndex()

 	 			
	 */
	
	//Example 1 - Iterator
		Collection collection = Arrays.asList("red","orange","yellow","green","blue","indigo");
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	System.out.println("");
	//Example  - ListIterator - traverse the list backward
		LinkedList states = new LinkedList();
		states.add("Alaska");
		states.add("Arizona");
		states.add("Colorado");
		ListIterator iterator2 = states.listIterator(states.size());
		while(iterator2.hasPrevious()){
			System.out.println(iterator2.previous());
		}
		
	
	
	}
}
