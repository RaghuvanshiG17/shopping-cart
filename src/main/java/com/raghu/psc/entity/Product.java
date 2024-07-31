package com.raghu.psc.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "B2C_PRDCT")
@Getter
@Setter
public class Product {
	
	@Id
	private Integer id;
	private String name;
	private Integer quantity;
	private String size;
	
	@Column(name = "BRND_ID")
	private Integer brandId;
	
	@Column(name = "CLR_ID")
	private Integer colorId;
	
	@Column(name = "PRDCT_CTGR_ID")
	private Integer categoryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BRND_ID", insertable = false, updatable = false)
	private Brand brand;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLR_ID", insertable = false, updatable = false)
	private Color color;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLR_ID", insertable = false, updatable = false)
	private ProductCategory productCategory;
	
}
