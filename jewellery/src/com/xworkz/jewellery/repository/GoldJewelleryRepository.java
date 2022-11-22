package com.xworkz.jewellery.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.xworkz.jewellery.entity.GoldJewelleryEntity;

public interface GoldJewelleryRepository {

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

	default Optional<Long> findTotalPriceByGramAndShopName(double gram, String shopName) {
		return Optional.empty();
	}
	List<GoldJewelleryEntity> getAll();
	
	Collection<String> getAllShopName();

	Collection<Object[]> getAllShopNameAndType();
	
	Optional<Collection<GoldJewelleryEntity>> findAllByWastageChargesLessThan(int charges);
	
	Optional<Collection<GoldJewelleryEntity>> findAllByMakingChargesGreaterThan(int charges);
	Optional<Collection<GoldJewelleryEntity>> findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan(int charges1,int charges2);


	
	
	
	
	

}
