
public class HashCodeExample {

	public static void main(String[] args) {

		Product product1 = new Product(1, "toyota", "gas car");
		
	    Product product2 = new Product(1, "toyota", "gas car"); // same as first object

	    Product product3 = new Product(2, "toyota", "gas car");
	    
	    //return true -objects are the same
	    System.out.println(product1.equals(product2));
	    
	    //return false - object are different (not all properties are the same)
	    System.out.println(product1.equals(product3));
	}

}
