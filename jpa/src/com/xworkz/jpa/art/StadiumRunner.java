package com.xworkz.jpa.art;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.service.StadiumService;
import com.xworkz.jpa.service.StadiumServiceImpl;

public class StadiumRunner {

	public static void main(String[] args) {
StadiumService service =new StadiumServiceImpl();
Optional<StadiumEntity> findById = service.findById(3);
if(findById.isPresent()) {
	System.out.println("id is present"+findById);
}else {
	System.out.println("id is not present");
}
	}

}
