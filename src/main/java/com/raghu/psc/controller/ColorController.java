package com.raghu.psc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.psc.entity.Color;
import com.raghu.psc.service.ColorServiceImpl;

@RestController
@RequestMapping("/api/v1/color")
public class ColorController {
	
	@Autowired
	ColorServiceImpl colorService;
	
	@GetMapping
	public ResponseEntity<List<Color>> fileAll(){
		List<Color> colorList = colorService.findAll();
		return new ResponseEntity<List<Color>>(colorList, HttpStatus.OK);
	}
	
}
