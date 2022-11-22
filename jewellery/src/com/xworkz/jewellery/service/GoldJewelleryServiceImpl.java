package com.xworkz.jewellery.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.jewellery.entity.GoldJewelleryEntity;
import com.xworkz.jewellery.repository.GoldJewelleryRepository;
import com.xworkz.jewellery.repository.GoldJewelleryRepositoryImpl;

public class GoldJewelleryServiceImpl implements GoldJewelleryService {
	GoldJewelleryRepository repository = new GoldJewelleryRepositoryImpl();

	@Override
	public boolean validateAndSave(GoldJewelleryEntity entity) {

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<GoldJewelleryEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("invalid data");
		}
		return this.repository.validateAndSave(entity);
	}

	@Override
	public boolean save(List<GoldJewelleryEntity> list) {

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<List<GoldJewelleryEntity>>> validate = validator.validate(list);
		if (validate.size() > 0) {
			System.out.println("invalid data");
		}
		return this.repository.save(list);
	}

	@Override
	public Optional<GoldJewelleryEntity> findByShopNameAndId(String name, int id) {
		if (id > 0 && name != null) {
			return this.repository.findByShopNameAndId(name, id);
		}

		return Optional.empty();
	}

	@Override
	public Optional<String> findShopNameById(int id) {
		if (id > 0) {
			return this.repository.findShopNameById(id);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Integer> findMakingChargesByShopName(String name) {
		if (name != null) {
			return this.repository.findMakingChargesByShopName(name);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Object[]> findWastageChargesAndMakingChargesByShopName(String newName) {
		if (newName != null) {
			return this.repository.findWastageChargesAndMakingChargesByShopName(newName);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Long> findTotalPriceByGramAndShopName(double gram, String shopName) {
		if (gram > 0 && shopName != null) {
			return this.repository.findTotalPriceByGramAndShopName(gram, shopName);
		}
		return Optional.empty();
	}

	@Override
	public Collection<GoldJewelleryEntity> getAll() {
		return this.repository.getAll();
	}

	@Override
	public Collection<String> getAllShopName() {
	return this.repository.getAllShopName();
	}

	@Override
	public Collection<Object[]> getAllShopNameAndType() {
		return this.repository.getAllShopNameAndType();
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByWastageChargesLessThan(int charges) {
	if(charges>0) {
		 return this.repository.findAllByWastageChargesLessThan(charges);
	}
	return Optional.empty();
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByMakingChargesGreaterThan(int charges) {
		// TODO Auto-generated method stub
		return this.repository.findAllByMakingChargesGreaterThan(charges);
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan(
			int charges1, int charges2) {
		// TODO Auto-generated method stub
		return repository.findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan(charges1, charges2);
	}
}
