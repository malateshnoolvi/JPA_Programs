package com.xworkz.bank.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.util.BankFactory;

public class BankRepositoryImpl implements BankRepository {
	EntityManagerFactory factory = BankFactory.getFactory();

	@Override
	public boolean save(BankEntity entity) {
		System.out.println("running save method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			e.getStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public void save(List<BankEntity> list) {
		System.out.println("running save method......list");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			for (BankEntity bankEntity : list) {
				manager.persist(bankEntity);

			}
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}

	@Override
	public Optional<BankEntity> findById(int id) {
		System.out.println("running findId method");
		EntityManager manager = factory.createEntityManager();
		BankEntity find = manager.find(BankEntity.class, id);
		if (find != null) {
			return Optional.of(find);
		}

		return Optional.empty();
	}

	@Override
	public void updateNameById(int id, String newName) {
		System.out.println("running update method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BankEntity find = manager.find(BankEntity.class, id);
			if (find != null) {
				find.setName(newName);
				manager.persist(find);
				transaction.commit();

			}
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteById(int id) {
		System.out.println("running delete method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			
			transaction.begin();
			BankEntity find = manager.find(BankEntity.class, id);
			if (find != null) {
				manager.remove(find);
				transaction.commit();
				System.out.println("hdbvfhbsdjbhv");
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();

		} finally {
			manager.close();
		}
	}

}
