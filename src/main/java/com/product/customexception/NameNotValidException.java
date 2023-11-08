package com.product.customexception;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.ProductEntity;

public class NameNotValidException extends Exception {
	
	public NameNotValidException(String a) {
		super(a);
	}
	

}
