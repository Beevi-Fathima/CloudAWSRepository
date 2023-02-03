import java.util.*;

public class Product {

	private Integer id;
	String name;
	 Double price;
	
	public Product(Integer id,String name,Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {};
	
	public Integer getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Double getPrice() {
		return this.price;
	}
    
	public String toString() {
		return "Product [id = " +this.id+ " name = " +this.name+ " price = " +this.price+ "]";
	}

}
