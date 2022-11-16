package com.xworkz.jewellery.constants;

public enum Type {

	RING("ring"), EARRING("earring"), NECKLESS("neckless"), BRACELET("bracelet"), LOCKET("locket"), CHAIN("chain"),
	BANGLE("bangle");

	private String value;

	private Type(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
