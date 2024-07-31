package com.raghu.psc.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "B2C_PDRCT_CTGR")
@Setter
@Getter
public class ProductCategory {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
	private Set<Product> product;
	
}
