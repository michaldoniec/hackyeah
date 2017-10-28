package com.hackyeah.entity;

import java.math.BigDecimal;

/**
 * Created by michal on 28.10.17.
 */
public class Seller {
	private BigDecimal sellerId;
	private String name;
	private String address;
	private Integer taxId;

	public BigDecimal getSellerId() {
		return sellerId;
	}

	public void setSellerId(BigDecimal sellerId) {
		this.sellerId = sellerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
}
