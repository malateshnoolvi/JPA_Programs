package com.xworkz.jewellery.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GoldJewelleryFactory {
	
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	
	static {
		 factory = Persistence.createEntityManagerFactory("xworkz");
	}

}
