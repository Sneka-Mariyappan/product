package com.product.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductEntity;
import com.product.service.ProductService;


@RestController

public class ProductController {
	
		@Autowired
		ProductService ps;
		
		static Logger log = Logger.getLogger(ProductController.class);
		
		
		/*@PostMapping(path="/set")
		public String post(@RequestBody ProductEntity a) {
			return ps.post(a);
		}*/
		
		
		@PostMapping(path="/set1")
		public String setAllValues(@RequestBody List<ProductEntity> b) {
			PropertyConfigurator.configure("log4j.properties");
			log.info(ps.setAllValues(b));
			return ps.setAllValues(b);
			
		}
		@GetMapping(path="/set2")
		public List <ProductEntity> getValues() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(ps.getValues());
		return ps.getValues();
		
		}
}

		/*@GetMapping(path="/getProductByName/{x}") 
		public List <ProductEntity> getProduct(@PathVariable String x) {
			return ps.getProduct(x);
		}
		
@GetMapping(path="getValue/{a}/{b}") 
public List <ProductEntity> getValue(@PathVariable int a , @PathVariable int b) {
	return ps.getValue(a,b);
}


@PostMapping(path="/setData")
public String setValue(@RequestBody ProductEntity p) throws NameNotValidException {
	return ps.setValue(p);
}
@PostMapping(path="/setData1") 
public String setAllValue(@RequestBody List<ProductEntity> kkk) throws NameNotValidException {
	return ps.setAllValues(kkk);
}

//rest template
@GetMapping(path="/set3")
public String setName() {
	return "Hello Sneha";
}
	
	
	@GetMapping(path="/set4/{a}/{b}"
			+ "")
	public int findAdd(@PathVariable int a, @PathVariable int b) {
		return a+b;
	}*/










