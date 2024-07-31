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
@Table(name = "B2C_CLR")
@Setter
@Getter
public class Color {
	
	@Id
	private Integer id;
	private String name;
	private String code;
	@OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
	private Set<Product> product;
}
