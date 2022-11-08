package com.xworkz.pg.art;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.xworkz.pg.entity.PGEntity;
import com.xworkz.pg.service.PGService;
import com.xworkz.pg.service.PGServiceImpl;

public class PGArt {

	public static void main(String[] args) {

		PGEntity entity1 = new PGEntity(1, "krishna", 25, "balu", "gents");
		PGEntity entity2 = new PGEntity(2, "naveen", 29, "ramu", "gents");
		PGEntity entity3 = new PGEntity(3, "balaji", 20, "ramesh", "ladies");
		PGEntity entity4 = new PGEntity(4, "adarsh", 28, "basu", "gents");
		PGEntity entity5 = new PGEntity(5, "keshav", 30, "manoj", "ladies");
		PGEntity entity6 = new PGEntity(6, "anand", 34, "raghu", "ladies");
		PGEntity entity7 = new PGEntity(7, "keshav", 31, "rohan", "gents");
		PGEntity entity8 = new PGEntity(8, "keshav", 32, "darshan", "ladies");

		PGService service = new PGServiceImpl();
		service.validateAndSave(entity1);
		service.validateAndSave(entity2);
		service.validateAndSave(entity3);
		service.validateAndSave(entity4);
		service.validateAndSave(entity5);

		System.out.println("-----------------------------------------");

		Optional<PGEntity> findById = service.findById(3);
		if (findById.isPresent()) {
			System.out.println("id is found" + findById);
		} else {
			System.out.println("id is not found");
		}
		System.out.println("-----------------------------------------");

		service.updateNameBuId(4, "shiva");

		System.out.println("-----------------------------------------");
		service.deleteById(5);

		System.out.println("-----------------------------------------");

		List<PGEntity> list = new ArrayList<>();
		list.add(entity6);
		list.add(entity7);
		list.add(entity8);

		service.save(list);

	}

}
