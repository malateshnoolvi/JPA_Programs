package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "human")

public class HumanEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "color")
	private String color;
	@Column(name = "gender")
	private String gender;
	@Column(name = "weight")
	private double weight;
	@Column(name = " height")
	private double height;
	@Column(name = "working")
	private boolean working;
	@Column(name = " married")
	private boolean married;
	@Column(name = "handicap")
	private boolean handicap;
	@Column(name = "birthPlace")
	private String birthPlace;
	@Column(name = "dateOfBirth")
	private int dateOfBirth;
	@Column(name = "educated")
	private boolean educated;
	@Column(name = "salary")
	private int salary;
	@Column(name = "alive")
	private boolean alive;

}
