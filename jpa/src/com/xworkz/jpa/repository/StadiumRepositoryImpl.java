package com.xworkz.jpa.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.jpa.entity.StadiumEntity;

public class StadiumRepositoryImpl implements StadiumRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(StadiumEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {
			System.out.println("running save method");
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
			//factory.close();
		}
		return true;
	}

	@Override
	public Optional<StadiumEntity> findById(int id) {
		EntityManager manager = factory.createEntityManager();
		StadiumEntity find = manager.find(StadiumEntity.class, id);
		if(find!=null) {
			
			return Optional.of(find);
		}

		return Optional.empty();
	}

}
