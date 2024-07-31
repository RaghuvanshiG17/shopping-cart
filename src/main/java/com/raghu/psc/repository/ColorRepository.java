package com.raghu.psc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghu.psc.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color,Integer>{

}
