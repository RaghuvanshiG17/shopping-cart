package com.raghu.psc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raghu.psc.entity.ProductCategory;


public interface ProductCategoryService {
	List<ProductCategory> findAll();
}
