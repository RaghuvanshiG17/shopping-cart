package com.raghu.psc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghu.psc.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
