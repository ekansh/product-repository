package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.ForeignKey;


@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long locationid;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="storeid",foreignKey=@ForeignKey(name = "FK_STORE_LOCATION"))
	private Store store;
	private String address;
//	@ManyToMany(mappedBy="location")
//	private List<Category> categories;
//	@Transient
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="location")
	private List<AisleCategoryAtLocation> aisles;
//	private String image;
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
	public List<AisleCategoryAtLocation> getAisles() {
		return aisles;
	}
	public void setAisles(List<AisleCategoryAtLocation> aisles) {
		this.aisles = aisles;
	}
	public Long getLocationid() {
		return locationid;
	}
	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
