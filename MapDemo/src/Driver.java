import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		Utility u = new Utility();
		List<Product> pList = new ArrayList<>();
		pList.add(new Product(128,"Mobile Phone",24000d));
		pList.add(new Product(170,"Head Phone",4000d));
		pList.add(new Product(128,"Laptop",80000d));
		
		System.out.println("Products with price greater than 150000" +u.getProductName(pList));
		System.out.println("Sum of the price :"+u.getSum(pList));
		

	}

}
