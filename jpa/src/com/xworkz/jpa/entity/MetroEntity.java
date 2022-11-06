package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "metro")
public class MetroEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "noOfPassengers")
	private int noOfPassengers;
	@Column(name = "maintenance")
	private boolean maintenance;
	@Column(name = "noOfMetros")
	private int noOfMetros;
	@Column(name = "color")
	private String color;
	@Column(name = "metroNo")
	private int metroNo;
	@Column(name = "camera")
	private boolean camera;
	@Column(name = "noOfStations")
	private int noOfStations;
	@Column(name = "security")
	private boolean security;

}
