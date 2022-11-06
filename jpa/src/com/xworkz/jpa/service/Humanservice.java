package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface Humanservice {

	boolean validationandsave(HumanEntity entity);
	Optional<HumanEntity> findById(int id);


}
