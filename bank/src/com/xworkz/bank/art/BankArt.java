package com.xworkz.bank.art;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.service.BankService;
import com.xworkz.bank.service.BankServiceImpl;

public class BankArt {
	public static void main(String[] args) {

		BankEntity entity1 = new BankEntity("rohan", "union bank", 78954789546l, "hubli");
		BankEntity entity2 = new BankEntity("chidu", "canara bank", 95045781412l, "bagalakot");
		BankEntity entity3 = new BankEntity("manoj", "SBI bank", 78954789546l, "maddur");
		BankEntity entity4 = new BankEntity("Raghu", "KVG bank", 85656565855l, "gadag");
		BankEntity entity5 = new BankEntity("darshan", "Yes bank", 51684651698l, "channapatnna");
		BankEntity entity6 = new BankEntity("mahesh", "ICICI bank", 87684668622l, "balagavi");
		BankEntity entity7 = new BankEntity("basu", "IDBI bank", 64885668437l, "haveri");

		BankService service = new BankServiceImpl();
//		service.validateAndSave(entity1);
//		service.validateAndSave(entity2);
//		service.validateAndSave(entity3);
//		service.validateAndSave(entity4);
//		service.validateAndSave(entity5);
//		System.out.println("manoj");

//		List<BankEntity> list = new ArrayList<>();
//		list.add(entity6);
//		list.add(entity7);
//
//		System.out.println(list);
//		service.save(list);

//		Optional<BankEntity> findById = service.findById(5);
//
//		if (findById.isPresent()) {
//			System.out.println("id is found" + findById);
//		} else {
//			System.err.println("id is not found");
//		}

	//	service.updateNameById(6, "sharath");
		
		service.deleteById(4);
	}
}
