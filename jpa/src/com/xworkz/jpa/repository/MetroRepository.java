package com.xworkz.jpa.repository;

import java.util.Optional;

import com.xworkz.jpa.entity.MetroEntity;

public interface MetroRepository {

	boolean save(MetroEntity entity);
	Optional<MetroEntity> findById(int id);
}
