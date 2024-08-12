package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;
import com.cjc.main.servicei.Productservicei;

@RestController
public class ProductController {
	
	@Autowired
	Productservicei productservicei;
	
	
	@PostMapping("/saveproduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product product)
	{
		Product productRef=productservicei.saveProduct(product);
		
		ResponseEntity<Product> response=new ResponseEntity<Product>(productRef,HttpStatus.CREATED);
		
		
		return response;
		
	}
	/*@GetMapping("/getallproductdatafromproduct")
	public ResponseEntity<List<Product>> getAllProduct()
	{
		
		List<Product> list=productservicei.getAllProduct();
		
		ResponseEntity<List<Product>> response= new ResponseEntity<List<Product>>(list, HttpStatus.OK);
		
		return response;
	}*/
	@GetMapping("/getsinglefromproduct/{productId}")
	public ResponseEntity<Product> getSingleData(@PathVariable("productId") int productId)
	{
		Product productRef=productservicei.getSingleData(productId);
		
		ResponseEntity<Product> response=new ResponseEntity<Product>(productRef, HttpStatus.OK);
		
		return response;
		
	}
	@PutMapping("/updatefromProduct/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) 
	{
		product.setProductId(productId);
		Product productRef= productservicei.updateProduct(product);
		
		ResponseEntity<Product> response=new ResponseEntity<Product>(productRef, HttpStatus.CREATED);
		
		return response;
		}
	@DeleteMapping("/deletefromproduct/{productId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("productId") int productId)
	{
		
		productservicei.deleteProduct(productId);
		
		ResponseEntity<Product> response=new ResponseEntity<Product>( HttpStatus.GONE);
		
		return response;
		
		//delete product from product
		//push on git
		
		
	}
	
	
}
