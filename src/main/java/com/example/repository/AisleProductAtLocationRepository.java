package com.example.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.AisleProductAtLocation;
import com.example.entity.AisleProductAtLocationPK;

@RepositoryRestResource(collectionResourceRel = "aisleProductAtLocationRepository", path = "aisleProductAtLocationRepository")
public interface AisleProductAtLocationRepository extends CrudRepository<AisleProductAtLocation, AisleProductAtLocationPK>, AisleProductAtLocationRepositoryCustom {
	public List<AisleProductAtLocation> findByAisleName(@Param("name") String aisleName);
	/**
	 Id is the embedded key ,to get access locationid and productid which are part of embedded key 
	 we use IdLocationidAndIdProductId
	 @see http://localhost:8080/aisleProductAtLocationRepository/search/findByIdLocationidAndIdProductid?locationid=5&productid=1
	 @see https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-property-expressions
	 @see https://stackoverflow.com/questions/43865079/spring-jpa-find-by-embeddedid-partially/43882807
	 @param locationid
	 @param categoryid
	 @return
	/
	public List<AisleProductAtLocation> findByIdLocationidAndIdProductid
	(@Param("locationid") Long locationid,@Param("productid") Long productid);

	 @Query("Select pa from AisleProductAtLocation pa where pa.location.locationid=:locationid and pa.product.productid=:productid")
	 List<AisleProductAtLocation> getProductAisle(@Param("locationid") Long locationid , @Param("productid") Long productid);
}
