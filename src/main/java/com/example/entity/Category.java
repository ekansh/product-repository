package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryid;
	private String name;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL,mappedBy="parentCategory")
	private List<Category> categories;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name ="parent_categoryid")
	private Category parentCategory;
//	@ManyToMany
//	@JoinTable(
//			name="CATEGORY_LOCATION",
//					joinColumns=
//					@JoinColumn(name="categoryid", referencedColumnName="categoryid",foreignKey=@ForeignKey(name = "FK_CATEGORY")),
//					inverseJoinColumns=
//					@JoinColumn(name="locationid", referencedColumnName="locationid",foreignKey=@ForeignKey(name = "FK_LOCATION"))			
//			)
//	private List<Location> location;
//	@Transient
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="category")
	private List<AisleCategoryAtLocation> aisleCategory;
	
	public List<AisleCategoryAtLocation> getAisleCategory() {
		return aisleCategory;
	}



	public void setAisleCategory(List<AisleCategoryAtLocation> aisleCategory) {
		this.aisleCategory = aisleCategory;
	}



	public void addCategories(Category c){
		if(categories == null){
			categories = new ArrayList<>();
		}
		c.setParentCategory(this);
		categories.add(c);
	}



	public Long getCategoryid() {
		return categoryid;
	}



	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Category> getCategories() {
		return categories;
	}



	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}



	public Category getParentCategory() {
		return parentCategory;
	}



	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}



//	public List<Location> getLocation() {
//		return location;
//	}
//
//
//
//	public void setLocation(List<Location> location) {
//		this.location = location;
//	}
 	
	
	
}
