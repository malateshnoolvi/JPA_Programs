package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.constant.Type;
import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.repository.StadiumRepository;
import com.xworkz.jpa.repository.StadiumRepositoryImpl;

public class StadiumServiceImpl implements StadiumService {
	StadiumRepository repository = new StadiumRepositoryImpl();

	@Override
	public boolean validateAndSave(StadiumEntity entity) {
		System.out.println("running valid and save method");
		int id = entity.getId();
		String name = entity.getName();
		int foundedYear = entity.getFoundedYear();
		int capacity = entity.getCapacity();
		int entryFees = entity.getEntryFees();
		Type type = entity.getType();

		if (id > 0 && id < 50) {
			System.out.println("valid id");
		} else {
			return false;
		}
		if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("valid name");
		} else {
			return false;
		}
		if (foundedYear > 1900 && foundedYear < 2023) {
			System.out.println("valid foundedyear");
		} else {
			return false;
		}
		if (capacity > 200 && capacity < 50000) {
			System.out.println("valid capacity");
		} else {
			return false;
		}
		if (entryFees > 0 && entryFees < 5000) {
			System.out.println("valid entryfees");
		} else {
			return false;
		}
		if (type != null && type.equals(type)) {
			System.out.println("valid type");
			this.repository.save(entity);

		} else {
			System.err.println("invalid argument");
			return false;
		}
		return false;

	}

	@Override
	public Optional<StadiumEntity> findById(int id) {
		if (id > 0) {
			return this.repository.findById(id);
		}
		return Optional.empty();
	}
}
