package com.example.repository;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.AisleCategoryAtLocation;
import com.example.entity.AisleCategoryAtLocationPK;

public class AisleCategoryAtLocationRepositoryImpl implements AisleCategoryAtLocationRepositoryCustom {
	Logger log = Logger.getLogger(AisleCategoryAtLocationRepositoryImpl.class.getName());
	@Autowired
	private AisleCategoryAtLocationRepository aisleFinderForCategoryRepo;

	@Override
	public String customMethod(String locationid, String categoryid) {
		log.info("custom method handeling");
		return "custom method handeling";
	}

}
