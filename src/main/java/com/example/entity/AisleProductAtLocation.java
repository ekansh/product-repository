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
public class AisleProductAtLocation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AisleProductAtLocationPK id;

	@MapsId("productid")
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product product;

	@MapsId("locationid")
	@ManyToOne
	@JoinColumn(name = "locationid")
	private Location location;

	private String aisleName;
	private String description;

	public AisleProductAtLocation( Location location ,Product product) {
		this.product=product; 
		this .location= location;
		this.id = new AisleProductAtLocationPK(location.getLocationid(),product.getProductid());
	}
	public AisleProductAtLocation() {
	}

	public Product getProduct() {
		return product;
	}

	public void setProcuct(Product product) {
		this.product = product;
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

		AisleProductAtLocation that = (AisleProductAtLocation) o;
		return Objects.equals(product, that.product) && Objects.equals(location, that.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(product, location);
	}

}
