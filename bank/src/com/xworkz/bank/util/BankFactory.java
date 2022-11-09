package com.xworkz.bank.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BankFactory {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("xworkz");
	}

}
