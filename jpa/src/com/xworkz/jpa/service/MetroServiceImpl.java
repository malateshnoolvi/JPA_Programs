package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.repository.MetroRepository;
import com.xworkz.jpa.repository.MetroRepositoryImpl;

public class MetroServiceImpl implements MetroService{
	
	MetroRepository repository=new MetroRepositoryImpl();

	@Override
	public boolean validateAndSave(MetroEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		int noOfPassengers = entity.getNoOfPassengers();
		boolean maintenance = entity.isMaintenance();
		int noOfMetros = entity.getNoOfMetros();
		String color = entity.getColor();
		int metroNo = entity.getMetroNo();
		boolean camera = entity.isCamera();
		int noOfStations = entity.getNoOfStations();
		boolean security = entity.isSecurity();
		
		if(id>0&& id<20) {
			System.out.println("valid id");
		}else {
			return false;
		}
		if(name!=null &&name.length()>3&& name.length()<30) {
			System.out.println("valid name");
		}else {
			return false;
		}
		if(noOfPassengers>0&& noOfPassengers<2000) {
			System.out.println("valid noofpassengers");
		}else {
			return false;
		}
		if(maintenance==true||maintenance==false) {
			System.out.println("valid maintenance");
		}else {
			return false;
		}
		if(noOfMetros>0&& noOfMetros<5) {
			System.out.println("valid noofmetros");
		}else {
			return false;
		}
		if(color!=null &&color.length()>3&& color.length()<30) {
			System.out.println("valid color");
		}else {
			return false;
		}
		if(metroNo>0&& metroNo<10000) {
			System.out.println("valid metrono");
		}else {
			return false;
		}
		if(camera==true||camera==false) {
			System.out.println("valid camera");
		}else {
			return false;
		}
		if(noOfStations>0&&noOfStations<30) {
			System.out.println("valid noOfstations");
		}else {
			return false;
		}
		if(camera==true||camera==false) {
			System.out.println("valid camera");
			this.repository.save(entity);
		}else {
			return false;
		}
		
		
		
		return true;
	}

	@Override
	public Optional<MetroEntity> findById(int id) {
		
		if(id>0) {
			return this.repository.findById(id);
		}
		return Optional.empty();
	}


}
