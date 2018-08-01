package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AisleProductAtLocationPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long locationid;
	private Long productid;

	public AisleProductAtLocationPK() {

	}
	public AisleProductAtLocationPK(Long locationid,Long productid) {
		this.productid=productid;
		this.locationid=locationid;
	}	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		AisleProductAtLocationPK that = (AisleProductAtLocationPK) o;
		return Objects.equals(locationid, that.locationid) && Objects.equals(productid, that.productid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationid, productid);
	}
}
