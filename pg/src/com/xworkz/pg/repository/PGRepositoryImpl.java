package com.xworkz.pg.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

import com.xworkz.pg.entity.PGEntity;
import com.xworkz.pg.util.PGFactory;

public class PGRepositoryImpl implements PGRepository {

	EntityManagerFactory factory = PGFactory.getFactory();

	@Override
	public boolean save(PGEntity entity) {
		System.out.println("running save method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = null;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {

			transaction.rollback();

		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public Optional<PGEntity> findById(int id) {
		System.out.println("running read method");
		EntityManager manager = factory.createEntityManager();
		PGEntity find = manager.find(PGEntity.class, id);
		if (find != null) {
			return Optional.of(find);
		}
		return Optional.empty();
	}

	@Override
	public void save(List<PGEntity> list) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			for (PGEntity pgEntity : list) {
				manager.persist(pgEntity);
			}
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		finally {
			manager.close();
		}
	}

	@Override
	public void updateNameBuId(int id, String newName) {
		System.out.println("running update method");
		EntityManager manager = factory.createEntityManager();
		try {
			// EntityManager manager = factory.createEntityManager();

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			PGEntity find = manager.find(PGEntity.class, id);
			if (find != null) {
				find.setName(newName);
				manager.persist(find);
				transaction.commit();
			}
		} finally {
			manager.close();

		}
		PGRepository.super.updateNameBuId(id, newName);
	}

	@Override
	public void deleteById(int id) {
		System.out.println("running delete method");
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			PGEntity find = manager.find(PGEntity.class, id);
			if (find != null) {
				find.setId(id);
				manager.remove(find);
				transaction.commit();
			}

		} finally {
			manager.close();
		}

		PGRepository.super.deleteById(id);
	}

}
