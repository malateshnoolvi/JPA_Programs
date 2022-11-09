package com.xworkz.bank.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.bank.entity.BankEntity;

public interface BankService {
	
	boolean validateAndSave (BankEntity entity);

	void save(List<BankEntity> list);

	Optional<BankEntity> findById(int id);

	void updateNameById(int id, String newName);

	void deleteById(int id);

}
