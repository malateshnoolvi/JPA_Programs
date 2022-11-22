package com.xworkz.jewellery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import com.xworkz.jewellery.constants.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jewellery_details")
@NamedQuery(name = "findByShopNameAndId", query = "select entity from GoldJewelleryEntity entity where shopName=:sp and id=:mn")
@NamedQuery(name = "findShopNameById", query = "select entity.shopName from GoldJewelleryEntity entity where id=:mn")
@NamedQuery(name = "findMakingChargesByShopName", query = "select entity.makingCharge from GoldJewelleryEntity entity where shopName=:sp")
@NamedQuery(name = "findWastageChargesAndMakingChargesByShopName", query = "select entity.wastageCharge,entity.makingCharge from GoldJewelleryEntity entity where shopName=:sp")
@NamedQuery(name = "findTotalPriceByGramAndShopName", query = "select sum(goldPrice+gstPrice) from GoldJewelleryEntity entity where entity.shopName=:nm and entity.grams=:gm")
@NamedQuery(name = "getAll",query = "select entity from GoldJewelleryEntity entity")
@NamedQuery(name = "getAllShopName",query = "select entity.shopName from GoldJewelleryEntity entity")
@NamedQuery(name = "getAllShopNameAndType",query = "select entity.shopName,entity.type from GoldJewelleryEntity entity")
@NamedQuery(name = "findAllByWastageChargesLessThan",query = "select entity from GoldJewelleryEntity entity where entity.wastageCharge<:wc")
@NamedQuery(name = "findAllByMakingChargesGreaterThan",query = "select entity from GoldJewelleryEntity entity where entity.makingCharge>:mc")
@NamedQuery(name = "findAllByWastedChargesGreaterThanAndMakingChargesGreaterThan",query = "select entity from GoldJewelleryEntity entity where entity.makingCharge>:mc and entity.wastageCharge>:wc")
public class GoldJewelleryEntity {
	@Id
	@Min(0)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private Type type;
	@Min(1000)
	@Max(1000000)
	@Column(name = "goldPrice")
	private int price;
	@Min(1000)
	@Max(5000)
	@Column(name = "gstPrice")
	private int gstPrice;
	@Min(1)
	@Max(500)
	@Column(name = "grams")
	private double grams;
	@Min(500)
	@Max(5000)
	@Column(name = "makingCharges")
	private int makingCharge;
	@Min(500)
	@Max(5000)
	@Column(name = "wastageCharges")
	private int wastageCharge;
	@Column(name = "copper")
	private boolean copper;
	@NotNull
	@Size(min = 3, max = 30, message = "invalid type")
	@Column(name = "shopName")
	private String shopName;

	public GoldJewelleryEntity(@NotNull @Size(min = 3, max = 30, message = "invalid type") Type type,
			@Min(10000) @Max(100000) int price, @Min(1000) @Max(5000) int gstPrice, @Min(1) @Max(500) double grams,
			@Min(500) @Max(5000) int makingCharge, @Min(500) @Max(5000) int wastageCharge, boolean copper,
			@NotNull @Size(min = 3, max = 30, message = "invalid type") String shopName) {
		super();
		this.type = type;
		this.price = price;
		this.gstPrice = gstPrice;
		this.grams = grams;
		this.makingCharge = makingCharge;
		this.wastageCharge = wastageCharge;
		this.copper = copper;
		this.shopName = shopName;
	}
}
