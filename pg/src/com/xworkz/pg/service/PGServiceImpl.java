package com.xworkz.pg.service;

import java.util.Optional;

import com.xworkz.pg.entity.PGEntity;
import com.xworkz.pg.repository.PGRepository;
import com.xworkz.pg.repository.PGRepositoryImpl;

public class PGServiceImpl implements PGService {

	PGRepository repository = new PGRepositoryImpl();

	@Override
	public boolean validateAndSave(PGEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		int noOfRooms = entity.getNoOfRooms();
		String ownerName = entity.getOwnerName();
		String type = entity.getType();

		if (id > 0 && id < 1000) {
			System.out.println("valid id");
		} else {
			return false;
		}
		if (name != null && name.length() > 3 && name.length() < 30) {
			System.out.println("valid name");
		} else {
			return false;
		}
		if (noOfRooms > 0 && noOfRooms < 50) {
			System.out.println("valid noOfRooms");
		} else {
			return false;
		}
		if (ownerName != null && ownerName.length() > 3 && ownerName.length() < 30) {
			System.out.println("valid ownername");
		} else {
			return false;
		}
		if (type == "gents" || type == "ladies") {
			System.out.println("valid type");
			this.repository.save(entity);
		}
		return true;
	}

	@Override
	public Optional<PGEntity> findById(int id) {
		if(id>0) {
			return this.repository.findById(id);
		}
		return Optional.empty();
	}
	@Override
	public void updateNameBuId(int id, String newName) {
		if(id>0 &&newName!=null) {
		this.repository.updateNameBuId(id, newName);
		}
		
		PGService.super.updateNameBuId(id, newName);
	}
	@Override
	public void deleteById(int id) {
		if(id>0) {
			this.repository.deleteById(id);
		}
		PGService.super.deleteById(id);
	}

}
