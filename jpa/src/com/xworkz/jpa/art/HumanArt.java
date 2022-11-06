package com.xworkz.jpa.art;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.service.HumanServiceImpl;
import com.xworkz.jpa.service.Humanservice;

public class HumanArt {
	public static void main(String[] args) {
		
	
	HumanEntity entity1 = new HumanEntity(1, "chidanand", 25, "darkbrown", "male", 78, 5.7, true, false, false,
			"bagalkote", 1997, true, 20000, true);
	HumanEntity entity2 = new HumanEntity(2, "Raghvendra", 29, "brown", "male", 67, 5.8, true, true, false, "gadag",
			1994, true, 25000, true);
	HumanEntity entity3 = new HumanEntity(3, "Rohan", 24, "white", "male", 50, 5.7, true, false, false, "hubli", 1997,
			true, 22000, true);
	HumanEntity entity4 = new HumanEntity(4, "Sharath", 26, "white", "male", 6.1, 5.8, true, true, false, "malavalli",
			1997, true, 15000, true);
	HumanEntity entity5 = new HumanEntity(5, "Madhuchandra", 22, "white", "male", 78, 5.11, true, false, false,
			"shivmogga", 2000, true, 28000, true);
	
	Humanservice service=new HumanServiceImpl();
	service.validationandsave(entity1);
	service.validationandsave(entity2);
	service.validationandsave(entity3);
	service.validationandsave(entity4);
	service.validationandsave(entity5);
	

}
}