package com.xworkz.jpa.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.util.JPAUtil;

public class HumanRepositoryImpl implements HumanRepository {
	EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public boolean save(HumanEntity entity) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();

		return true;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {
		EntityManager manager = factory.createEntityManager();
		HumanEntity find = manager.find(HumanEntity.class, id);
		if (find != null) {

			return Optional.of(find);

		}

		return Optional.empty();
	}

}
