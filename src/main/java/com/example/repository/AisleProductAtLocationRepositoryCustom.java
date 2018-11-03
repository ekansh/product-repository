package com.example.repository;

import org.springframework.data.repository.query.Param;

import com.example.entity.AisleProductAtLocation;

public interface AisleProductAtLocationRepositoryCustom {
	String customMethod (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
	String findAisleForProduct (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
	String findAisleForProductAndCategory (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
	String findAisleForCategory (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
}
