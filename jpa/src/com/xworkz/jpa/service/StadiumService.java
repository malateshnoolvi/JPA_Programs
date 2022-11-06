package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;

public interface StadiumService {
	boolean validateAndSave(StadiumEntity entity);
	Optional<StadiumEntity> findById(int id);
}
