package com.xworkz.jpa.repository;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;

public interface StadiumRepository {
	
	boolean save(StadiumEntity entity);
	Optional<StadiumEntity> findById(int id);

}
