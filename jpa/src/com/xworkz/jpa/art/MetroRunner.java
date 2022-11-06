package com.xworkz.jpa.art;

import java.util.Optional;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.service.MetroService;
import com.xworkz.jpa.service.MetroServiceImpl;

public class MetroRunner {

	public static void main(String[] args) {
		MetroService service = new MetroServiceImpl();
		Optional<MetroEntity> findById = service.findById(2);
		if(findById.isPresent()) {
			System.out.println("entity is present"+findById);
		}else {
			System.out.println("entity is null");
		}
	}

}
