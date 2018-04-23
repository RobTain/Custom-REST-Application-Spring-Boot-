package com.robsoft.microservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@NotNull
	private int id;
	@NotNull
	private String name;
	@NotNull
	private double price;
	@NotNull
	private int quantity;
	@NotNull
	private String description;
	@NotNull
	private String photo;
	@NotNull
	private byte featured;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public byte getFeatured() {
		return featured;
	}
	public void setFeatured(byte featured) {
		this.featured = featured;
	}
	
}
