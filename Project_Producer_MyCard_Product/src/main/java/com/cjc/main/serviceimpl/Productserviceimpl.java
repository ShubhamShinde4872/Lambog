package com.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Product;
import com.cjc.main.repository.Productrepository;
import com.cjc.main.servicei.Productservicei;
@Service
public class Productserviceimpl  implements Productservicei{
      @Autowired private Productrepository productrepository;
	
	@Override
	public Product saveProduct(Product product) {
		
		Product productRef =productrepository.save(product);
		
		return productRef;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productrepository.findAll();
	}

	@Override
	public Product getSingleData(int productId) {
		
		return productrepository.findByProductId(productId);
	}

	@Override
	public Product updateProduct(Product product) {
		
		
		return productrepository.save(product);
		
	}

	@Override
	public void deleteProduct(int productId) {
		
		productrepository.deleteById(productId);
		
	}

}
