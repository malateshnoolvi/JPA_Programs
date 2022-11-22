package com.xworkz.jewellery.art;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.xworkz.jewellery.constants.Type;
import com.xworkz.jewellery.entity.GoldJewelleryEntity;
import com.xworkz.jewellery.service.GoldJewelleryService;
import com.xworkz.jewellery.service.GoldJewelleryServiceImpl;

public class GoldJewelleryArt {

	public static void main(String[] args) {

		GoldJewelleryEntity jewelleryEntity1 = new GoldJewelleryEntity(Type.CHAIN, 400000, 1200, 20, 2000, 1000, true,
				"bheema");
		GoldJewelleryEntity jewelleryEntity2 = new GoldJewelleryEntity(Type.BANGLE, 450000, 1300, 21, 1500, 800, true,
				"kalyan");
		GoldJewelleryEntity jewelleryEntity3 = new GoldJewelleryEntity(Type.LOCKET, 600000, 1800, 30, 1700, 1200, true,
				"malabar");
		GoldJewelleryEntity jewelleryEntity4 = new GoldJewelleryEntity(Type.BRACELET, 700000, 2000, 35, 1600, 1500,
				true, "lalita");
		GoldJewelleryEntity jewelleryEntity5 = new GoldJewelleryEntity(Type.RING, 650000, 1800, 33, 2000, 1900, true,
				"jyoti");
		GoldJewelleryEntity jewelleryEntity6 = new GoldJewelleryEntity(Type.EARRING, 500000, 1000, 27, 1200, 1400, true,
				"tanisq");
		GoldJewelleryEntity jewelleryEntity7 = new GoldJewelleryEntity(Type.NECKLESS, 750000, 2000, 36, 1700, 1300,
				true, "mahalaxmi");
		GoldJewelleryService service = new GoldJewelleryServiceImpl();
		service.validateAndSave(jewelleryEntity1);
		service.validateAndSave(jewelleryEntity2);
		service.validateAndSave(jewelleryEntity3);
		service.validateAndSave(jewelleryEntity4);

		System.out.println("--------------------------------------------");

		List<GoldJewelleryEntity> list = new ArrayList<GoldJewelleryEntity>();
		list.add(jewelleryEntity5);
		list.add(jewelleryEntity6);
		list.add(jewelleryEntity7);
		service.save(list);

		System.out.println("----------------------------------------------");

		Optional<GoldJewelleryEntity> findByShopNameAndId = service.findByShopNameAndId("bheema", 1);
		if (findByShopNameAndId.isPresent()) {
			GoldJewelleryEntity objects = findByShopNameAndId.get();
			System.out.println(objects);
		} else {
			System.err.println("objects not found");
		}

		System.out.println("---------------------------------------------");

		Optional<String> nameById = service.findShopNameById(2);
		if (nameById.isPresent()) {
			String name = nameById.get();
			System.out.println(name);
		} else {
			System.err.println("name not found");
		}
		System.out.println("---------------------------------------------");

		Optional<Integer> makingChargesByShopName = service.findMakingChargesByShopName("malabar");
		if (makingChargesByShopName.isPresent()) {
			Integer charge = makingChargesByShopName.get();
			System.out.println(charge);
		} else {
			System.out.println("making charges not found");
		}
		System.out.println("--------------------------------------------");

		Optional<Object[]> findWastageChargesAndMakingChargesByShopName = service
				.findWastageChargesAndMakingChargesByShopName("mahalaxmi");
		if (findWastageChargesAndMakingChargesByShopName.isPresent()) {
			Object[] charges = findWastageChargesAndMakingChargesByShopName.get();
			System.out.println(charges[0] + " " + charges[1]);
		} else {
			System.out.println("charges is not found");
		}
		System.out.println("--------------------------------------------");
		Optional<Long> optional = service.findTotalPriceByGramAndShopName(35.00, "lalita");
		if (optional.isPresent()) {
			Long integer = optional.get();
			System.out.println(integer);
		} else {
			System.out.println("totalprice not found");
		}
		Collection<GoldJewelleryEntity> all = service.getAll();
		System.out.println(all);
		System.out.println("---------------------------------------------");

		Collection<String> allShopName = service.getAllShopName();
		System.out.println(allShopName);
		System.out.println("---------------------------------------------");

		Collection<Object[]> shopNameAndType = service.getAllShopNameAndType();
		for (Object[] objects2 : shopNameAndType) {
			System.out.println(objects2[0]);
			System.out.println(objects2[1]);// c
		}
		System.out.println("----------------------------------------------");

		Optional<Collection<GoldJewelleryEntity>> optional1 = service.findAllByWastageChargesLessThan(1500);
		if (optional1.isPresent()) {
			Collection<GoldJewelleryEntity> collection = optional1.get();
			System.out.println(collection);
		}
		System.out.println("-----------------------------------------------");
		Optional<Collection<GoldJewelleryEntity>> findAllByMakingChargesGreaterThan = service
				.findAllByMakingChargesGreaterThan(1200);
		if (findAllByMakingChargesGreaterThan.isPresent()) {
			Collection<GoldJewelleryEntity> collection = findAllByMakingChargesGreaterThan.get();
			System.out.println(collection);
		}

		System.out.println("-----------------------------------------------");

		Optional<Collection<GoldJewelleryEntity>> optional2 = service
				.findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan(1200, 2000);
		if (optional2.isPresent()) {
			Collection<GoldJewelleryEntity> collection = optional2.get();
			System.out.println(collection);
		}
		System.out.println("-----------------------------------------------");
	}

}
