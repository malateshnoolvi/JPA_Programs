package com.xworkz.jpa.art;

import com.xworkz.jpa.constant.Type;
import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.service.StadiumService;
import com.xworkz.jpa.service.StadiumServiceImpl;

public class StadiumArt {

	public static void main(String[] args) {
		StadiumEntity entity1 = new StadiumEntity(1, "chinnaswamy stadium", 1969, 40000, 2000, Type.CRICKET);
		StadiumEntity entity2 = new StadiumEntity(2, "koramangala indoor stadium", 1997, 2000, 500, Type.TENNIS);
		StadiumEntity entity3 = new StadiumEntity(3, "Anna stadium", 1970, 20000, 1000, Type.HOCKEY);
		StadiumEntity entity4 = new StadiumEntity(4, "banglore football stadium", 1980, 15000, 1500, Type.FOOTBALL);
		StadiumEntity entity5 = new StadiumEntity(5, "wankhede stadium", 1969, 33000, 2000, Type.CRICKET);
		StadiumService service = new StadiumServiceImpl();
		service.validateAndSave(entity1);
		service.validateAndSave(entity2);
		service.validateAndSave(entity3);
		service.validateAndSave(entity4);
		service.validateAndSave(entity5);
	}

}
