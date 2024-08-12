package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cjc.main.model.Product;

public interface Productrepository  extends JpaRepository<Product, Integer>{

  	Product save(Product product);

	Product findByProductId(int productId);
	
	

}
