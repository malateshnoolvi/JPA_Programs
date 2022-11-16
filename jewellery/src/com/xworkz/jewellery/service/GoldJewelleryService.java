package com.xworkz.jewellery.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jewellery.entity.GoldJewelleryEntity;

public interface GoldJewelleryService {

	boolean validateAndSave(GoldJewelleryEntity entity);

	boolean save(List<GoldJewelleryEntity> list);

	default Optional<GoldJewelleryEntity> findByShopNameAndId(String name, int id) {
		return Optional.empty();

	}

	default Optional<String> findShopNameById(int id) {
		return Optional.empty();
	}

	default Optional<Integer> findMakingChargesByShopName(String name) {
		return Optional.empty();
	}

	default Optional<Object[]> findWastageChargesAndMakingChargesByShopName(String newName) {
		return Optional.empty();
	}
	default Optional<Integer> findTotalPriceByGramAndShopName(double gram, String shopName) {
		return Optional.empty();
	}
}
