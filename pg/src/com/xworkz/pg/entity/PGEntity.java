package com.xworkz.pg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pg_details")

public class PGEntity {

	@Id
	private int id;
	private String name;
	private int noOfRooms;
	private String ownerName;
	private String type;

}
