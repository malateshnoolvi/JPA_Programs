package com.xworkz.jpa.repository;

import java.util.Optional;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.util.JPAUtil;

public class MetroRepositoryImpl implements MetroRepository {

	EntityManagerFactory factory = JPAUtil.getFactory();


	@Override
	public boolean save(MetroEntity entity) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public Optional<MetroEntity> findById(int id) {
	EntityManager manager = factory.createEntityManager();
	MetroEntity find = manager.find(MetroEntity.class, id);
	if(find!=null) {
		return Optional.of(find);
	}
  
		
		return Optional.empty();
	}

}
