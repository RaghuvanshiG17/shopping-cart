package com.raghu.psc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.psc.entity.Brand;
import com.raghu.psc.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

}
