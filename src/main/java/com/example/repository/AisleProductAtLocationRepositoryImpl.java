package com.example.repository;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.AisleProductAtLocation;
import com.example.entity.AisleProductAtLocationPK;

public class AisleProductAtLocationRepositoryImpl implements AisleProductAtLocationRepositoryCustom{
	Logger log = Logger.getLogger(AisleProductAtLocationRepositoryImpl.class.getName());
	@Autowired
	private AisleProductAtLocationRepository aisleFindeForProductrRepo;
	public AisleProductAtLocationRepository getAisleFindeForProductrRepo() {
		return aisleFindeForProductrRepo;
	}
	public void setAisleFindeForProductrRepo(AisleProductAtLocationRepository aisleFindeForProductrRepo) {
		this.aisleFindeForProductrRepo = aisleFindeForProductrRepo;
	}
	@Override
	public String customMethod(String locationid, String categoryid) {
		return locationid+"::"+categoryid;
	}
	

}
