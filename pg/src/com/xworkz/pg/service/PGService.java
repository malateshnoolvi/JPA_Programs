package com.xworkz.pg.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.pg.entity.PGEntity;

public interface PGService {

	boolean validateAndSave(PGEntity entity);

	default void save(List<PGEntity> list) {

	}

	Optional<PGEntity> findById(int id);

	default void updateNameBuId(int id, String newName) {

	}

	default void deleteById(int id) {

	}

}
