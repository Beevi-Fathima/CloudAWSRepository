import java.util.*;
import java.util.Map.Entry;
public class Source {
   public static void main(String[] args) {
	   Map<Integer,String> map = new TreeMap<>();
	   map.put(1001,"Subha");
	   map.put(1012, "Rahul");
	   map.put(1008,"Jenifer");
	   map.put(1003, "Manoj");
	   for(Entry<Integer,String> obj : map.entrySet()) {
		   System.out.println(obj.getKey()+" -> "+obj.getValue());
	   }
	   map.remove(1003);
	   for(Entry<Integer,String> obj : map.entrySet()) {
		   System.out.println(obj.getKey()+" -> "+obj.getValue());
	   }
	   map.put(1004, "Suhail");
	   System.out.println("==========Updated map============");
	   for(Entry<Integer,String> obj : map.entrySet()) {
		   System.out.println(obj.getKey()+" -> "+obj.getValue());
	   }
	   map.put(1001, "Ram");
	   for(Entry<Integer,String> obj : map.entrySet()) {
		   System.out.println(obj.getKey()+" -> "+obj.getValue());
	   }
	   
   }
}
