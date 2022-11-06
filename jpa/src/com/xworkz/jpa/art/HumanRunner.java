package com.xworkz.jpa.art;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repository.HumanRepositoryImpl;
import com.xworkz.jpa.service.HumanServiceImpl;

public class HumanRunner {
	public static void main(String[] args) {

		HumanServiceImpl impl = new HumanServiceImpl();
		Optional<HumanEntity> findById = impl.findById(5);
		if (findById.isPresent()) {
			System.out.println(findById+" "+findById.isPresent());
	}else {
		System.out.println("entity is not present"+findById.isEmpty());
	}

}
}
