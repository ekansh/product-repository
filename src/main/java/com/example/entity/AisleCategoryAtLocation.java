package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class AisleCategoryAtLocation implements Serializable {
	/**
	 
	/
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AisleCategoryAtLocationPK id;

	@MapsId("categoryid")
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;

	@MapsId("locationid")
	@ManyToOne
	@JoinColumn(name = "locationid")
	private Location location;

	private String aisleName;
	private String description;

	public AisleCategoryAtLocation( Location location ,Category category) {
		this.category=category; 
		this .location= location;
		this.id = new AisleCategoryAtLocationPK(location.getLocationid(),category.getCategoryid());
	}
	public AisleCategoryAtLocation() {
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getAisleName() {
		return aisleName;
	}

	public void setAisleName(String aisleName) {
		this.aisleName = aisleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		AisleCategoryAtLocation that = (AisleCategoryAtLocation) o;
		return Objects.equals(category, that.category) && Objects.equals(location, that.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, location);
	}

}
