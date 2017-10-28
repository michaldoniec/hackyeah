package com.hackyeah.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;


public class Offer {
	private BigDecimal offerId;
	private String price;
	private String title;
	private String description;
	private LocalDate dateOfSale;
	private Boolean hasVat;
	private Boolean hasVatWithMargin;
	private Boolean isNewProduct;
	private Boolean isVatFree;
	private BigInteger sellerId;


	public BigDecimal getOfferId() {
		return offerId;
	}

	public void setOfferId(BigDecimal offerId) {
		this.offerId = offerId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(LocalDate dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public BigInteger getSellerId() {
		return sellerId;
	}

	public void setSellerId(BigInteger sellerId) {
		this.sellerId = sellerId;
	}

	public Boolean getHasVat() {
		return hasVat;
	}

	public void setHasVat(Boolean hasVat) {
		this.hasVat = hasVat;
	}

	public Boolean getHasVatWithMargin() {
		return hasVatWithMargin;
	}

	public void setHasVatWithMargin(Boolean hasVatWithMargin) {
		this.hasVatWithMargin = hasVatWithMargin;
	}

	public Boolean getNewProduct() {
		return isNewProduct;
	}

	public void setNewProduct(Boolean newProduct) {
		isNewProduct = newProduct;
	}

	public Boolean getVatFree() {
		return isVatFree;
	}

	public void setVatFree(Boolean vatFree) {
		isVatFree = vatFree;
	}
}
