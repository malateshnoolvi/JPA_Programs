package com.xworkz.bank.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.repository.BankRepository;
import com.xworkz.bank.repository.BankRepositoryImpl;

public class BankServiceImpl implements BankService {

	BankRepository repository = new BankRepositoryImpl();

	@Override
	public boolean validateAndSave(BankEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		String bankName = entity.getBankName();
		long acNo = entity.getAcNo();
		String branch = entity.getBranch();
		if (id >= 0 && id < 100) {
			System.out.println("valid id");
		} else {
			return false;
		}
		if (name != null && name.length() > 3 && name.length() < 30) {
			System.out.println("valid name");
		} else {
			return false;
		}
		if (bankName != null && bankName.length() > 3 && bankName.length() < 30) {
			System.out.println("valid bank name");
		} else {
			return false;
		}
		if (acNo > 999999999 && acNo < 99999999999l) {
			System.out.println("valid acNo");
		} else {
			return false;
		}
		if (branch != null && branch.length() > 3 && branch.length() < 30) {
			System.out.println("valid brach");
			this.repository.save(entity);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public void save(List<BankEntity> list) {
		if (list != null) {
			this.repository.save(list);
		}
	}

	@Override
	public Optional<BankEntity> findById(int id) {
		System.out.println(id > 0);
		if (id > 0) {
			return this.repository.findById(id);

		}
		return Optional.empty();
	}

	@Override
	public void updateNameById(int id, String newName) {
		if (id > 0 && newName != null) {
			this.repository.updateNameById(id, newName);
		}

	}

	@Override
	public void deleteById(int id) {
		if (id > 0) {
			System.out.println("jdvkvbb");
			this.repository.deleteById(id);
		}
	}

}
