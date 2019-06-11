package in.ac.sharda.pizzaapplication.data;

import java.util.HashMap;
import java.util.Map;

import in.ac.sharda.pizzaapplication.domain.Product;

public class Products {
	private Map<Integer, Product> products = new HashMap<>();
	private static final Products instance
						= new Products();
	private Products(){
		for(int i = 1; i < 20; i++){
			products.put(i, 
					new Product(i, i*10, 
							"Name "+i, "Desc "+i, i * 3));
		}
	}
	
	public static Products getInstance(){
		return instance;
	}
	
	public Map<Integer, Product> getProducts() {
		return products;
	}
	
}
