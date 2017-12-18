
public class GenericClass<T> implements GenericInterface<T>{

	public T myString;
	
	@Override
	public void add(T t) {
		myString = t;
	}

	@Override
	public String toString() {
		return "GenericClass [myList=" + myString + "]";
	}

	
}
