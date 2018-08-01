package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AisleCategoryAtLocationPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long locationid;
	private Long categoryid;

	public AisleCategoryAtLocationPK() {

	}
	public AisleCategoryAtLocationPK(Long locationid,Long categoryid) {
		this.categoryid=categoryid;
		this.locationid=locationid;
	}	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		AisleCategoryAtLocationPK that = (AisleCategoryAtLocationPK) o;
		return Objects.equals(locationid, that.locationid) && Objects.equals(categoryid, that.categoryid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationid, categoryid);
	}
}
