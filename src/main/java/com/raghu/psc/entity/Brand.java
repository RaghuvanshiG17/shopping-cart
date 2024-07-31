package com.raghu.psc.entity;

import java.util.Set;


import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "B2C_BRND")
@Getter
@Setter
public class Brand {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
	private Set<Product> product;
	
	
}
