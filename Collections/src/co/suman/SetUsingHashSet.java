package co.suman;

import java.util.HashSet;
import java.util.Set;
import co.suman.product.*;

public class SetUsingHashSet {
public static void main(String[] args) {
	Set<product> products = new HashSet<product>();
	products.add(new product(1,"pen",25.3));
	products.add(new product(2,"glue",45.3));
	products.add(new product(3,"erasser",5.3));
	products.add(new product(1,"pen",25.3));
	products.add(new product(4,"book",25.3));
	System.out.println("Total product"+products.size());
	System.out.println(products);
	
}
}
