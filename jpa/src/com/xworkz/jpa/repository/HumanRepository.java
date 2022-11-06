package com.xworkz.jpa.repository;

import java.util.Optional;

import com.google.protobuf.Option;
import com.xworkz.jpa.entity.HumanEntity;

public interface HumanRepository {
	
	boolean save(HumanEntity entity);
	Optional<HumanEntity> findById(int id);

}
