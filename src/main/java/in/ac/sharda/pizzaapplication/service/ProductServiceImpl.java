package in.ac.sharda.pizzaapplication.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.ac.sharda.pizzaapplication.data.Products;
import in.ac.sharda.pizzaapplication.domain.Product;

@Service
public class ProductServiceImpl 
				implements ProductService{
	private Map<Integer,Product>
			products = Products
			.getInstance().getProducts();
	
	
	
	public Product getProductById(int id){
		return products.get(id);
	}

	@Override
	public Collection<Product> getProducts() {
		return products.values();
	}
	
	
}
