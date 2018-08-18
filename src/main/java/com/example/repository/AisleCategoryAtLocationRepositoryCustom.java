package com.example.repository;


import org.springframework.data.repository.query.Param;


public interface AisleCategoryAtLocationRepositoryCustom {
	String customMethod (@Param("locationid") String locationid, @Param("categoryid") String categoryid);
}
