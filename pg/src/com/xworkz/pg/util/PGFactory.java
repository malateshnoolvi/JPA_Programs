package com.xworkz.pg.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PGFactory {
	
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		
		
		return factory;
	}
	
	static {
		
		factory= Persistence.createEntityManagerFactory("com.xworkz");
	}

}
