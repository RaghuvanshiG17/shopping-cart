package com.raghu.psc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.psc.entity.ProductCategory;
import com.raghu.psc.service.ProductCategoryServiceImpl;

@RestController
@RequestMapping("/api/v1/productcategory")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryServiceImpl productCategoryService;
	
	@GetMapping
	public ResponseEntity<List<ProductCategory>> findAll(){
		List<ProductCategory> prdCategoryList = productCategoryService.findAll();
		return new ResponseEntity<List<ProductCategory>>(prdCategoryList,HttpStatus.OK);
	}
}
