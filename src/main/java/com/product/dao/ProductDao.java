package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.ProductEntity;
import com.product.repository.ProductRepository;
@Repository

public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String post(ProductEntity a) {
		pr.save(a);
		return "saved";
		
		
	}

	public String setAllValues(List<ProductEntity> b) {
		pr.saveAll(b);
		return "saved" ;
	}

	public List<ProductEntity> getValues() {
		return pr.findAll();
	}

	public String setValue(ProductEntity k) {
		// TODO Auto-generated method stub
		pr.save(k);
		return "done";
	}

}
