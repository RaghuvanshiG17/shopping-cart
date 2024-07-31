package com.raghu.psc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raghu.psc.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProduct(
			String groupByvalue,
			String actualValue);
}
