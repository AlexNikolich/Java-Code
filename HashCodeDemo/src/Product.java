
public class Product {

	private int id = 0;
	private String name;
	private String description;
	
	public Product(int id, String name, String description){
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(!(o instanceof Product)) 
			return false;
		Product product = (Product) o;
		if(this.name.equals(product.name) && 
				this.description.equals(product.description) &&
				this.id == product.id)
			return true;
		return false;	
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		result = result * 31 + ( id + name + description).hashCode();
		return result;
	}
	
	
}
