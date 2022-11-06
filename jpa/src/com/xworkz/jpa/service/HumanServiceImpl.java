package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repository.HumanRepository;
import com.xworkz.jpa.repository.HumanRepositoryImpl;

public class HumanServiceImpl implements Humanservice {

	HumanRepository repository = new HumanRepositoryImpl();

	@Override
	public boolean validationandsave(HumanEntity entity) {
		System.out.println("validation and savemethod running succesfully");
		int id = entity.getId();
		String name = entity.getName();
		int age = entity.getAge();
		String color = entity.getColor();
		String gender = entity.getGender();
		double weight = entity.getWeight();
		double height = entity.getHeight();
		boolean working = entity.isWorking();
		boolean married = entity.isMarried();
		boolean handicap = entity.isHandicap();
		String birthPlace = entity.getBirthPlace();
		int dateOfBirth = entity.getDateOfBirth();
		boolean educated = entity.isEducated();
		int salary = entity.getSalary();
		boolean alive = entity.isAlive();
		if (id > 0 && id < 200) {
			System.out.println("valid id");
		} else {
			return false;
		}
		if (name != null && name.length() > 3 && name.length() < 30) {
			System.out.println("valid name");
		} else {
			return false;
		}
		if (age > 0 && age < 100) {
			System.out.println("valid age");
		} else {
			return false;
		}
		if (color != null && color.length() > 3 && color.length() < 30) {
			System.out.println("valid color");
		} else {
			return false;
		}
		if (gender == "male" || gender == "female") {
			System.out.println("valid gender");
		} else {
			return false;
		}
		if (weight > 3 && weight < 200) {
			System.out.println("valid weight");
		} else {
			return false;
		}
		if (height > 0 && height < 10) {
			System.out.println("valid height");
		} else {
			return false;
		}
		if (birthPlace != null && birthPlace.length() > 3 && birthPlace.length() < 30) {
			System.out.println("valid birthplace");
		} else {
			return false;
		}
		if (salary > 10000 && salary < 100000) {
			System.out.println("valid salary");
			this.repository.save(entity);

		} else {
			return false;
		}

		return false;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {

		if (id > 0) {
			return repository.findById(id);
		}
		return Optional.empty();
	}

}
