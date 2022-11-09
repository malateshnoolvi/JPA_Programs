package com.xworkz.bank.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.bank.entity.BankEntity;

public interface BankRepository {

	boolean save(BankEntity entity);

	void save(List<BankEntity> list);

	Optional<BankEntity> findById(int id);

	void updateNameById(int id, String newName);

	void deleteById(int id);

}
