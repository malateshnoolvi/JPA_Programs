package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.MetroEntity;

public interface MetroService {
	boolean validateAndSave(MetroEntity entity);
	
	Optional<MetroEntity> findById(int id);
}
