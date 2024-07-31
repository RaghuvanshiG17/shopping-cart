package com.raghu.psc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.psc.entity.Color;
import com.raghu.psc.repository.ColorRepository;

@Service
public class ColorServiceImpl implements ColorService{

	@Autowired
	ColorRepository colorRepository;
	
	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}

}
