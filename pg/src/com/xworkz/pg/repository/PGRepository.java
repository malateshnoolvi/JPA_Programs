package com.xworkz.pg.repository;

import java.util.Optional;

import com.xworkz.pg.entity.PGEntity;

public interface PGRepository {

	boolean save(PGEntity entity);

	Optional<PGEntity> findById(int id);

	default void updateNameBuId(int id, String newName) {

	}

	default void deleteById(int id) {

	}
}
