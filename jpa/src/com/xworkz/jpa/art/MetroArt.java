package com.xworkz.jpa.art;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.service.MetroService;
import com.xworkz.jpa.service.MetroServiceImpl;

public class MetroArt {

	public static void main(String[] args) {

		MetroEntity entity1 = new MetroEntity(1, "namma metro", 1000, true, 4, "green", 2345, true, 24, true);
		MetroEntity entity2 = new MetroEntity(2, "namma metro", 1200, true, 4, "purple", 4523, true, 23, true);
	
		MetroService service=new MetroServiceImpl();
		service.validateAndSave(entity1);
		service.validateAndSave(entity2);
		
	
	}

}
