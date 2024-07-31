package com.raghu.psc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.psc.entity.Brand;
import com.raghu.psc.service.BrandServiceImpl;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandController {
	
	@Autowired
	BrandServiceImpl brandServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Brand>> findAll(){
		List<Brand> list = brandServiceImpl.findAll();
		return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
	}
	
}
