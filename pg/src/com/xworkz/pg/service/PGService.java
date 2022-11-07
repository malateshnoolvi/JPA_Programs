package com.xworkz.pg.service;

import java.util.Optional;

import com.xworkz.pg.entity.PGEntity;

public interface PGService {
	
	boolean validateAndSave(PGEntity entity);
	
	Optional<PGEntity> findById(int id);
	
	default	void updateNameBuId(int id,String newName){

    }
	default void deleteById(int id) {

	}
	

}
