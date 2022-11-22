package com.xworkz.jewellery.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.ObjDoubleConsumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.xworkz.jewellery.entity.GoldJewelleryEntity;
import com.xworkz.jewellery.util.GoldJewelleryFactory;

public class GoldJewelleryRepositoryImpl implements GoldJewelleryRepository {
	EntityManagerFactory factory = GoldJewelleryFactory.getFactory();

	@Override
	public boolean validateAndSave(GoldJewelleryEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public boolean save(List<GoldJewelleryEntity> list) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			for (GoldJewelleryEntity goldJewelleryEntity : list) {
				System.out.println(goldJewelleryEntity);
				manager.persist(goldJewelleryEntity);

			}
			transaction.commit();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public Optional<GoldJewelleryEntity> findByShopNameAndId(String name, int id) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByShopNameAndId");
		query.setParameter("sp", name);
		query.setParameter("mn", id);
		Object singleResult = query.getSingleResult();
		GoldJewelleryEntity array = (GoldJewelleryEntity) singleResult;
		return Optional.of(array);
	}//mnmn

	@Override
	public Optional<String> findShopNameById(int id) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findShopNameById");
		query.setParameter("mn", id);
		Object singleResult = query.getSingleResult();
		String name = (String) singleResult;
		return Optional.of(name);
	}

	public Optional<Integer> findMakingChargesByShopName(String name) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMakingChargesByShopName");
		query.setParameter("sp", name);
		Object singleResult = query.getSingleResult();
		Integer charge = (Integer) singleResult;
		return Optional.of(charge);
	}

	@Override
	public Optional<Object[]> findWastageChargesAndMakingChargesByShopName(String newName) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findWastageChargesAndMakingChargesByShopName");
		query.setParameter("sp", newName);
		Object singleResult = query.getSingleResult();
		Object[] charges = (Object[]) singleResult;
		return Optional.of(charges);
	}

	@Override
	public Optional<Long> findTotalPriceByGramAndShopName(double gram, String shopName) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotalPriceByGramAndShopName");
		query.setParameter("gm", gram);
		query.setParameter("nm", shopName);
		Object singleResult = query.getSingleResult();
		Long totalPrice = (Long) singleResult;
		return Optional.of(totalPrice);
	}

	@Override
	public List<GoldJewelleryEntity> getAll() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("getAll");
		List resultList = query.getResultList();

		return resultList;
	}

	@Override
	public Collection<String> getAllShopName() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("getAllShopName");
		List resultList = query.getResultList();
		return resultList;
	}

	@Override
	public Collection<Object[]> getAllShopNameAndType() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("getAllShopNameAndType");
		List resultList = query.getResultList();
		return resultList;
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByWastageChargesLessThan(int charges) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllByWastageChargesLessThan");
		query.setParameter("wc", charges);
		List resultList = query.getResultList();
		
		
		return Optional.of(resultList);
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByMakingChargesGreaterThan(int charges) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllByMakingChargesGreaterThan");
		query.setParameter("mc", charges);
		List resultList = query.getResultList();
		return Optional.of(resultList);
	}

	@Override
	public Optional<Collection<GoldJewelleryEntity>> findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan(
			int charges1, int charges2) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan");
		query.setParameter("mc", charges1);
		query.setParameter("wc", charges2);
		List resultList = query.getResultList();
		
		return Optional.of(resultList);
	}

}
