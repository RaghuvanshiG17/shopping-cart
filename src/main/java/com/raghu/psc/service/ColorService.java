package com.raghu.psc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raghu.psc.entity.Color;


public interface ColorService {
	List<Color> findAll();
}
