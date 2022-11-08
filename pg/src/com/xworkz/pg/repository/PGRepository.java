package com.xworkz.pg.repository;

import java.util.Optional;
import java.util.List;

import com.xworkz.pg.entity.PGEntity;

public interface PGRepository {

	boolean save(PGEntity entity);
	
	default void save(List<PGEntity> list) {
		
	}

	Optional<PGEntity> findById(int id);

	default void updateNameBuId(int id, String newName) {

	}

	default void deleteById(int id) {

	}
}
