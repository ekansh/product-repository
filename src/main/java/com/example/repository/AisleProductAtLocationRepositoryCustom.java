package com.example.repository;

import org.springframework.data.repository.query.Param;

import com.example.entity.AisleProductAtLocation;

public interface AisleProductAtLocationRepositoryCustom {
	String customMethod (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
}
