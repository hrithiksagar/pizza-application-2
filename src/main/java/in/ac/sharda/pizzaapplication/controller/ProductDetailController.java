package in.ac.sharda.pizzaapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Product;
import in.ac.sharda.pizzaapplication.service.ProductService;

@RestController
public class ProductDetailController {
	@Autowired
	private ProductService productService;

	@GetMapping("/product/detail/{id}")
	public Product detail(@PathVariable("id") int id) {
		return productService.getProductById(id);
	}
}
