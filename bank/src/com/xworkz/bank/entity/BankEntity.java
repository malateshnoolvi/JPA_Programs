package com.xworkz.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bank_details")
public class BankEntity {
	public BankEntity(String name, String bankName, long acNo, String branch) {
		super();
		this.name = name;
		this.bankName = bankName;
		this.acNo = acNo;
		this.branch = branch;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "acNo")
	private long acNo;
	@Column(name = "branch")
	private String branch;

}
