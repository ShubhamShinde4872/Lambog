package com.cjc.main.servicei;

import java.util.List;

import com.cjc.main.model.Product;

public interface Productservicei {

	Product saveProduct(Product product);

	List<Product> getAllProduct();

	Product getSingleData(int productId);

	Product updateProduct(Product product);

	void deleteProduct(int productId);

	

	

}
