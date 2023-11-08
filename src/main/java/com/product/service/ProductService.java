
package com.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.customexception.NameNotValidException;
import com.product.dao.ProductDao;
import com.product.entity.ProductEntity;
@Service

public class ProductService {
	@Autowired
	ProductDao ps;
	

	public String post(ProductEntity a) {
		
		return ps.post(a) ;
	}


	public String setAllValues(List<ProductEntity> b) {
		
		return ps.setAllValues(b);
	}


	public List<ProductEntity> getValues() {
		
		return ps.getValues();
	}


	public List<ProductEntity> getProduct(String a) {
		
		List<ProductEntity> ab = getValues();
		List<ProductEntity> bd = ab.stream().filter(x->x.getName().equals(a)).collect(Collectors.toList());
		return bd;
	}


	


	public List<ProductEntity> getValue(int x, int y) {
		List<ProductEntity> bc = getValues();
		List<ProductEntity> cd = bc.stream().filter(ps->ps.getPrice()> x && ps.getPrice()<y).collect(Collectors.toList());
		return cd;
	}


	public String setValue(ProductEntity q) throws NameNotValidException {
		try {
		if(q.getName().equalsIgnoreCase("sethupathi")) {
			
	 throw new NameNotValidException("not a product");
	}
		else {
			return ps.setValue(q);
		}
		}
		catch(NameNotValidException k) {
		return ("not a proper name");
		
		}
		
	/*public String setAllValue(List<ProductEntity> ps)throws NameNotValidException {
		List<ProductEntity> ab = ps.stream().filter(x->!x.getName().equalsIgnoreCase("sethupathi")).toList();
		if(ab.isEmpty()) {
			return pd.ssetAllValue(ab);
		}
		else {
			throw new NameNotValidException("give a proper product");
		}
	}*/

}
	}
