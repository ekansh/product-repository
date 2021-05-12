package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.AisleCategoryAtLocation;
import com.example.entity.AisleCategoryAtLocationPK;

@RepositoryRestResource(collectionResourceRel = "aisleCategoryAtLocationRepository", path = "aisleCategoryAtLocationRepository")
public interface AisleCategoryAtLocationRepository extends
		CrudRepository<AisleCategoryAtLocation, AisleCategoryAtLocationPK>, AisleCategoryAtLocationRepositoryCustom {
	public List<AisleCategoryAtLocation> findByAisleName(@Param("name") String aisleName);
	/**
	 Id is the embedded key ,to get access locationid and category id which are part of embedded key 
	 we use IdLocationidAndIdCategoryId
	 @see http://localhost:8080/aisleCategoryAtLocationRepository/search/findByIdLocationidAndIdCategoryid?locationid=5&categoryid=2
	 @see https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-property-expressions
	 @see https://stackoverflow.com/questions/43865079/spring-jpa-find-by-embeddedid-partially/43882807
	 @param locationid
	 @param categoryid
	 @return
	/
	public List<AisleCategoryAtLocation> findByIdLocationidAndIdCategoryid
	(@Param("locationid") Long locationid,@Param("categoryid") Long categoryid);

}
