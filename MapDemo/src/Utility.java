import java.util.*;

public class Utility {
   //Product p = new Product();
   public Map<String,List<Product>> getProductName(List<Product> products){
	   Map<String,List<Product>> map = new HashMap<>();
	  // products = new ArrayList<>();
	   int count = 0;
	   for(Product p : products) {
		   
		   if(p.getPrice() > 15000) {
			   map.put(p.getName(),products);
		   }
//		   if(count == products.size()-1) {
//			   break;
//		   }
//		   else
//		      count ++;
	   }
	   
	   return map;
   }
   public Map<String,Double> getSum(List<Product> products){
	   Map<String,Double> map = new HashMap<>();
	   Double sum = 0d;
	   for(Product p : products) {
		   if(map.containsKey(p.getName()))
		       map.put(p.getName(),sum += p.getPrice());
		   else
			   map.put(p.getName(), p.getPrice());
		   
	   }
	   return map;
	   
   }
}
