package in.ac.sharda.pizzaapplication.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Product;
import in.ac.sharda.pizzaapplication.service.ProductService;

@RestController
public class ProductListController {

	@Autowired
	private ProductService productService;

	@GetMapping("product/list")
	public Collection<Product> products(){
		return productService.getProducts();
	}
}
