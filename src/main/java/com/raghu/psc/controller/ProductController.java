package com.raghu.psc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.psc.entity.Product;
import com.raghu.psc.exception.B2CException;
import com.raghu.psc.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> product = productService.findAll();
		if (product == null || product.isEmpty()) {
			throw new B2CException("Product not found");
		}
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
	
	@GetMapping("/filter/{finter}/{value}")
	public ResponseEntity<List<Product>> getProduct(@PathVariable String filter,
			@PathVariable String value){
		List<Product> product = productService.findAll();
		if (product == null || product.isEmpty()) {
			throw new B2CException("Product not found");
		}
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
}
